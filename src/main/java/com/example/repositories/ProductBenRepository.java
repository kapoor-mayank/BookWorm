package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ProductBenMaster;
import com.example.entities.ProductMaster;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ProductBenRepository extends JpaRepository<ProductBenMaster, Long> 
{
	
	ProductBenMaster findByProduct(ProductMaster product);

}
