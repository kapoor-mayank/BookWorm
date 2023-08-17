package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ProductAttribute;
import com.example.services.ProductAttributeService;
	
@RestController
@RequestMapping("/api/product-attributes")
public class ProductAttributeController {

    @Autowired
    private ProductAttributeService productAttributeService;

    @GetMapping("/{id}")
    public Optional<ProductAttribute> getProductAttributeById(@PathVariable int id) {
        return productAttributeService.getProductAttributeById(id);
    }

    @GetMapping("/get")
    public List<ProductAttribute> getAllProductAttributes() {
        return productAttributeService.getAllProductAttributes();
    }

    @PostMapping("/add")
    public ProductAttribute createProductAttribute(@RequestBody ProductAttribute productAttribute) {
        return productAttributeService.addProductAttribute(productAttribute);
    }

    @PutMapping("/delete/{id}")
    public ProductAttribute updateProductAttribute(
            @PathVariable int id,
            @RequestBody ProductAttribute productAttribute
            
    ) {
        return productAttributeService.updateProductAttribute(id, productAttribute);
    }

    @DeleteMapping("/{id}")
    public void deleteProductAttribute(@PathVariable int id) {
        productAttributeService.deleteProductAttribute(id);
    }
   

}
	
