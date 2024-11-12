package org.example.database.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "payments")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //-------------------One Customer has MANY Payments Relationship-------------------------
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "customer_id", nullable = false)
    @ToString.Exclude
    private Customer customer;

    @Column(name = "customer_id", insertable = false, updatable = false)
    private int customerId;
    //-----------------------------------------------------------------------------------------

    @Column(name = "check_number",unique = true)
    private String checkNumber;

    @Column(name = "payment_date")
    @Temporal(TemporalType.DATE)
    private Date paymentDate;

    @Column(name = "amount" , columnDefinition = "DECIMAL")
    private Double amount;
}
