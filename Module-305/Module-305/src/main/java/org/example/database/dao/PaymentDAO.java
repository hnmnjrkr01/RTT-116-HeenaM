package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Payment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PaymentDAO {

    private SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void createCustomer(Payment payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.persist(payment);
        session.getTransaction().commit();
    }

    public void deleteCustomer(Payment payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.detach(payment);
        session.getTransaction().commit();
    }

    public void updateCustomer(Payment payment) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        session.merge(payment);
        session.getTransaction().commit();
    }

    public Payment findOfficeById(int id) {

        String hqlQuery = "Select o from Office o where o.id = :paymentId";
        Session session = factory.openSession();

        TypedQuery<Payment> query = session.createQuery(hqlQuery, Payment.class);
        query.setParameter("paymentId", id);

        try {
            Payment result = query.getSingleResult();
            return result;
        }catch (Exception e) {
            return null;

        }finally {
            session.close();
        }
    }
}
