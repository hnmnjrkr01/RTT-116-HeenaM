package com.example.module309.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Length;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CreateEmployeeFormBean {
    private Integer id;

    @Pattern(regexp = "[A-Za-z\\s]+", message = "Name must contain alphabets only!")
    @Length(min=2, max=50, message = "Length must be between 2 to 50 characters!")
    @NotEmpty(message = "This field cannot be empty!")
    private String firstName;

    @Pattern(regexp = "[A-Za-z\\s]+", message = "Name must contain alphabets only!")
    @Length(min=2, max=50, message = "Length must be between 2 to 50 characters!")
    @NotEmpty(message = "This field cannot be empty!")
    private String lastName;

    @NotNull(message = "This field cannot be empty!")
    private Integer officeId ;

    @NotEmpty(message = "This field cannot be empty!")
    @Length(max = 5)
    private String extension;

    @NotEmpty(message = "This field cannot be empty!")
    private String email;

    @NotNull(message = "This field cannot be empty!")
    private Integer reportsTo;

    @NotEmpty(message = "This field cannot be empty!")
    private String jobTitle;

    @NotNull(message = "This field cannot be empty!")
    private Integer vacationHours;


    private String profileImageURL;

}
