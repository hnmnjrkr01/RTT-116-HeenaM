package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

import java.util.List;

public class OrderDetailFunctioning {


    public static void main(String[] args) {

        OrderDetailDAO odDao = new OrderDetailDAO();
        //OrderDetail od = odDao.findOrderDetailById(5);

        //List of all product ids in that order
      /*  List<Integer> productIds = odDao.findByOrderId(10103);
        for (Integer productId : productIds) {
            System.out.println(productId);
        }*/

        //Edit Quantity
        //System.out.println(odDao.editQuantityByOrderId(10103,42));

       OrderDAO orderdao = new OrderDAO();
       /*List<Product> productList = orderdao.findProductById(10100);
       for (Product product : productList) {
           System.out.println(product);
       }*/

        ProductDAO pdao = new ProductDAO();
       Product product = new Product();
        product.setProductCode("AAA_1234");
        product.setProductName("Test_Product");
        product.setProductLineId(8);
        product.setProductScale("1:10");
        product.setProductVendor("Hundai-Palisade");
        product.setProductDescription("Test_Product_Description");
        product.setQuantityInStock(10);
        product.setBuyPrice(50000.00);
        product.setMsrp(75000.00);




        //pdao.createNewProduct(product,10100);




    }
}
