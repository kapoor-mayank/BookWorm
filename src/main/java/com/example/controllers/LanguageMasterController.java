package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.LanguageMaster;
import com.example.services.LanguageMasterService;

@RestController
@CrossOrigin("*")
public class LanguageMasterController {
	@Autowired
	private LanguageMasterService iservices;
	@PutMapping(value = "api/languages/{id}")
	public void updatelanguage(@PathVariable int id,@RequestBody LanguageMaster language) {
	       iservices.updatelanguage(id, language);
	}
	 @GetMapping(value = "api/language")
	public List<LanguageMaster> getalllanguage()
	{
	   return iservices.getalllanguage();
		
	}
	 @GetMapping(value="api/language/{id}")
	public Optional<LanguageMaster> getlanguagebytypeid(@PathVariable Long id)
	{
		return iservices.getlanguagebytypeid(id);
	}
	 @GetMapping(value = "api/languagetype/{type}")
	public Optional<LanguageMaster> getlanguagebyitsType(@PathVariable String type)
	{
		return iservices.getlanguagebyitsType(type);
	}
	

}