package com.example.services;
import java.util.List;

import com.example.entities.*;
public interface RoyaltyCalculationService {
	void addRoyalty(RoyaltyCalculation royalty);
	List<RoyaltyCalculation> getRoyaltyByBeneficiary(long benId);
	List<RoyaltyCalculation> getRoyaltyByProduct(long productId);
	List<RoyaltyCalculation> getRoyaltyByInvoice(long invoiceId);
	List<RoyaltyCalculation> getRoyalties();
}
