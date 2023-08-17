package com.example.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CustomerMaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    
    private String customerName;
    private String customerEmail;
    private String password;
    private boolean isPremium;
    private Date premiumDate;
    private String customerContactNo;
	@Override
	public String toString() {
		return "CustomerMaster [customerId=" + customerId + ", customerName=" + customerName + ", customerEmail="
				+ customerEmail + ", password=" + password + ", isPremium=" + isPremium + ", premiumDate=" + premiumDate
				+ ", customerContactNo=" + customerContactNo + "]";
	}
    
    
    
    
    
}
