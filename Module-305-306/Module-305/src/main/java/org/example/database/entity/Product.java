package org.example.database.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;



@Entity
@Table(name = "products")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    //-------------------One Product has MANY OrderDetails Relationship-------------------------
    @OneToMany(mappedBy = "product", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<OrderDetail> productOrderDetails;

    //-------------------One Product_Line has MANY Products Relationship-------------------------

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "productline_id", nullable = false)
    @ToString.Exclude
    private ProductLine productLine;

    @Column(name = "productline_id",insertable = false, updatable = false)
    private int productLineId;

    //----------------------------------------------------------------------------------------

    @Column(name = "product_code")
    private String productCode;

    @Column(name = "product_name", unique = true, nullable = false)
    private String productName;

    @Column(name = "product_scale")
    private String productScale;

    @Column(name = "product_vendor")
    private String productVendor;

    @Column(name = "product_description", columnDefinition = "TEXT")
    private String productDescription;

    @Column(name = "quantity_in_stock", columnDefinition = "SMALLINT")
    private int quantityInStock;

    @Column(name = "buy_price", columnDefinition = "Decimal")
    private Double buyPrice;

    @Column(name = "msrp",  columnDefinition = "Decimal")
    private Double msrp;
}
