package com.example.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.ProductTypeMaster;
import com.example.services.IProductTypeMaster;


@RestController  
@CrossOrigin("*")
public class ProductTypeMasterController {
	


	
		@Autowired
		IProductTypeMaster p;
		
		
		 @GetMapping(value = "/allproducts")
		 public List<ProductTypeMaster> showAllProducts()
		 {
			  return p.getAllProducts(); 
			
		 }
		
		 @DeleteMapping(value = "/products/{pid}")
		 public void deleteProduct(@PathVariable Long pid)
		 {
			p.delete(pid);
		 }
		 @PutMapping(value = "/products/{pid}")
		 public void updateProduct(@RequestBody ProductTypeMaster product,@PathVariable Long pid)
		 {
			System.out.println("inside updatepro of controller");
			p.update(product, pid);
		 }
		 @PostMapping(value = "api/products")
		 public void addpro(@RequestBody ProductTypeMaster product)
		 {
			System.out.println("addpro called");
			p.addProductType(product);
		 }
	

}
