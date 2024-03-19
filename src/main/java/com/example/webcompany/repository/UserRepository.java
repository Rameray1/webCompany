package com.example.webcompany.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webcompany.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
