package com.example.module309.database.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.Set;


@Entity
@Table(name = "productlines")
@Data
public class ProductLine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    //-------------------One Product_Line has MANY Products Relationship-------------------------
    @OneToMany(mappedBy = "productLine", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @ToString.Exclude
    private Set<Product> productLineProducts;

    //-------------------------------------------------------------------------------------------

   @Column(name = "product_line")
    private String productLine;

    @Column(name = "description")
    private String description;
}
