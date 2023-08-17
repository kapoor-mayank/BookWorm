package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Service;

import com.example.entities.LanguageMaster;
import com.example.repositories.*;

@Service
public class LanguageMasterManagerImpl implements LanguageMasterManager
{
	@Autowired
	public LanguageMasterRepository l_repository;

	@Override
	public void  addLanguage(LanguageMaster langmaster) {
		l_repository.save(langmaster);
			}

	@Override
	public List<LanguageMaster> getAllLanguages() {	
		return l_repository.findAll();
	}
	
	@Override
	public LanguageMaster getLanguageById(Long id) {	
		return l_repository.findById(id).orElse(null);
	}
	
//	@Override
//	public LanguageMaster updateLanguage(Long id,LanguageMaster langmaster) 
//	{	
//		LanguageMaster old_langmaster= l_repository.getById(id);
//		if(old_langmaster!=null)
//		{
//			old_langmaster.setLanguageDesc(langmaster.getLanguageDesc());
//			old_langmaster.setProductType(langmaster.getProductType());
//			l_repository.save(old_langmaster);
//		}
//		return old_langmaster;
//	}
	
	
	
	public LanguageMaster deleteLanguageById(Long id)
	{
		LanguageMaster lmaster=l_repository.getById(id);
		if(id!=0)
		{	
		l_repository.deleteById(id);
		}	
		return lmaster;
	}

	@Override
	public LanguageMaster updateLanguage(Long id, LanguageMaster langmaster) {
		// TODO Auto-generated method stub
		return null;
	}


	
	
	

}
