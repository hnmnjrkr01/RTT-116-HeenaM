package org.example.database.dao;

import org.example.database.dao.CustomerDAO;
import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CustomerDAOTest {

    private CustomerDAO customerDAO = new CustomerDAO();
    private EmployeeDAO employeeDAO = new EmployeeDAO();
    Customer givenCustomer;
    Employee employee;

    @BeforeAll
    void setUpCustomer() {
        givenCustomer = new Customer();
         employee = employeeDAO.findById(1216);


        givenCustomer.setCustomerName("New Customer");
        givenCustomer.setContactFirstname("Heena");
        givenCustomer.setContactLastname("Manjrekar");
        givenCustomer.setPhone("9712587620");
        givenCustomer.setAddressLine1("sdfsdfsdf");
        givenCustomer.setAddressLine2("6605778");
        givenCustomer.setCity("New-York");
        givenCustomer.setState("NY");
        givenCustomer.setCountry("USA");
        givenCustomer.setPostalCode("94102");
        givenCustomer.setCreditLimit(235.69);
        givenCustomer.setEmployee(employee);

    }

    @AfterAll
    void tearDownCustomer() {
        customerDAO.deleteCustomer(givenCustomer);
    }

    @Test
    public void findByCustomerIdTest() {
        //given
        int givenCustId = 125;

        //when
        Customer actualCustomer = customerDAO.findCustomerById(125);

        //then
        Assertions.assertEquals("Havel & Zbyszek Co", actualCustomer.getCustomerName());            //left is expected right is the actual value
        Assertions.assertEquals(givenCustId, actualCustomer.getId());
        Assertions.assertEquals(0.00, actualCustomer.getCreditLimit());
    }


    @Test
    public void createCustomerTest() {
        //given
        //-----------Using givenCustomer made in @BeforeAll-----------------------------------------
        //when
        Assertions.assertNull(givenCustomer.getId());
        Customer actualCustomer = customerDAO.createCustomer(givenCustomer);
        //Customer actualCustomer2 = customerDAO.findCustomerWithName("New Customer");

        //then
        Assertions.assertNotNull(givenCustomer.getId());
        //Assertions.assertNull(actualCustomer.getSalesRepEmployeeId());
        Assertions.assertEquals(givenCustomer.getCustomerName(), actualCustomer.getCustomerName());
        Assertions.assertEquals(givenCustomer.getContactLastname(), actualCustomer.getContactLastname());

        Assertions.assertEquals(employee.getId(), actualCustomer.getEmployee().getId());

    }


    @ParameterizedTest
    @CsvSource({
            "103, Atelier graphique",
            "112, Signal Gift Stores",
            "114, 'Australian Collectors, Co.'"
    })
    public void findByIdTest(int customerId, String customerName) {
        // this is not a very good test .. just doing it to show how this works
        // given
        // when
        Customer actual = customerDAO.findCustomerById(customerId);

        // then
        Assertions.assertEquals(customerName, actual.getCustomerName());
    }

}
