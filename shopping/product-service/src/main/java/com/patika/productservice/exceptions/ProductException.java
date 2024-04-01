package com.patika.productservice.exceptions;

public class ProductException extends RuntimeException {

    private String message;

	public ProductException(String message) {
		super(message);
		this.message = message;
	}

}
