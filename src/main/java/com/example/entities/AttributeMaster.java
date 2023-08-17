package com.example.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AttributeMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long attributeId;
    
    private String attributeDesc;
    
    // Getter and setter methods
}