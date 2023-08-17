package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.LanguageMaster;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface LanguageMasterRepository extends JpaRepository<LanguageMaster, Long>
{	
}
