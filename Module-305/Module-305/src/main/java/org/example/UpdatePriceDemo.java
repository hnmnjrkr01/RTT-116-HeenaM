package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;

import java.util.List;

public class UpdatePriceDemo {

    public static void main(String[] args) {

        ProductDAO productDAO = new ProductDAO();

        /*Product product =productDAO.findById(11);

        product.setProductCode("S12_5623");

        productDAO.update(product);

        List<Product> productList = productDAO.findProductByName("1995 Honda Civic");
        for (Product p : productList) {
            System.out.println(p);
        }*/

        Product p = new Product();

        p.setBuyPrice(5.99);
        p.setMsrp(1.99);
        p.setProductName("New Product");
        p.setProductCode("NPC");
        p.setProductLineId(1);
        p.setProductDescription("Product Description");
        p.setQuantityInStock(50);
        p.setProductScale("scale");
        p.setProductVendor("vendor");

        productDAO.createNameCheck(p);



    }
}
