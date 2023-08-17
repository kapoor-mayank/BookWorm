package com.example.services;

import java.util.List;
import com.example.entities.ProductBenMaster;
import com.example.repositories.ProductBenMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductBenMasterServiceImpl implements ProductBenMasterService {
	@Autowired
	ProductBenMasterRepository repository;
	@Override
	public List<ProductBenMaster> getByProdBenId(Long prodBenId) {
		return repository.findAll();
	}
	public List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage) {
		return repository.findAll();
	}
	
}
