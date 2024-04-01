package com.patika.invoiceservice.exceptions;

public class InvoiceException extends RuntimeException {

    private String message;

	public InvoiceException(String message) {
		super(message);
		this.message = message;
	}

}
