package com.example.respositaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.entities.AttributeMaster;

public interface AttributeMasterRepository extends JpaRepository<AttributeMaster,Long> {
	
	@Modifying
	@Query("update AttributeMaster a set a.attribute_desc =:attributeDesc where a.attribute_id=:attrinute_id" )
	void update(@Param("attribute_desc")String attribute_desc, @Param("attribute_id")Long attribute_id) ;
	

}
