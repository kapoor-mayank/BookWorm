package com.example.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.entities.CustomerMaster;

public interface CustomerService {
	void addCustomer(CustomerMaster customer);
	
	CustomerMaster  getCustomerById(long id);
	
	
}
