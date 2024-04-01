package com.patika.orderservice.exceptions;

public class OrderException extends RuntimeException {

    private String message;

	public OrderException(String message) {
		super(message);
		this.message = message;
	}

}
