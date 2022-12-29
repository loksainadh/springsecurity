package com.bezkoder.springjwt.payload.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class EmployeeSignInRequest {


    @NotBlank
    private String employeeName;

    @NotBlank
    private String password;
}
