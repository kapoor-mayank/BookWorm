package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.ProductMaster;

@Repository
public interface IProductMasterRepository extends JpaRepository<ProductMaster, Long> {

	void updateProduct(long id, ProductMaster obj);

}