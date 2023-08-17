package com.example.services;
import com.example.Entitiy.ProductBenMaster;
import com.example.repositories.ProductBenMasterRepository;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.repositories.ProductBenMasterRepository;


@Service
public class ProductBenMasterServiceImpl implements ProductBenMasterService {
	@Autowired
	private final ProductBenMasterRepository repository;
	public ProductBenMasterServiceImpl (ProductBenMasterRepository repository)
	{
		this.repository =repository;
	}
	
	public Optional<ProductBenMaster> getByProdBenId(Long prodBenId) {
		// TODO Auto-generated method stub
		 return repository.findById(prodBenId);
	}


	@Override
	public List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage) {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public List<ProductBenMaster> getAllProduct() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void addProduct(ProductBenMaster p) {
		repository.save(p);
		
	}

}
