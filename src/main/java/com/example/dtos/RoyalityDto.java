package com.example.dtos;

import com.example.entities.BeneficiaryMaster;
import com.example.entities.InvoiceTable;
import com.example.entities.ProductMaster;

public class RoyalityDto 
{
	
	private InvoiceTable invoice;
	private BeneficiaryMaster beneficiary;
	private ProductMaster product;
	private double totalAmount;
	
	
	
	
	
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public InvoiceTable getInvoice() {
		return invoice;
	}
	public void setInvoice(InvoiceTable invoice) {
		this.invoice = invoice;
	}
	public BeneficiaryMaster getBeneficiary() {
		return beneficiary;
	}
	public void setBeneficiary(BeneficiaryMaster beneficiary) {
		this.beneficiary = beneficiary;
	}
	public ProductMaster getProduct() {
		return product;
	}
	public void setProduct(ProductMaster product) {
		this.product = product;
	}
	
	
	

}
