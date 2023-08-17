package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class InvoiceTable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long invoiceId;

	private Date invoiceDate;
	
	private double invoiceAmount;

	public Date getInvoiceDate() {
		return invoiceDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}

	public double getInvoiceAmount() {
		return invoiceAmount;
	}

	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}

	@Override
	public String toString() {
		return "InvoiceTable [invoiceId=" + invoiceId + ", invoiceDate=" + invoiceDate + ", invoiceAmount="
				+ invoiceAmount + "]";
	}
	
}