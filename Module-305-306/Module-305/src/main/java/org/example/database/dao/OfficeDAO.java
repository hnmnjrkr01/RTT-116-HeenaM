package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Office;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OfficeDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createCustomer(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(office);
        session.getTransaction().commit();
    }

    public void deleteCustomer(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.detach(office);
        session.getTransaction().commit();
    }

    public void updateCustomer(Office office) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(office);
        session.getTransaction().commit();
    }

    public Office findOfficeById(int id) {

       String hqlQuery = "Select o from Office o where o.id = :officeid";
        Session session = factory.openSession();

        TypedQuery<Office> query = session.createQuery(hqlQuery, Office.class);
        query.setParameter("officeid", id);

        try {
            Office result = query.getSingleResult();
            return result;
        }catch (Exception e) {
            return null;

        }finally {
            session.close();
        }
    }

}
