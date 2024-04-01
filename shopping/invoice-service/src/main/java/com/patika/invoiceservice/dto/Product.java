package com.patika.invoiceservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class Product {

	String name;
	Long price;
	Long id;
}
