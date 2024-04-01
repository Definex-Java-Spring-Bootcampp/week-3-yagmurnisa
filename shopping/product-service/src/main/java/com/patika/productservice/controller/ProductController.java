package com.patika.productservice.controller;

import org.springframework.web.bind.annotation.*;

import com.patika.productservice.model.Product;
import com.patika.productservice.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("api/products")
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@GetMapping("/{name}")
	public Product getByName(@PathVariable String name) {
		return productService.getByName(name);
	}
	
	@GetMapping("/{id}")
	public Product getById(@PathVariable long id) {
		return productService.getById(id);
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product product) {
		return productService.createProduct(product);
	}
}
