package com.example.module309.controller;

import com.example.module309.database.dao.EmployeeDAO;
import com.example.module309.database.dao.OfficeDAO;
import com.example.module309.database.entity.Employee;
import com.example.module309.database.entity.Office;
import com.example.module309.form.CreateEmployeeFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

//@Slf4j
@Controller
public class EmployeeController {


    private static final Logger LOG = LoggerFactory.getLogger(EmployeeController.class);


    @Autowired
    private EmployeeDAO employeeDAO;

    @Autowired
    private OfficeDAO officeDAO;

    @GetMapping("/employee/searchEmployee")
    public ModelAndView searchEmployee(@RequestParam(required = false) String firstName) {
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/searchEmployee");

        response.addObject("searchFirstName", firstName);

        if(firstName != null){
            List<Employee> employees = employeeDAO.findByFirstName(firstName);
            response.addObject("employees", employees);
        }

        LOG.debug("DEBUG LEVEL");
        LOG.info("INFO LEVEL");
        LOG.warn("WARN LEVEL");
        LOG.error("ERROR LEVEL");

        LOG.debug("==============SEARCH EMPLOYEE================");
        return response;

    }


    @GetMapping("/employee/create")
    public ModelAndView createEmployee() {
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/createEmployee");

        List<Office> offices = officeDAO.findAll();
        response.addObject("offices", offices);

        return response;
    }


    @GetMapping("/employee/createEmployee")
    public ModelAndView createEmployeeSubmit(@Valid CreateEmployeeFormBean empFormBean,
                                             BindingResult bindingResult) {

        ModelAndView response = new ModelAndView();

        response.setViewName("employee/createEmployee");

        //System.out.println("EmployeeFormBean: " + empFormBean);       //Obsolete Method
        LOG.debug("======EmployeeFormBean: " + empFormBean);

        if(bindingResult.hasErrors()) {
            for(ObjectError error : bindingResult.getAllErrors()){
                LOG.debug(error.toString());
            }
            response.addObject("bindingResult", bindingResult);
            response.addObject("empFormBean", empFormBean);

            List<Office> offices = officeDAO.findAll();
            response.addObject("offices", offices);

        }else{
            Employee employee = employeeDAO.findEmployeeById(empFormBean.getId());

            if(employee == null){
                employee = new Employee();
            }
            employee.setFirstName(empFormBean.getFirstName());
            employee.setLastName(empFormBean.getLastName());
            employee.setExtension(empFormBean.getExtension());
            employee.setEmail(empFormBean.getEmail());
            employee.setReportsTo(empFormBean.getReportsTo());
            employee.setJobTitle(empFormBean.getJobTitle());
            employee.setVacationHours(empFormBean.getVacationHours());
            employee.setProfileImageUrl(empFormBean.getProfileImageURL());

            Office office = officeDAO.findByOfficeId(empFormBean.getOfficeId());

            employee.setOffice(office);

            employeeDAO.save(employee);

            LOG.debug("===============Creating New Employee=============="+employee.getId());

           // response.setViewName("redirect:/employee/edit/"+employee.getId());
        }

        return response;
    }


    @GetMapping("/employee/edit/{employeeId}")
    public ModelAndView editEmployee(@PathVariable Integer employeeId) {
        ModelAndView response = new ModelAndView();

        response.setViewName("employee/createEmployee");

        LOG.debug("===============Creating New Employee=============="+employeeId);

        Employee employee = employeeDAO.findEmployeeById(employeeId);

        CreateEmployeeFormBean empFormBean = new CreateEmployeeFormBean();

        empFormBean.setFirstName(employee.getFirstName());
        empFormBean.setLastName(employee.getLastName());
        empFormBean.setOfficeId(employee.getOffice().getId());
        empFormBean.setExtension(employee.getExtension());
        empFormBean.setEmail(employee.getEmail());
        empFormBean.setReportsTo(employee.getReportsTo());
        empFormBean.setJobTitle(employee.getJobTitle());
        empFormBean.setVacationHours(employee.getVacationHours());
        empFormBean.setProfileImageURL(employee.getProfileImageUrl());

        response.addObject("empFormBean", empFormBean);

        List<Office> offices = officeDAO.findAll();
        response.addObject("offices", offices);

        return response;
    }















}
