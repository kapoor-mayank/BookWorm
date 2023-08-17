package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MyShelf {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shelfId;
    
    @ManyToOne
    @JoinColumn(name = "customerId")
  private CustomerMaster customerId;
   
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private String tranType;
    private Date productExpiryDate;
    private boolean isActive;
    
    // Getter and setter methods
}