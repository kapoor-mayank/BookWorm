package com.example.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.entities.LanguageMaster;
import com.example.services.LanguageMasterManager;

@RestController
public class LanguageMasterController {
	
	@Autowired
	public LanguageMasterManager l_manager;
	
	@GetMapping("/api/getLanguages")
	public List<LanguageMaster> getAllLanguages()
	{
		return l_manager .getAllLanguages();
	}
	
	@GetMapping(value = "/api/getLanguage/{id}")
	public LanguageMaster getById(@PathVariable("id") Long c) {
		return l_manager.getLanguageById(c);

	}
	
	@PostMapping("/api/addLanguage" )
	public LanguageMaster addLanguageManager(@RequestBody LanguageMaster lmaster)
	{
		l_manager.addLanguage(lmaster);
		return lmaster;
	}
	
	@DeleteMapping("/api/deleteLanguage/{id}")
	public LanguageMaster DeleteLanguage(@PathVariable Long id)
	{
		LanguageMaster lmaster=l_manager.deleteLanguageById(id);
		return lmaster;
	}
}


