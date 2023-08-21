package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.BeneficiaryMaster;
import com.example.repository.BeneficiaryMasterRepository;

@Service
public class BeneficiaryMasterImpl implements IBenficiaryMaster {
	
	
	@Autowired
	 private  final BeneficiaryMasterRepository repository;
	
	public BeneficiaryMasterImpl(BeneficiaryMasterRepository repository) {
		// TODO Auto-generated constructor stub
		this.repository=repository;
	}
	

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
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<BeneficiaryMaster> getBen(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public void update(Long id, BeneficiaryMaster b) {
		// TODO Auto-generated method stub
		repository.update(b.getBenName(),id);
	}
	
	


	

}
