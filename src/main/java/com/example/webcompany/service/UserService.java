package com.example.webcompany.service;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.example.webcompany.entity.User;
import com.example.webcompany.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String createUser(@NonNull User user) {
        userRepository.save(user);
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }
}
