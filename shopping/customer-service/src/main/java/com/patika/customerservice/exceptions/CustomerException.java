package com.patika.customerservice.exceptions;

public class CustomerException extends RuntimeException {

    private String message;

	public CustomerException(String message) {
		super(message);
		this.message = message;
	}

}
