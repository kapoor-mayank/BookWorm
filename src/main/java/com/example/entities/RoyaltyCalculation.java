package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class RoyaltyCalculation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roycalId;
    
    @ManyToOne
    @JoinColumn(name = "invoiceId")
    private InvoiceTable invoice;
    
    @ManyToOne
    @JoinColumn(name = "benId")
    private BeneficiaryMaster beneficiary;
    
    private Date roycalTrandate;
    
    @ManyToOne
    @JoinColumn(name = "prodId")
    private ProductMaster product;
    
    private int qty;
    private String tranType;
    private double salePrice;
    private double basePrice;
    private double royaltyOnBasePrice;
    
    // Getter and setter methods
}