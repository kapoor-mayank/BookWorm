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
		
		 return repository.findById(prodBenId);
	}


	@Override
	public List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage) {
		
		return repository.findAll();
	}

	public List<ProductBenMaster> getAllProduct() {
	
		return repository.findAll();
	}

	@Override
	public void addProduct(ProductBenMaster p) {
		repository.save(p);
		
	}

	@Override
	public void delete(Long prodBenId) {
		repository.deleteById(prodBenId);
		
	}

	@Override
	public ProductBenMaster updateProduct(ProductBenMaster newproduct,Long id) {
		ProductBenMaster oldproduct =repository.findById(id).orElse(null);
		oldproduct.setBeneficiary(newproduct.getBeneficiary());
		oldproduct.setProdBenPercentage(newproduct.getProdBenPercentage());
		repository.save(oldproduct);
		return oldproduct;
	}

}
