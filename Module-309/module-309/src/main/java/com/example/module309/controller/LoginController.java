package com.example.module309.controller;


import com.example.module309.database.dao.UserDAO;
import com.example.module309.database.entity.User;
import com.example.module309.form.UserFormBean;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
public class LoginController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserDAO userDAO;


    @GetMapping("/login/login")
    public ModelAndView login() {
        ModelAndView response = new ModelAndView();

        response.setViewName("login/loginPage");

        return response;
    }

    @GetMapping("/login/signUp")
    public ModelAndView signUp() {
        ModelAndView response = new ModelAndView();

        response.setViewName("login/signUp");


        return response;
    }

    @PostMapping("/login/signUpSubmit")
    public ModelAndView signUpSubmit(@Valid UserFormBean userFormBean, BindingResult bindingResult) {
        ModelAndView response = new ModelAndView();



        if(bindingResult.hasErrors()) {

            response.setViewName("login/signUp");
            response.addObject("bindingResult", bindingResult);
            response.addObject("userFormBean", userFormBean);

        }else{

            User user = new User();

            user.setEmail(userFormBean.getUsername());
            user.setFullName(userFormBean.getFullname());

            String encryptedPassword = passwordEncoder.encode(userFormBean.getPassword());
            user.setPassword(encryptedPassword);

            userDAO.save(user);

            response.setViewName("redirect:/");

        }



        return response;
    }


}
