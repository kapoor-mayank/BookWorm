
package com.example.repositories;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.BeneficiaryMaster;
import com.example.services.IBenficiaryMaster;

@Service
public class BeneficiaryMasterImpl implements IBenficiaryMaster {
	
	
	@Autowired
	 private  BeneficiaryMasterRepository repository;
	
	

	@Override
	public void addBeneficiary(BeneficiaryMaster b) {
		// TODO Auto-generated method stub
		repository.save(b);
	}

	@Override
	public List<BeneficiaryMaster> getAllBen() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

//	@Override
//	public void update(long id, BeneficiaryMaster BenMas) {
//		// TODO Auto-generated method stub
//		repository.update(BenMas.getBenAccNo(),BenMas.getBenAccType(),
//				BenMas.getBenBankBranch(),BenMas.getBenBankName(),BenMas.getBenContactNo(),
//				BenMas.getBenEmailId(),BenMas.getBenIFSC(),BenMas.getBenName(),BenMas.getBenPAN(),id);
//	}
	
	


	

}




