package com.patika.productservice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {

	Long id;
	String name;
	double price;
	String category;
	int stock;
}
