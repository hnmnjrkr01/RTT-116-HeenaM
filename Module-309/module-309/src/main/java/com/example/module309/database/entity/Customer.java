package com.example.module309.database.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "customers")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    //-------------------One Employee has MANY Customers Relationship-------------------------
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "sales_rep_employee_id")               //This annotation is used only for foreing key
    @ToString.Exclude
    @JsonIgnore
    private Employee employee;

    // because of this relationship foreign key is now read only set function wont work for this column
    @Column(name = "sales_rep_employee_id", insertable = false, updatable = false)
    private Integer salesRepEmployeeId;

    //-------------------One Customer has MANY Orders Relationship-------------------------
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Order> orders;


    //-------------------One Customer has MANY Payments Relationship-------------------------
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Payment> customerPayments;


    //------------------------------------------------------------------------------------

    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "contact_lastname")
    private String contactLastname;

    @Column(name = "contact_firstname")
    private String contactFirstname;

    @Column(name = "phone")
    private String phone;

    @Column(name = "address_line1")
    private String addressLine1;

    @Column(name = "address_line2")
    private String addressLine2;

    @Column(name = "city")
    private String city;

    @Column(name = "state")
    private String state;

    @Column(name = "postal_code" )
    private String postalCode;

    @Column(name = "country")
    private String country;

    @Column(name = "credit_limit", columnDefinition = "DECIMAL")
    private Double creditLimit;

    @Column(name="img_url")
    private String imgURL;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", contactLastname='" + contactLastname + '\'' +
                ", contactFirstname='" + contactFirstname + '\'' +
                ", phone='" + phone + '\'' +
                ", addressLine1='" + addressLine1 + '\'' +
                ", addressLine2='" + addressLine2 + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", creditLimit=" + creditLimit +
                ", salesRepEmployeeId=" + salesRepEmployeeId +
                '}';
    }
}
