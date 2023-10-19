package com.liavb.accountservice.service;

import com.liavb.accountservice.dto.SignUpRequest;
import com.liavb.accountservice.dto.SignUpResponse;
import com.liavb.accountservice.model.User;
import com.liavb.accountservice.repository.UserRepository;
import com.liavb.accountservice.util.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public SignUpResponse signUpUser(SignUpRequest signUpRequest) {
        User user = UserMapper.signUpRequestToUser(signUpRequest);
        userRepository.save(user);
        return UserMapper.userToSignUpResponse(user);
    }
}
