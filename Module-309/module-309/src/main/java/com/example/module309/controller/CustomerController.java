package com.example.module309.controller;


import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.entity.Customer;
import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.User;
import com.example.module309.form.CreateCustomerFormBean;
import com.example.module309.security.AuthenticatedUserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Slf4j
@Controller
@PreAuthorize("hasAuthority('CUSTOMER')")
public class CustomerController {


    private static final Logger LOG = LoggerFactory.getLogger(CustomerController.class);

    @Autowired
    private CustomerDAO customerDAO;

    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private AuthenticatedUserService authenticatedUserService;




    @GetMapping("/customer/search")
    public ModelAndView search(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/search");        ///WEB-INF/jsp/customer.search.jsp

        int x = 10/0;

        //add the searched value to the model
        response.addObject("search", firstName);        //General practice is to keep the name SAME but for out understanding Eric kept it different


        if(firstName != null ) {                        //&& !firstname.isEmpty()
            List<Customer> customers = customerDAO.findCustomerByName(firstName);
            response.addObject("customersKey", customers);
        }

        LOG.debug("DEBUG LEVEL");
        LOG.info("INFO LEVEL");
        LOG.warn("WARNING LEVEL");
        LOG.error("ERROR LEVEL");

        System.out.println("===========Customer Search Page=============");
        return response;
    }

    @GetMapping("/customer/create")
    public ModelAndView create() {
        ModelAndView response = new ModelAndView();



        response.setViewName("customer/create");
        List<Employee> employees = employeeDAO.findAllEmployee();
        response.addObject("employeesKey", employees);

        User loggedInUser = authenticatedUserService.loadCurrentUser();
        LOG.debug("!!!!!!!!!!!!!!!!!!!!!!!!!! " + loggedInUser.toString());

        return response;
    }

   @GetMapping("/customer/createCustomer")
   public ModelAndView createCustomerSubmit(@Valid CreateCustomerFormBean customerForm,
                                            BindingResult bindingResult) {
   //validation cant be done with PathVariable
   //But manual validations can be done

       ModelAndView response = new ModelAndView();

       response.setViewName("customer/create");

       System.out.println("customerForm = " + customerForm);

       if(bindingResult.hasErrors()) {
           for(ObjectError error : bindingResult.getAllErrors()) {
               LOG.debug(error.toString());
           }
           response.addObject("bindingResult", bindingResult);
           response.addObject("customerForm", customerForm);

           List<Employee> employees = employeeDAO.findAllEmployee();
           response.addObject("employeesKey", employees);

       }else{
           Customer customer = customerDAO.findById(customerForm.getId());
           if(customer == null) {
               customer = new Customer();
           }

           customer.setCustomerName(customerForm.getCompanyName());
           customer.setContactFirstname(customerForm.getFirstName());
           customer.setContactLastname(customerForm.getLastName());
           customer.setPhone(customerForm.getPhone());
           customer.setAddressLine1(customerForm.getAddressLine1());
           customer.setAddressLine2(customerForm.getAddressLine2());
           customer.setCity(customerForm.getCity());
           customer.setCountry(customerForm.getCountry());


               Employee employee = employeeDAO.findEmployeeById(customerForm.getEmployeeId());
               customer.setEmployee(employee);

               customerDAO.save(customer);

               LOG.debug("===================SAVING CUSTOMER=========="+customer.getId());
           response.setViewName("redirect:/customer/edit/" + customer.getId()+"?success=true");

       }


       return response;
   }

   @GetMapping("/customer/edit/{customerId}")
    public ModelAndView edit(@PathVariable Integer customerId) {
        ModelAndView response = new ModelAndView();

        response.setViewName("customer/create");

       LOG.debug("===================EDITING CUSTOMER=========="+customerId);
        Customer customer = customerDAO.findById(customerId);

        CreateCustomerFormBean customerForm = new CreateCustomerFormBean();


        customerForm.setId(customer.getId());
        customerForm.setCompanyName(customer.getCustomerName());
        customerForm.setFirstName(customer.getContactFirstname());
        customerForm.setLastName(customer.getContactLastname());
        customerForm.setPhone(customer.getPhone());
        customerForm.setAddressLine1(customer.getAddressLine1());
        customerForm.setAddressLine2(customer.getAddressLine2());
        customerForm.setCity(customer.getCity());
        customerForm.setCountry(customer.getCountry());
        //customerForm.setEmployeeId(customer.getSalesRepEmployeeId());
       customerForm.setEmployeeId(customer.getEmployee().getId());   //Alternate way

        response.addObject("customerForm", customerForm);

       List<Employee> employees = employeeDAO.findAllEmployee();
       response.addObject("employeesKey", employees);

        return response;
   }











}
