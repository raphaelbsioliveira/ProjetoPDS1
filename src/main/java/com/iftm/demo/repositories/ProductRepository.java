package com.iftm.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}