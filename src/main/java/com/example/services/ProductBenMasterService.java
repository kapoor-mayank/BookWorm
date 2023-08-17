package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.Entitiy.ProductBenMaster;

public interface ProductBenMasterService {
	
	Optional<ProductBenMaster> getByProdBenId(Long prodBenId);
	List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage);
	List<ProductBenMaster> getAllProduct();
     void addProduct(ProductBenMaster p) ;
}
