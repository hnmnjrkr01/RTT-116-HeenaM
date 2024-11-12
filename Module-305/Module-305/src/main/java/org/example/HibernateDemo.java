package org.example;

import org.example.database.dao.ProductDAO;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class HibernateDemo {

    public static void main(String[] args) {


        ProductDAO pdao = new ProductDAO();

       Product p = pdao.findById(11);

        System.out.println(p);

       /* List<Product> plist = pdao.search("Ford");
        for (Product ford : plist) {
            System.out.println(ford);
        }*/

    }
}
