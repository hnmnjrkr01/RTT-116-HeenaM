package org.example.database.dao;

import org.example.database.entity.Customer;
import org.example.database.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;

public class EmployeeDAOTest {

    EmployeeDAO empDao = new EmployeeDAO();

    @Test
    public void searchEmployee() {
        //given

        Employee givenEmp = new Employee();
        givenEmp.setFirstName("Jan");
        givenEmp.setOfficeId(7);
        givenEmp.setLastname("February");
        givenEmp.setExtension("x4526");
        givenEmp.setEmail("jan.february@gmail.com");
        givenEmp.setReportsTo(1621);
        givenEmp.setJobTitle("Software Engineering");
        givenEmp.setVacationHours(70);
        givenEmp.setProfileImageUrl("");
        givenEmp.setCustomers(new HashSet<Customer>());
       // givenEmp.setOffice();

        //when
        empDao.create(givenEmp);
        Employee emp1 = empDao.findById(1504);
        List<Employee> empList = empDao.findByName("Jennings");

        //then
        Assertions.assertEquals(2, empList.size());
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
