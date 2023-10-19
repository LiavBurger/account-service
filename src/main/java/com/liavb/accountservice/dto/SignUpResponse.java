package com.liavb.accountservice.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SignUpResponse {
    private String name;
    private String lastname;
    private String email;
}
