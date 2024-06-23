package com.example.demo.userRegistrationRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserEntityClass;

public interface UserRegistrationRepo extends JpaRepository<UserEntityClass,Long> {

}
