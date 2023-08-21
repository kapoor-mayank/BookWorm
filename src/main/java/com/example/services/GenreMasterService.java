package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.GenreMaster;

public interface GenreMasterService {
	
	void addGenreMaster( GenreMaster g);
	List<GenreMaster> getGenreMasters();
	void deleteGenreMaster(Long id);
<<<<<<< HEAD
	void updateGenreMaster(GenreMaster g,Long id);
	Optional<GenreMaster> getGenreMaster(Long id);
	Optional<GenreMaster> getGenreMasterBygenreDesc(String name);	
=======
	//void updateGenreMaster(GenreMaster g,Long id);
	Optional<GenreMaster> getGenreMaster(Long id);
	//Optional<GenreMaster> findGenreMasterByName(String name);	
>>>>>>> a0a538e2648ce6abccac512e89d9b7e81da00c7f
}
