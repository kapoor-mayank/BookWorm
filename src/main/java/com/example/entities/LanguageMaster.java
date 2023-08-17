package com.example.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class LanguageMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long languageId;
    
    private String languageDesc;
    
    @OneToOne
    @JoinColumn(name = "typeId")
    private ProductTypeMaster productType;
    
    // Getter and setter methods
}