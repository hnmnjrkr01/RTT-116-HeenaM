package com.example.module309.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UserFormBean {

    @Pattern(regexp = "[A-Za-z0-9]+@+[A-Za-z]+[.com]+$" ,message="Email must be alphanumeric only!")
    @NotEmpty(message = "Username is required!")
    private String username;

    @NotEmpty(message = "Password is required!")
    private String password;

    @NotEmpty(message = "Full Name is required!")
    private String fullname;
}
