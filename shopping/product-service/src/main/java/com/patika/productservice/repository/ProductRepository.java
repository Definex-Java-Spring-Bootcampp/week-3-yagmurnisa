package com.patika.productservice.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.patika.productservice.model.Product;

public class ProductRepository {
	
	List<Product> products = new ArrayList();
	
	public Optional<Product> getByName(String name) {
		return products.stream().filter(p -> p.getName().equals(name)).findFirst();
	}

	public Optional<Product> getById(Long id) {
		return products.stream().filter(p -> p.getId().equals(id)).findFirst();
	}
	
	public Product createProduct(Product product) {
		products.add(product);
		return product;
	}
}
