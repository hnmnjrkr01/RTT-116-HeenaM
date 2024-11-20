package org.example.database.dao;

import org.example.database.entity.OrderDetail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class OrderDetailDAOTest {
    OrderDetailDAO odDAO = new OrderDetailDAO();
    @Test
    void findOrderDetailByIdTest(){
        //Given
        OrderDetail orderDetail = odDAO.findOrderDetailById(1);
        // When
        System.out.println(orderDetail);
        // Then
        Assertions.assertNotNull(orderDetail);
        Assertions.assertEquals(orderDetail.getOrderId(), 10100);
        Assertions.assertEquals(orderDetail.getProductId(), 23);
        Assertions.assertEquals(orderDetail.getQuantityOrdered(), 20);
        Assertions.assertNotEquals(orderDetail.getPriceEach(), 100.00);
        Assertions.assertNotEquals(orderDetail.getOrderLineNumber(), 7);

    }

    @Test
    void findByOrderIdTest(){
        //Given
        List<Integer> productIds = odDAO.findByOrderId(10100);

        // When
        productIds.forEach(System.out::println);
        // Then

        Assertions.assertNotNull(productIds);
        Assertions.assertEquals(productIds.size(), 7);
        Assertions.assertEquals(productIds.size()>5, true);
    }

    @Test
    void findListByOrderIdTest(){
        //Given
        List<OrderDetail> odList = odDAO.findListByOrderId(10103);
        // When
        odList.forEach(System.out::println);
        // Then
        Assertions.assertNotNull(odList);
        Assertions.assertEquals(odList.size(), 16);
        Assertions.assertEquals(odList.size()>10, true);
    }

    @Test
    void findByProductIdAndOrderIdTest(){
        //Given
        OrderDetail orderDetail = odDAO.findByProductIdAndOrderId(10103, 17);
        // When
        System.out.println(orderDetail);

        // Then
        Assertions.assertNotNull(orderDetail);
        Assertions.assertEquals(orderDetail.getProductId(), 17);
        Assertions.assertEquals(orderDetail.getOrderId(), 10103);
    }

}
