package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.MyShelf;
import com.example.entities.ProductMaster;
import com.example.repositories.MyShelfRepository;

@Service
public class MyShelfServiceImpl implements MyShelfService {

	@Autowired
	MyShelfRepository repository;

	@Override
	public MyShelf getById(Long shelfId) {
		Optional<MyShelf> shelfOptional = repository.findById(shelfId);
		return shelfOptional.orElse(null);
	}

	@Override
	public List<Object []> getByCustomerId(Long customerId) {
		return repository.getByCustomerId(customerId);
	}

}