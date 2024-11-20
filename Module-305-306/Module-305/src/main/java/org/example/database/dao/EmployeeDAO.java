package org.example.database.dao;

import jakarta.persistence.TypedQuery;
import org.example.database.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
    // old style: make session factory for all DAO
    private SessionFactory factory = new Configuration().configure().buildSessionFactory();


    public void update(Employee employee) {
        // for hibernate
        // update: the product has already existed to work without error
        Session session = factory.openSession();
        session.beginTransaction();
        session.merge(employee);
        session.getTransaction().commit();
        session.close();
    }

    public void create(Employee employee) {
        Session session = factory.openSession();
        session.getTransaction().begin();
        if(employee != null) {
            session.persist(employee);
            session.getTransaction().commit();
        }else{
            System.out.println("Employee is null");

        }
        session.close();
    }

    public void deleteByProduct(Employee employee) {

        Session session = factory.openSession();
        session.beginTransaction();
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public void deleteById(int id) {
        Session session = factory.openSession();
        session.beginTransaction();
        Employee employee = (Employee) session.get(Employee.class, id);
        try {
            session.delete(employee);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
            System.out.println(e.getMessage());
        } finally {
            session.close();
        }
    }

    public Employee findById(int employeeId) {
        String hqlQuery = "SELECT e FROM Employee e WHERE id = :employeeId";
        Session session = factory.openSession();

        TypedQuery<Employee> query = session.createQuery(hqlQuery, Employee.class);
        query.setParameter("employeeId", employeeId);

        try {
            Employee employee = query.getSingleResult();
            return employee;
        } catch (Exception e) {
            return null;
        } finally {
            session.close();
        }
    }
     public List<Employee> findByName(String name) {
         Session session = factory.openSession();
         String hqlQuery = "SELECT e FROM Employee e WHERE firstName = :name or lastname = :name";


         TypedQuery<Employee> query = session.createQuery(hqlQuery, Employee.class);
         query.setParameter("name", name);


         try {
             List<Employee> employeeList = query.getResultList();
             return employeeList;
         } catch (Exception e) {
             return new ArrayList<>();
         } finally {
             session.close();
         }

     }
}
