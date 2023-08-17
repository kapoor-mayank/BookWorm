package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ProductAttribute {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prodAttId;
    
    @ManyToOne
    @JoinColumn(name = "attributeId")
    private AttributeMaster attribute;
    
    @ManyToOne
    @JoinColumn(name = "productId")
    private ProductMaster product;
    
    private String attributeValue;
}