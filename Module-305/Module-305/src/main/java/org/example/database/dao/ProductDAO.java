package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public Product findById(Integer id) {

        String sql = "select * from product where id = ?";
        Session session = factory.openSession();

        String hqlQuery = "SELECT p FROM Product p WHERE p.id = :productid";        //Hibernate Query Language
        String sqlQuery = "select * from products id = ?";                          // NATIVE SQL Query

        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("productid", id);

        try {
            Product result = query.getSingleResult();
            return result;
        } catch (Exception e) {
            return null;

        } finally {
            session.close();
        }
    }


    public List<Product> search(String name) {
        String sql = "select * from product where id = ?";
        Session session = factory.openSession();

        String hqlQuery = "SELECT p FROM Product p WHERE p.productName Like concat('%',:pName,'%') order by p.productName";       //Hibernate Query Language
        String sqlQuery = "select * from products id = ?";                          // NATIVE SQL Query

        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("pName", name);

        try {
            List<Product> result = query.getResultList();
            return result;

        } catch (Exception e) {
            return new ArrayList<>();

        } finally {
            session.close();
        }

    }

    public void update(Product product) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.merge(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void delete(Product product) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            session.delete(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    public void create(Product product) {

        Session session = factory.openSession();
        session.getTransaction().begin();
        try {
            createNameCheck(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            session.close();
        }

    }
    public void createNameCheck(Product product) {
        String pName = product.getProductName();
        String hqlQuery = "SELECT p FROM Product p WHERE p.productName = :pName";
        Session session = factory.openSession();
        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("pName", pName);
        try {
            List<Product> result = query.getResultList();
            for(Product p1: result){
                if(p1.getProductName().equals(pName)){
                    System.out.println("This product already exists--"+p1.getProductName());
                }else{
                    System.out.println("This product does not exists--"+p1.getProductName());
                    session.persist(product);
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Some ERROR has occurred!!!!!!!!!! "+e.getMessage());
        } finally {
            session.close();
        }



    }

    public List<Product> findProductByName(String productName) {

        String hqlQuery = "SELECT p FROM Product p WHERE p.productName = :pName";
        Session session = factory.openSession();


        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("pName", productName);
        try {
            List<Product> result = query.getResultList();

            for(Product p1: result){
                if(p1.getProductName().equals(productName)){
                    System.out.println("This product already exists"+p1.getProductName());
                }else{
                    System.out.println("This product does not exists"+p1.getProductName());
                    break;
                }
            }
            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            session.close();
        }

    }

    public List<Product> findProductByOrderId(Integer orderId) {

        String hqlQuery = "SELECT p FROM Product p, OrderDetail od WHERE p.id = od.productId and od.orderId = :orderId";
        Session session = factory.openSession();
        TypedQuery<Product> query = session.createQuery(hqlQuery, Product.class);
        query.setParameter("orderId", orderId);
        try {
            List<Product> result = query.getResultList();
            return result;
        } catch (Exception e) {
            return new ArrayList<>();
        } finally {
            session.close();
        }

    }

    public List<Integer> findOrderIdList(Integer productId) {

        Session session = factory.openSession();
        String hqlQuery = "select od from OrderDetail od where od.productId = :proId ";
        TypedQuery<OrderDetail> query = session.createQuery(hqlQuery, OrderDetail.class);
        query.setParameter("proId", productId);
        try {
            List<OrderDetail> result = query.getResultList();
            List<Integer> OrderIds = new ArrayList<>();

            for(OrderDetail od: result){
                OrderIds.add(od.getOrderId());
            }
            return OrderIds;

        }catch (Exception e){
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }

    public List<OrderDetail> findOrderDetailByProductId(Integer productId) {
        Session session = factory.openSession();
        String hql = "Select od from OrderDetail od where od.productId = :productId ";

        TypedQuery<OrderDetail> query = session.createQuery(hql, OrderDetail.class);
        query.setParameter("productId", productId);
        try{
            List<OrderDetail> orderDetails = query.getResultList();
            return orderDetails;

        }catch (Exception e) {
            return new ArrayList<>();
        }finally {
            session.close();
        }
    }




}