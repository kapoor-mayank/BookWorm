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
    
    // Getter and setter methods
}