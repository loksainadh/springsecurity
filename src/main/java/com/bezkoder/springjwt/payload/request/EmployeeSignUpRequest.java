package com.bezkoder.springjwt.payload.request;

import com.bezkoder.springjwt.models.Address;
import com.bezkoder.springjwt.models.Role;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
public class EmployeeSignUpRequest {

    @NotBlank
    @Size(min = 3, max = 20)
    private String employeeName;

    @NotBlank
    @Size(max = 50)
    @Email
    private String email;

    private Set<String> role;
    private Integer employeeAge;

    private String gender;

    private Long mobileNumber;

    private Long alternateMobileNumber;

    private Double employeeSalary;

    private String department;

    private List<Address> address;

    @NotBlank
    @Size(min = 6, max = 40)
    private String password;
}
