package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.RoyaltyCalculation;
import com.example.repositories.RoyaltyCalculationRepository;

@Service
public class RoyaltyCalculationServiceImpl implements RoyaltyCalculationService
{
	@Autowired
	RoyaltyCalculationRepository calRepo;

	@Override
	public void addRoyality(RoyaltyCalculation obj) {
		calRepo.save(obj);
	}
	
	

	

}
