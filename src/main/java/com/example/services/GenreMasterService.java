package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.GenreMaster;

public interface GenreMasterService {
	
	void addGenreMaster( GenreMaster g);
	List<GenreMaster> getGenreMasters();
	void deleteGenreMaster(Long id);
	//void updateGenreMaster(GenreMaster g,Long id);
	Optional<GenreMaster> getGenreMaster(Long id);
	//Optional<GenreMaster> findGenreMasterByName(String name);	
}
