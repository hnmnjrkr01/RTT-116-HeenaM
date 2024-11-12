package org.example;

import org.example.database.dao.CustomerDAO;
import org.example.database.dao.OrderDAO;
import org.example.database.dao.OrderDetailDAO;
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Order;
import org.example.database.entity.Product;

import java.util.List;

public class CreateProductDemo {
    public static void main(String[] args) {
        CustomerDAO customerDAO = new CustomerDAO();
        OrderDAO orderDAO = new OrderDAO();
        OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
        //List<Customer> nameList = customerDAO.findCustomerWithName("Customer_firstname");
        Customer customer = new Customer();

        ProductDAO productDAO = new ProductDAO();
       List<Product> p = productDAO.findProductByOrderId(10100);
   /*
        p.setBuyPrice(5.99);
        p.setMsrp(1.99);
        p.setProductName("New Product");
        p.setProductCode("NPC");
        p.setProductLineId(1);
        p.setProductDescription("Product Description");
        p.setQuantityInStock(50);
        p.setProductScale("scale");
        p.setProductVendor("vendor");

// id will be null
        System.out.println("before = "  + p);
        productDAO.create(p);
// id will be not null number that was generated
        System.out.println("after = " + p);*/
      //  Order order = orderDAO.findOrderById(10405);

      //  order.setComments("-----NEW COMMENT-----");
      //  orderDAO.updateOrder(order);

      /*  customer.setCustomerName("Customer1");
        customer.setContactLastname("Customer_lastname");
        customer.setContactFirstname("Customer_firstname");
        customer.setPhone("123654798");
        customer.setAddressLine1("Address_line1");
        customer.setAddressLine2("Address_line2");
        customer.setCity("Customer-City");
        customer.setState("Customer-State");
        customer.setPostalCode("777777");
        customer.setCountry("Customer-Country");
        customer.setSalesRepEmployeeId(1056);
        customer.setCreditLimit(1000.00);*/

     //  System.out.println("before = "+customer);

        //customerDAO.createCustomer(customer);

     //   System.out.println("after = "+customer);


    //    System.out.println(orderDAO.findOrderById(10386));

      /*  for(Customer c : nameList) {
            System.out.println(c);
        }*/

        /*for(Product p1 : p){
            System.out.println(p1);
        }*/
        Product p1 = productDAO.findById(2);
        System.out.println(p1);

        List<Integer> orderIdlist = productDAO.findOrderIdList(p1.getId());
        for (Integer orderId : orderIdlist) {
            System.out.println("Order-Id : "+p1.getId()+" associated to product: " + orderId);
        }

    }
}
