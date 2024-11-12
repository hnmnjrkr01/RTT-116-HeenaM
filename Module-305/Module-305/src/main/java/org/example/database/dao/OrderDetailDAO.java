package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class OrderDetailDAO {
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Scanner scan  = new Scanner(System.in);

    public void createOrderDetail(OrderDetail odObject) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(odObject);
        session.getTransaction().commit();
    }

    public void deleteOrderDetail(OrderDetail odObject) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.detach(odObject);
        session.getTransaction().commit();
    }

    public void updateOrderDetail(OrderDetail odObject) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(odObject);
        session.getTransaction().commit();
    }

    public OrderDetail findOrderDetailById(Integer id) {
        Session session = factory.openSession();

        String hql = "SELECT od from OrderDetail od where od.id = :orderdetailId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderdetailId", id);

        try{
            OrderDetail orderDetail = query.getSingleResult();
            return orderDetail;
        }catch(Exception e) {
            return null;
        }finally {
            session.close();
        }
    }

    public List<Integer> findByOrderId(Integer orderId) {
        Session session = factory.openSession();

        String hql = "SELECT od from OrderDetail od where od.orderId = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderId", orderId);

        try{
            List<OrderDetail> orderDetail = query.getResultList();

            List<Integer> list = new ArrayList<>();
            for(OrderDetail od : orderDetail) {
                list.add(od.getProductId());
            }
            return list;
        }catch(Exception e) {
            return null;
        }finally {
            session.close();
        }
    }

    public OrderDetail editQuantityByOrderId(Integer orderId, Integer newQuantity) {
        Session session = factory.openSession();
        OrderDetail odNewQuantity = null;
        int productNumber = 0 ;

        String hql = "SELECT od from OrderDetail od where od.orderId = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderId", orderId);

        try {
            List<OrderDetail> orderDetail = query.getResultList();
            for(OrderDetail od : orderDetail){
                System.out.println("Product id : "+od.getProductId());

            }
            System.out.println("Enter the product number : ");
            int proId = scan.nextInt();
            for(OrderDetail od : orderDetail){
                if(proId == od.getProductId()){
                    session.getTransaction().begin();
                    od.setQuantityOrdered(newQuantity);
                    session.getTransaction().commit();
                    odNewQuantity = od;
                }
            }
        }catch(Exception e) {
            e.getMessage();
        }finally {
            session.close();
        }
        return odNewQuantity;
    }

    public List<OrderDetail> findListByOrderId(Integer orderId) {
        Session session = factory.openSession();

        String hql = "SELECT od from OrderDetail od where od.orderId = :orderId";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("orderId", orderId);

        try{
            List<OrderDetail> orderDetail = query.getResultList();
            return orderDetail;
        }catch(Exception e) {
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }








}
