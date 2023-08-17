package com.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import com.example.entities.ProductBenMaster;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface ProductBenMasterRepository extends JpaRepository<ProductBenMaster, Integer> {
	List<ProductBenMaster> getByProdBenId(Long prodBenId);
	List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage);
}
