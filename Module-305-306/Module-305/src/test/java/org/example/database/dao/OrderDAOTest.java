package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.Product;
import org.junit.jupiter.api.*;


import java.util.Date;
import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderDAOTest {

    OrderDAO orderDAO = new OrderDAO();
    Order givenOrder = new Order();


    @Test
    @org.junit.jupiter.api.Order(1)
    void setupOrder() {

        Order givenOrder1 = new Order();

        givenOrder1.setCustomer(new Customer());
        givenOrder1.setOrderDate(new Date());
        givenOrder1.setReqiredDate(new Date());
        givenOrder1.setStatus("Pending");
        givenOrder1.setComments("This is a comment");
        givenOrder1.setCustomerId(350);

        givenOrder = givenOrder1;

        System.out.println(givenOrder);
        System.out.println(givenOrder1);

        orderDAO.createOrder(givenOrder1);

    }

    @Test
    @org.junit.jupiter.api.Order(2)
    void removeOrder() {
        orderDAO.deleteOrder(givenOrder);
    }

    @Test
    void findOrderByIdTest() {
        //Given
        Order givenOrder = orderDAO.findOrderById(10101);

        // When
        System.out.println(givenOrder);

        // Then
        Assertions.assertNotNull(givenOrder);
        Assertions.assertEquals(givenOrder.getId(), 10101);
        Assertions.assertEquals(givenOrder.getStatus(), "Shipped");
        Assertions.assertEquals(givenOrder.getComments(), "Check on availability.");

    }


    @Test
    void findProductByIdTest() {
        //Given
        List<Product> productList = orderDAO.findProductById(10101);

        // When
        productList.forEach(System.out::println);

        // Then
        Assertions.assertNotNull(productList);
        Assertions.assertEquals(productList.size(), 4);
        Assertions.assertEquals(productList.get(0).getId(), 29);
        Assertions.assertEquals(productList.get(1).getId(), 33);
        Assertions.assertEquals(productList.get(2).getId(), 61);
        Assertions.assertEquals(productList.get(3).getId(), 64);

    }
}