package com.liavb.accountservice.controller;

import com.liavb.accountservice.dto.SignUpRequest;
import com.liavb.accountservice.dto.SignUpResponse;
import com.liavb.accountservice.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final UserService userService;

    @PostMapping("/signup")
    public ResponseEntity<SignUpResponse> signUp(@Valid @RequestBody SignUpRequest signUpRequest) {
        SignUpResponse signUpResponse = userService.signUpUser(signUpRequest);
        return new ResponseEntity<SignUpResponse>(signUpResponse, HttpStatus.OK);
    }
}
