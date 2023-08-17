package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.GenreMaster;

public interface GenreServices {
	void addGenreMaster (GenreMaster g);
	List<GenreMaster> getGenreMaster();
	void deleteGenreMaster (Long id);
	void updateGenreMaster (GenreMaster g , Long id);
	Optional<GenreMaster> getGenreMaster(Long id);
	Optional<GenreMaster> getGenreMasterByName(String name);
	

}
