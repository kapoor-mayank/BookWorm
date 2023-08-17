package com.example.services;

import java.util.List;

import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.ProductAttribute;
import com.example.repositories.ProductAttributeRepository;


import java.util.List;
import java.util.Optional;

import com.example.entities.ProductAttribute;
import com.example.repositories.ProductAttributeRepository; // Corrected import
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductAttributeServiceImpl implements ProductAttributeService {

	 private  ProductAttributeRepository productAttributeRepository;

	 
	    @Autowired
	    public ProductAttributeServiceImpl(ProductAttributeRepository productAttributeRepository) {
	        this.productAttributeRepository = productAttributeRepository;
	    }


	

	@Override
	public List<ProductAttribute> getAllProductAttributes() {
		// TODO Auto-generated method stub
		return productAttributeRepository.findAll();
	}

	

	@Override
	public ProductAttribute addProductAttribute(ProductAttribute productAttribute) {
		// TODO Auto-generated method stub
		return productAttributeRepository.save(productAttribute);
	}




	@Override
	public Optional<ProductAttribute> getProductAttributeById(int id) {
		// TODO Auto-generated method stub
		return productAttributeRepository.findById(id);
	}




	@Override
	public ProductAttribute updateProductAttribute(int id, ProductAttribute productAttribute) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public void deleteProductAttribute(int id) {
		// TODO Auto-generated method stub
		
	}



	



}