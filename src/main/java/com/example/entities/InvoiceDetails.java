package com.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class InvoiceDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long invDtlId;
    
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private InvoiceTable invoice;
    
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private Long quantity;
    private Double basePrice;
    private String tranType;
    private Long rentNoOfDays;
    
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}
	public Double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public Long getRentNoOfDays() {
		return rentNoOfDays;
	}
	public void setRentNoOfDays(Long rentNoOfDays) {
		this.rentNoOfDays = rentNoOfDays;
	}
    
    // Getter and setter methods
}