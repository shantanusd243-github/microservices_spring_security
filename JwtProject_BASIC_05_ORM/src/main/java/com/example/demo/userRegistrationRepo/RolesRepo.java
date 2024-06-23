package com.example.demo.userRegistrationRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.RolesEntity;

public interface RolesRepo extends JpaRepository<RolesEntity, Long> {

}
