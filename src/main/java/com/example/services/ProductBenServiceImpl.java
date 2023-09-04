package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.ProductBenMaster;
import com.example.entities.ProductMaster;
import com.example.repositories.ProductBenRepository;

import jakarta.transaction.Transactional;

@Transactional
@Service
public class ProductBenServiceImpl implements ProductBenService
{
	@Autowired 
	ProductBenRepository probenRepo;

	@Override
	public ProductBenMaster getByProduct(ProductMaster obj) {
		
	return	probenRepo.findByProduct(obj);	
	}

}
