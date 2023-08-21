package com.example.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.CustomerMaster;
import com.example.services.CustomerService;

@RestController
public class CustomerMasterController {
	@Autowired
	private CustomerService customerSerivce;
	
	@PostMapping("/api/addCustomer")
	public void addCustomer(@RequestBody CustomerMaster customer) {
		customerSerivce.addCustomer(customer);
	}
}
