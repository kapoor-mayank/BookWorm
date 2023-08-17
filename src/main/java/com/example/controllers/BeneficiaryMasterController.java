
package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.BeneficiaryMaster;
import com.example.services.IBenficiaryMaster;

@RestController 
public class BeneficiaryMasterController {
	
	@Autowired
	private IBenficiaryMaster beneficiary;
	
	@GetMapping(value = "/getBen")
	 public List<BeneficiaryMaster> showProducts1()
	 {
		  return beneficiary.getAllBen();
		
	 }

}