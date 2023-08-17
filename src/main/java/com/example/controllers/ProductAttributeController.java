package com.example.controllers;

import com.example.entities.ProductAttribute;
import com.example.services.ProductAttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product-attributes")
public class ProductAttributeController {

    private final ProductAttributeService productAttributeService;

    @Autowired
    public ProductAttributeController(ProductAttributeService productAttributeService) {
        this.productAttributeService = productAttributeService;
    }

    @GetMapping(value="/get")
    public ResponseEntity<List<ProductAttribute>> getAllProductAttributes() {
        List<ProductAttribute> productAttributes = productAttributeService.getAllProductAttributes();
        return new ResponseEntity<>(productAttributes, HttpStatus.OK);
    }

    @GetMapping(value="/getbyid/{id}")
    public ResponseEntity<ProductAttribute> getProductAttributeById(@PathVariable Long id) {
        Optional<ProductAttribute> productAttribute = productAttributeService.getProductAttributeById(id);
        if (productAttribute.isPresent()) {
            return new ResponseEntity<>(productAttribute.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping(value = "/add")
    public ResponseEntity<ProductAttribute> createProductAttribute(@RequestBody ProductAttribute productAttribute) {
    	System.out.println("Mukund "+productAttribute);
        ProductAttribute createdAttribute = productAttributeService.createProductAttribute(productAttribute);
        return new ResponseEntity<>(createdAttribute, HttpStatus.CREATED);
    }

    @PutMapping(value = "/update/{id}")
    public void updateProductAttribute(@PathVariable Long id, @RequestBody ProductAttribute updatedProductAttribute) {
    	productAttributeService.updateProductAttribute(id, updatedProductAttribute);
       
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<Void> deleteProductAttribute(@PathVariable Long id) {
        productAttributeService.deleteProductAttribute(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
