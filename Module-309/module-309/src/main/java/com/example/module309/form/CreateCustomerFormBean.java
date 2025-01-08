package com.example.module309.form;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {
//Spring-Bean == Spring-Form-Bean == DTO(Data Transfer Object)

    private Integer id;

    @Pattern(regexp = "[A-Za-z0-9\\s]+" , message = "Company name must contain alphabets numbers and spaces only")
    @Length(min =2, max=50, message = "Company name  must between 2 to 50!")
    @NotEmpty(message = "Company Name is required!")
    private String companyName;

    @Length(min =2, max=50, message = "First name must between 2 to 50!")
    @NotEmpty(message = "First Name is required!")
    private String firstName;

    @Length(min =2, max=50, message = "Last name must between 2 to 50!")
    @NotEmpty(message = "Last Name is required!")
    private String lastName;


    @Length( max=10, message = "Phone must be of 10 digits!")
    @NotEmpty(message = "Phone is required!")
    private String phone;


    @Length(min =2, max=50, message = "Address must between 2 to 50!")
    @NotEmpty(message = "Address is required!")
    private String addressLine1;

    @Length(min =2, max=50, message = "Address must between 2 to 50!")
    @NotEmpty(message = "Address is required!")
    private String addressLine2;

    @Length(min =2, max=25, message = "City name must between 2 to 50!")
    @NotEmpty(message = "City is required!")
    private String city;

    @Length(min =2, max=50, message = "Country name must between 2 to 50!")
    @NotEmpty(message = "Country is required!")
    private String country;

   // @NotEmpty(message = "Employee is needed selected!")
    private Integer employeeId;


    private MultipartFile upload;

}
