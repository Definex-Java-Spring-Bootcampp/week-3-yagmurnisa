package com.patika.invoiceservice.repository;


import java.util.ArrayList;
import java.util.List;
import com.patika.invoiceservice.model.Invoice;

public class InvoiceRepository {

	 private List<Invoice> invoices = new ArrayList<>();

	    public Invoice save(Invoice invoice) {
	    	invoices.add(invoice);
	        return invoice;
	    }

	    public List<Invoice> getInvoiceByUser(Long id ) {
	        return invoices.stream().filter(i -> i.getOrder().getCustomerId().equals(id)).toList();
	    }
	}

