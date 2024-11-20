package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;

public class EqualExample {
    public static void main(String[] args) {

        String s1="abc";
        String s2="xyz";
         boolean b = s1.equals(s2);

        Customer c1 = new Customer();
        Customer c2 = new Customer();
        CustomerDAO cdao = new CustomerDAO();

        System.out.println("c1 == c2"+c1.equals(c2));           //Compares memory location


        Customer c3 = cdao.findCustomerById(114);
        Customer c4 = cdao.findCustomerById(114);
        System.out.println("c3 == c4"+c3.equals(c4));
    }
}
