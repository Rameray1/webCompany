package com.example.webcompany.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webcompany.entity.User;
import com.example.webcompany.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String test(User user) {
        userRepository.save(user);
        return "Hello " + user.getFirstname() + " " + user.getLastname();
    }
}
