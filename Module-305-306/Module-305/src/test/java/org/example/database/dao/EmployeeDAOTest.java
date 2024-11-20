package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.example.database.entity.Office;
import org.junit.jupiter.api.*;

import java.util.HashSet;
import java.util.List;


public class EmployeeDAOTest {

    EmployeeDAO empDao = new EmployeeDAO();
    OfficeDAO offDao = new OfficeDAO();
    Employee givenEmp = new Employee();
    Office office = offDao.findOfficeById(7);

    @BeforeAll
    public static void setNewEmployee(){
    }

    @Test
    public void searchEmployee() {
        //given
        // --values updated can be used---------
//        givenEmp.setFirstName("Employee1");
//        givenEmp.setOfficeId(office.getId());
//        givenEmp.setLastname("LastName1");
//        givenEmp.setExtension("x1102");
//        givenEmp.setEmail("jemp1.lastN@yahoo.com");
//        givenEmp.setReportsTo(1621);
//        givenEmp.setJobTitle("Job title1");
//        givenEmp.setVacationHours(70);
//        givenEmp.setProfileImageUrl("");
//        givenEmp.setCustomers(new HashSet<Customer>());
//        givenEmp.setOffice(office);

        //when
        //empDao.create(givenEmp);
        Employee emp1 = empDao.findById(1504);
        List<Employee> empList = empDao.findByName("Jennings");

        //then
        Assertions.assertEquals(1, empList.size());
        Assertions.assertEquals(emp1.getFirstName(), "Barry");
    }


    @Test
    public void updateEmployee() {

        Employee givenEmp = empDao.findById(1504);
//        givenEmp.setFirstName("New FirstName");
//        givenEmp.setLastname("New LastName");
        givenEmp.setFirstName("Barry");
        givenEmp.setLastname("Jones");
        empDao.update(givenEmp);

        Assertions.assertEquals(givenEmp.getFirstName(), "Barry");
        Assertions.assertEquals(givenEmp.getLastname(), "Jones");
    }

    @Test
    public void deleteEmployee() {

    }

}
