package com.liavb.accountservice.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class SignUpRequest {

    @NotEmpty(message = "First Name is required")
    private String name;

    @NotEmpty(message = "Last Name is required")
    private String lastname;

    @Email(message = "Email should be valid")
    @NotEmpty(message = "Email is required")
    @Pattern(regexp = "^[\\w.-]+@acme\\.com$", message = "Email must end with @acme.com")
    private String email;


    @NotEmpty
    private String password;

}
