package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.entities.GenreMaster;
import com.example.respositaries.GenreMasterRespository;

public class GenreMasterImplementation implements GenreServices {
	@Autowired
	GenreMasterRespository repository;

	@Override
	public void addGenreMaster(GenreMaster g) {
		// TODO Auto-generated method stub
		repository.save(g);
	}

	@Override
	public List<GenreMaster> getGenreMaster() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteGenreMaster(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		
	}

	@Override
	public void updateGenreMaster(GenreMaster g, Long id) {
		// TODO Auto-generated method stub
		repository.update(g.getGenreDesc(), id);
	}

	@Override
	public Optional<GenreMaster> getGenreMaster(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public Optional<GenreMaster> getGenreMasterByName(String name) {
		// TODO Auto-generated method stub
		return repository.findByName(name);
	}

	

}
