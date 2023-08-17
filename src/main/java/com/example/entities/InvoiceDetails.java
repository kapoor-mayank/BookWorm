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
    
    private int quantity;
    private double basePrice;
    private String tranType;
    private int rentNoOfDays;
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
	public String getTranType() {
		return tranType;
	}
	public void setTranType(String tranType) {
		this.tranType = tranType;
	}
	public int getRentNoOfDays() {
		return rentNoOfDays;
	}
	public void setRentNoOfDays(int rentNoOfDays) {
		this.rentNoOfDays = rentNoOfDays;
	}
	@Override
	public String toString() {
		return "InvoiceDetails [invDtlId=" + invDtlId + ", invoice=" + invoice + ", product=" + product + ", quantity="
				+ quantity + ", basePrice=" + basePrice + ", tranType=" + tranType + ", rentNoOfDays=" + rentNoOfDays
				+ "]";
	}
	
    
    // Getter and setter methods
}