package com.cursojava.springboot.b_services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.springboot.c_dal_repositories.ProductRepository;
import com.cursojava.springboot.model_entities.Product;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}

	public Product findById(Long id){
		Optional<Product> obj = repository.findById(id); 
		return obj.get();
	}

}
