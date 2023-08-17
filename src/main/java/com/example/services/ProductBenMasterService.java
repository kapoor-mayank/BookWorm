package com.example.services;

import java.util.List;
import com.example.entities.ProductBenMaster;

public interface ProductBenMasterService {
	List<ProductBenMaster> getByProdBenId(Long prodBenId);
	List<ProductBenMaster> getByProdBenPercentage(double prodBenPercentage);
}
