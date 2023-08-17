package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	 @GetMapping(value = "/BeneficiarById/{id}")
	 public Optional<BeneficiaryMaster> getBenMaster(@PathVariable long id)
	 {
		Optional<BeneficiaryMaster> p=beneficiary.getBen(id);
		return p;
	 }
	
	@PostMapping("/add")
	public void addBeneficiary(@RequestBody BeneficiaryMaster BenMas )
	{
		beneficiary.addBeneficiary(BenMas);
	}
	
	
//	@PutMapping(value = "/Benficiary/{pid}")
//	public void updatepro(@PathVariable long id, @RequestBody BeneficiaryMaster master)
//	{
//		beneficiary.update(id, master);
//	}
	


}
