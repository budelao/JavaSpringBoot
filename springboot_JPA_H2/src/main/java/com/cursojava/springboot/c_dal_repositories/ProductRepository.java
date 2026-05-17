package com.cursojava.springboot.c_dal_repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cursojava.springboot.model_entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
