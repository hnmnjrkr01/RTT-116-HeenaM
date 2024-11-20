package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;

public class FidayHomework4 {

    public static void main(String[] args) {
        ProductDAO productDAO = new ProductDAO();
        OrderDAO orderDAO = new OrderDAO();
        OrderDetailDAO odDAO = new OrderDetailDAO();

        Order order = orderDAO.findOrderById(10100);
        Product p = productDAO.findById(1);

        OrderDetail od = odDAO.findByProductIdAndOrderId(order.getId(), p.getId());

        if (od == null) {
            od = new OrderDetail();
           // od.setOrderId(order.getId());
           // od.setProductId(p.getId());
            od.setQuantityOrdered(100);
            od.setPriceEach(10.25);
            od.setOrderLineNumber(1);
            od.setProduct(p);
            od.setOrder(order);


            odDAO.createOrderDetail(od);
        }else{
            od.setQuantityOrdered( od.getQuantityOrdered() + 100);
            odDAO.updateOrderDetail(od);

        }


    }
}