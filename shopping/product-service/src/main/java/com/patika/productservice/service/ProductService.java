package com.patika.productservice.service;

import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.patika.productservice.exceptions.*;
import com.patika.productservice.model.Product;
import com.patika.productservice.repository.ProductRepository;

@Service
public class ProductService {

	ProductRepository repository = new ProductRepository();
	
	public Product getByName(String name) {
		Optional<Product> foundProduct = repository.getByName(name);
		Product product = foundProduct.orElseThrow(() -> new ProductException(ExceptionMessages.PRODUCT_NOT_FOUND));
		return product;
	}
	
	public Product getById(Long id) {
		Optional<Product> foundProduct = repository.getById(id);
		Product product = foundProduct.orElseThrow(() -> new ProductException(ExceptionMessages.PRODUCT_NOT_FOUND));
		return product;
	}
	
	public Product createProduct(Product product) {
		return repository.createProduct(product);
	}
}
