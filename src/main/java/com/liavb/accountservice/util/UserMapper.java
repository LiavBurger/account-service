package com.liavb.accountservice.util;

import com.liavb.accountservice.dto.SignUpRequest;
import com.liavb.accountservice.dto.SignUpResponse;
import com.liavb.accountservice.model.User;

public class UserMapper {

    public static User signUpRequestToUser(SignUpRequest signUpRequest) {
        return User.builder()
                .name(signUpRequest.getName())
                .lastname(signUpRequest.getLastname())
                .email(signUpRequest.getEmail())
                .password(signUpRequest.getPassword())
                .build();
    }

    public static SignUpResponse userToSignUpResponse(User user) {
        return SignUpResponse.builder()
                .name(user.getName())
                .lastname(user.getLastname())
                .email(user.getEmail())
                .build();
    }
}
