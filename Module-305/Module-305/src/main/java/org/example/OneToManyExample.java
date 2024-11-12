package org.example;

import org.example.database.dao.EmployeeDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;

public class OneToManyExample {

    public static void main( String[] args) {

        EmployeeDAO employeeDAO = new EmployeeDAO();

        Employee e = employeeDAO.findById(1501);

        System.out.println(e);

        for(Customer c : e.getCustomers()){
            System.out.println(c);
            System.out.println(c.getEmployee());
        }

        Customer newCustomer = new Customer();

        newCustomer.setCustomerName("New Customer");
        newCustomer.setContactFirstname("Heena");
        newCustomer.setContactLastname("Manjrekar");
        newCustomer.setPhone("9712587620");
        newCustomer.setAddressLine1("sdfsdfsdf");
        newCustomer.setAddressLine2("6605778");
        newCustomer.setCity("New-York");
        newCustomer.setState("NY");
        newCustomer.setCountry("USA");
        newCustomer.setPostalCode("94102");
        newCustomer.setCreditLimit(235.69);
        newCustomer.setEmployee(e);

        e.getCustomers().add(newCustomer);

        employeeDAO.update(e);




    }
}
