package com.example.entities;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BeneficiaryMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long benId;
    
    private String benName;
    private String benEmailId;
    private String benContactNo;
    private String benBankName;
    private String benBankBranch;
    private String benIFSC;
    private String benAccNo;
    private String benAccType;
    private String benPAN;
    
    // Getter and setter methods
}