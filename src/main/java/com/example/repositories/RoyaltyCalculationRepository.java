package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.RoyaltyCalculation;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface RoyaltyCalculationRepository extends JpaRepository<RoyaltyCalculation, Long>{

	List<RoyaltyCalculation> getByBeneficiary(long benId);

	List<RoyaltyCalculation> getByProduct(long productId);

	List<RoyaltyCalculation> getByInvoice(long invoiceId);
	
	
}
