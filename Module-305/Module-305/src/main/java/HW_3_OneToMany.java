
import org.example.database.dao.ProductDAO;
import org.example.database.entity.Order;
import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HW_3_OneToMany {

    public static void main (String args[]) {
//        SessionFactory factory = new Configuration().configure().buildSessionFactory();


        ProductDAO productDAO = new ProductDAO();

        List<Product> productList = productDAO.findProductByOrderId(10100);

        Set<OrderDetail> odslist = new HashSet<OrderDetail>();
        OrderDetail orderDetail = new OrderDetail();

        Product p = new Product();
        p.setProductDescription("DescriptionTest");
        p.setMsrp(4.95);
        p.setProductCode("NPCTest");
        p.setProductScale("scaleTest");
        p.setProductVendor("vendorTest");
        p.setProductName("HY-Name");
        p.setBuyPrice(14.33);
        p.setProductLineId(1);
        p.setQuantityInStock(100);
        productDAO.create(p);
        productList.add(p);

//        orderDetail.setProductId(p.getId());
//        orderDetail.setQuantityOrdered(100);
//        orderDetail.setOrderLineNumber(1);
//        orderDetail.setOrderId(10100);
//        orderDetail.setPriceEach(30.5);
//        orderDetail.setProduct(p);
//        odslist.add(orderDetail);

        //p.setProductOrderDetails(odslist);
        productDAO.update(p);

//        Session session = factory.openSession();
//        session.getTransaction().begin();
//        try{
//            session.persist(p);

       // productDAO.create(p);

        System.out.println(p);
        System.out.println(orderDetail);
        productList.stream().forEach(System.out::println);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            session.close();
//        }
    }
}