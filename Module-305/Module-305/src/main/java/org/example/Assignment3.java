package org.example;

import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.dao.ProductLineDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.example.database.entity.ProductLine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment3 {

    public static void main(String[] args) {
        Product pro = new Product();
        OrderDetail orderDetail = new OrderDetail();
        ProductDAO proDao = new ProductDAO();
        OrderDetailDAO orderDetailDao = new OrderDetailDAO();
        OrderDAO orderDao = new OrderDAO();

        ProductLine pl = (new ProductLineDAO()).findProductLineById(1);//Read productLine

        Order order = orderDao.findOrderById(10100);//Read the Order

        //Create the new product if it doesn't exist
        pro.setProductName("Prius Toyota");
        pro.setProductCode("S1A_890");
        pro.setProductDescription("Hybrid Car");
        pro.setProductVendor("Toyota Round Rock");
        pro.setProductLineId(1);
        pro.setProductScale("1:10");
        pro.setQuantityInStock(700);
        pro.setBuyPrice(89.99);
        pro.setMsrp(177.89);
        pro.setProductLine(pl);
        pro.setProductOrderDetails(new ArrayList<>());
        proDao.create(pro);

        List<OrderDetail> details = proDao.findOrderDetailByProductId(pro.getId());//Read OrderDetails by productId if it exists

        //Create new row for OrderDetails with 100 qnty for Order 10100
        orderDetail.setOrderId(10100);
        orderDetail.setOrder(order);
        orderDetail.setProductId(pro.getId());
        orderDetail.setProduct(pro);
        orderDetail.setQuantityOrdered(100);
        orderDetail.setOrderLineNumber(10);
        orderDetail.setPriceEach(100.00);
        details.add(orderDetail);//Add this row in already existing OrderDetails

        pro.setProductOrderDetails(details);//Update the OrderDeatils list in the product
        proDao.update(pro);//Finally update the product



    }
}


