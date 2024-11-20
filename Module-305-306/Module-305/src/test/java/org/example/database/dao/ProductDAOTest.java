package org.example.database.dao;

import org.example.database.entity.OrderDetail;
import org.example.database.entity.Product;
import org.example.database.entity.ProductLine;
import org.junit.jupiter.api.*;


import java.util.ArrayList;
import java.util.List;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ProductDAOTest {

    ProductDAO productDAO = new ProductDAO();


  @BeforeAll
   void setUpProduct() {
      System.out.println("-----------Product Setup-----------------------");
      Product givenProduct = new Product();
      ProductLine productLine = (new ProductLineDAO()).findProductLineById(1);

      //Create the new product if it doesn't exist

      givenProduct.setProductName("Classic-Vintage-Lexus");
      givenProduct.setProductCode("LUX_2024");
      givenProduct.setProductDescription("Newest Model");
      givenProduct.setProductVendor("Georgetown GMC Dealer");
      givenProduct.setProductLineId(1);
      givenProduct.setProductScale("2:8");
      givenProduct.setQuantityInStock(700);
      givenProduct.setBuyPrice(999.36);
      givenProduct.setMsrp(1001.89);
      givenProduct.setProductLine(productLine);
      givenProduct.setProductOrderDetails(new ArrayList<>());

      productDAO.create(givenProduct);
      System.out.println(givenProduct);
  }

  @AfterAll
  void tearDownProduct() {
      System.out.println("-----------Product Tear-Down-----------------------");

      List<Product> productList = productDAO.findProductByName("Classic-Vintage-Lexus");

      productList.forEach(System.out::println);

      for (Product product : productList) {
          productDAO.delete(product);
      }




  }

    @Test
    void updateProduct(){
        //given
        Product givenProduct = productDAO.findProductByPName("Classic-Vintage-Lexus");

        //---------------updating givenProduct with different attributes------------------
        System.out.println("before Product: " + givenProduct);

        givenProduct.setProductVendor("Product New Vendor");
        givenProduct.setProductDescription("5 Seater Car");
        productDAO.update(givenProduct);

        // when
        System.out.println("Updated Product: " + givenProduct);

        // then
        Assertions.assertEquals("Hyu_2023", givenProduct.getProductCode());
        //Assertions.assertEquals(2, givenProduct.getProductOrderDetails().size());
        Assertions.assertEquals(700, givenProduct.getQuantityInStock());
        Assertions.assertEquals(89.99, givenProduct.getBuyPrice());
        Assertions.assertEquals(177.89, givenProduct.getMsrp());

        Assertions.assertNotEquals("Hyundai Palisade", givenProduct.getProductName());
        Assertions.assertNotEquals("Round-Rock Hyundai Dealer", givenProduct.getProductVendor());
        Assertions.assertNotEquals("7 Seater Car", givenProduct.getProductDescription());

    }

  @Test
  void findOrderDetailByProductId(){
      //Given
      List<OrderDetail> ordersList = productDAO.findOrderDetailByProductId(20);

      //When
      ordersList.forEach(System.out::println);

      //Then
      Assertions.assertEquals(28, ordersList.size());
      Assertions.assertNotNull(ordersList);

  }

  @Test
  void findOrderIdListTest(){
    //Given
      List<Integer> orderList = productDAO.findOrderIdList(20);
   // When
      orderList.forEach(System.out::println);
   // Then
      Assertions.assertEquals(28, orderList.size());
      Assertions.assertNotNull(orderList);
  }

  @Test
  void findProductsByOrderIdTest(){
      //Given
      List<Product> productList = productDAO.findProductByOrderId(10103);
      // When
      productList.forEach(System.out::println);
      // Then
      Assertions.assertEquals(16, productList.size());
      Assertions.assertNotNull(productList);
  }


}
