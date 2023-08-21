package com.example.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entities.GenreMaster;
import com.example.repositories.GenreMasterRepository;


@Service
public class GenreMasterServiceImpl implements GenreMasterService {
	
	
	 private final GenreMasterRepository repository;
	
	@Autowired
	public GenreMasterServiceImpl(GenreMasterRepository repository) {
		this.repository=repository;
	}

	@Override
	public void addGenreMaster(GenreMaster g) {
		// TODO Auto-generated method stub
		repository.save(g);
	}
	

	@Override
	public List<GenreMaster> getGenreMasters() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public void deleteGenreMaster(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<GenreMaster> getGenreMaster(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
    public Optional<GenreMaster> getGenreMasterBygenreDesc(String name) {
		// TODO Auto-generated method stub
		return repository.findBygenreDesc(name);
	}

	@Override
	public void updateGenreMaster(GenreMaster g, Long id) {
		// TODO Auto-generated method stub
		 repository.update(g.getGenreDesc(),id);
	}
}
	
	


