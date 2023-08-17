package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.AttributeMaster;
import com.example.entities.GenreMaster;

public interface AttributeMasterServices {

	void addAttributeMaster (AttributeMaster a);
	List<AttributeMaster> getAttributeMaster();
	void deleteAttributeMaster (Long id);
	void updateAttributeMaster (AttributeMaster a , Long id);
	Optional<AttributeMaster> getAttributeMaster(Long id);
	
}
