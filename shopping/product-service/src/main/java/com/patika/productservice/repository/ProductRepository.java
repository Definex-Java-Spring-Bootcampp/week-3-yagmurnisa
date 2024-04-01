package com.patika.productservice.repository;

import java.util.ArrayList;
import java.util.List;


import com.patika.productservice.model.Product;

public class ProductRepository {
	
	List<Product> products = new ArrayList();
	
	public Product getByName(String name) {
		return products.stream().filter(p -> p.getName().equals(name)).findFirst().orElse(null);
	}

	public Product getById(long id) {
		return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
	}
	public Product createProduct(Product product) {
		products.add(product);
		return product;
	}
}
