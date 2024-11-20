package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.ProductLine;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductLineDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createCustomer(ProductLine payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(payment);
        session.getTransaction().commit();
    }

    public void deleteCustomer(ProductLine payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.detach(payment);
        session.getTransaction().commit();
    }

    public void updateCustomer(ProductLine payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(payment);
        session.getTransaction().commit();
    }

    public ProductLine findProductLineById(int id) {

        String hqlQuery = "Select pl from ProductLine pl  where pl.id = :id";
        Session session = factory.openSession();

        TypedQuery<ProductLine> query = session.createQuery(hqlQuery, ProductLine.class);
        query.setParameter("id", id);

        try {
            ProductLine result = query.getSingleResult();
            return result;
        }catch (Exception e) {
            return null;

        }finally {
            session.close();
        }
    }

}
