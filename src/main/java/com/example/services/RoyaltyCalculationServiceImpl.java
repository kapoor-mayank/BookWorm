package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.RoyaltyCalculation;
import com.example.repositories.RoyaltyCalculationRepository;

@Service
public class RoyaltyCalculationServiceImpl implements RoyaltyCalculationService{
	
	@Autowired
	RoyaltyCalculationRepository repository;
	@Override
	public void addRoyalty(RoyaltyCalculation royalty) {
		// TODO Auto-generated method stub
		repository.save(royalty);
		
	}

	@Override
	public List<RoyaltyCalculation> getRoyaltyByBeneficiary(long benId) {
		// TODO Auto-generated method stub
		return repository.getByBeneficiary(benId);
	}

	@Override
	public List<RoyaltyCalculation> getRoyaltyByProduct(long productId) {
		// TODO Auto-generated method stub
		return repository.getByProduct(productId);
	}

	@Override
	public List<RoyaltyCalculation> getRoyaltyByInvoice(long invoiceId) {
		// TODO Auto-generated method stub
		return repository.getByInvoice(invoiceId);
	}

	@Override
	public List<RoyaltyCalculation> getRoyalties() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
