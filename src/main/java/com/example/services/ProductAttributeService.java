package com.example.services;

import java.util.List;
import java.util.Optional;

import com.example.entities.ProductAttribute;

public interface ProductAttributeService {

	
	
	List<ProductAttribute> getAllProductAttributes();

    Optional<ProductAttribute> getProductAttributeById(int id);

    ProductAttribute addProductAttribute(ProductAttribute productAttribute);

    ProductAttribute updateProductAttribute(int id, ProductAttribute productAttribute);

    void deleteProductAttribute(int id);
	
}
