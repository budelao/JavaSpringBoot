package com.cursojava.springboot.b_services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursojava.springboot.c_dal_repositories.CategoryRepository;
import com.cursojava.springboot.model_entities.Category;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}

	public Category findById(Long id){
		Optional<Category> obj = repository.findById(id); 
		return obj.get();
	}

}
