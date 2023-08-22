package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.ProductMaster;
import com.example.entities.ProductTypeMaster;

import java.util.List;


@Repository
public interface IProductMasterRepository extends JpaRepository<ProductMaster, Long> {

//	@Modifying
//	@Query("update ProductMaster p ")
//	void updateById(ProductMaster product, long id);
	
	@Query("SELECT p FROM ProductMaster p WHERE p.productType.typeId = :type_id")
	List<ProductMaster> findByProductType(@Param("type_id") long typeId);


}