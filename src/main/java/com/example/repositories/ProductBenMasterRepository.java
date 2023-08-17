package com.example.repositories;
import com.example.Entitiy.ProductBenMaster;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface ProductBenMasterRepository extends JpaRepository <ProductBenMaster, Long> {

//List<ProductBenMaster> getByProdBenId(long prodBenId);
//
//List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage);
}
