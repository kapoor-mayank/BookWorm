package com.example.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.entities.ProductAttribute;

import jakarta.transaction.Transactional;
@Repository
@Transactional
public interface ProductAttributeRepository extends JpaRepository<ProductAttribute, Integer>  {

//	@Query(value="select * from ProductAttribute where prod_att_id in(select b_id from batch where cid=(select cid from course where cname=:cname));",nativeQuery = true)
//	List<ProductAttribute> getStudents(@Param("cname")String cname);
}
