package com.iftm.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.demo.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}