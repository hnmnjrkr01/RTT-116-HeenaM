package com.example.module309.controller;

import com.example.module309.database.dao.CustomerDAO;
import com.example.module309.database.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class IndexController {

    @Autowired
    private CustomerDAO customerDAO;


    @GetMapping("/index")
    public ModelAndView index(){
        ModelAndView response = new ModelAndView();

        response.setViewName("index");

        List<Customer> customerFirstNames = customerDAO.findCustomerByName("Alexander");
        for(Customer customer : customerFirstNames){
            System.out.println(customer.toString());
        }

        response.addObject("customerFirstNames", customerFirstNames);
        return response;
    }

    @GetMapping("/index1")
    public ModelAndView index1(@RequestParam(required = false) String search){
        ModelAndView response = new ModelAndView();

        response.setViewName("index");

        List<Customer> customerFirstNames = customerDAO.findCustomerByName(search);
        for(Customer customer : customerFirstNames){
            System.out.println(customer.toString());
        }

        response.addObject("customerFirstNames", customerFirstNames);
        return response;
    }


    @GetMapping("/courses/{courseId}/external_tools/{toolId}")
    public ModelAndView pathVariable(@PathVariable String courseId, @PathVariable String toolId) {
        ModelAndView response = new ModelAndView();

        System.out.println(courseId + " .... " + toolId);

        response.setViewName("xyz789");

        return response;
    }
}
