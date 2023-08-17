package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ProductBenMaster;
import com.example.repositories.ProductBenMasterRepository;
import com.example.services.ProductBenMasterServiceImpl;

@RestController
public class ProductBenMasterController {
	@Autowired
	ProductBenMasterServiceImpl manager;
	
	@GetMapping("api/getByProdBenId/{prodBenId}")
	public List<ProductBenMaster> getByProdBenId(@PathVariable Long prodBenId) {
		return manager.getByProdBenId(prodBenId);
	}
	
	@GetMapping("api/getByProdBenPercentage/{prodBenPercentage}")
	public List<ProductBenMaster> getByProdBenPercentage(@PathVariable double prodBenPercentage) {
		return manager.getByProdBenPercentage(prodBenPercentage);
	}
	
	
}
