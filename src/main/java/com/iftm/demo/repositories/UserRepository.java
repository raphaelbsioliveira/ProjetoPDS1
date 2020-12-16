package com.iftm.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.demo.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}