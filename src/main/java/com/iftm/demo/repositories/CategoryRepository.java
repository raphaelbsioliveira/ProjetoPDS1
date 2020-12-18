package com.iftm.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iftm.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}