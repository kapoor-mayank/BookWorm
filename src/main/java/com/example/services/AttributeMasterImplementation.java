package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.AttributeMaster;
import com.example.respositaries.AttributeMasterRepository;

public class AttributeMasterImplementation implements AttributeMasterServices {

	AttributeMasterRepository repository;
	
	@Override
	public void addAttributeMaster(AttributeMaster a) {
		// TODO Auto-generated method stub
		repository.save(a);
		
	}

	@Override
	public List<AttributeMaster> getAttributeMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteAttributeMaster(Long id) {
		// TODO Auto-generated method stub
		 repository.existsById(id);
	}

	@Override
	public void updateAttributeMaster(AttributeMaster a, Long id) {
		// TODO Auto-generated method stub
		repository.update(a.getAttributeDesc(), id);
	}

	@Override
	public Optional<AttributeMaster> getAttributeMaster(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

}
