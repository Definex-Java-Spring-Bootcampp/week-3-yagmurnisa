package com.patika.productservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.patika.productservice.model.Product;
import com.patika.productservice.repository.ProductRepository;

@Service
public class ProductService {

	ProductRepository repository = new ProductRepository();
	
	public Product getByName(String name) {
		return repository.getByName(name);
	}
	
	public Product getById(long id) {
		return repository.getById(id);
	}
	
	public Product createProduct(Product product) {
		return repository.createProduct(product);
	}
}
