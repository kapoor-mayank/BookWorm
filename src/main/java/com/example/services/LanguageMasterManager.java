package com.example.services;

import java.util.List;

import com.example.entities.LanguageMaster;

public interface LanguageMasterManager
{
	 void addLanguage(LanguageMaster langmaster);
	 List<LanguageMaster> getAllLanguages();
	 public LanguageMaster updateLanguage(Long id,LanguageMaster langmaster) ;
	 public LanguageMaster deleteLanguageById(Long id);
	 public LanguageMaster getLanguageById(Long id) ;	
}