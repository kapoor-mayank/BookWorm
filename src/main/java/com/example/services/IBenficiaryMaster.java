package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.BeneficiaryMaster;

public interface IBenficiaryMaster 
{
	void addBeneficiary(BeneficiaryMaster b);
	List<BeneficiaryMaster> getAllBen();
	void deleteById(Long id);
	Optional<BeneficiaryMaster> getBen(Long id);
	void update(Long id, BeneficiaryMaster updatedBeneficiary);

}



