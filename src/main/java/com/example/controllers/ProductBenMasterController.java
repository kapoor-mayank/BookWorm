package com.example.controllers;

import com.example.Entitiy.ProductBenMaster;
import com.example.services.ProductBenMasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class ProductBenMasterController {
	@Autowired
    private  ProductBenMasterService productBenMasterService;

	 @GetMapping(value = "/allproduct")
	 public List<ProductBenMaster> showAllProducts()
	 {
		  return productBenMasterService.getAllProduct(); 
		
	 }
    

    @GetMapping("/byid/{prodBenId}")
    public Optional<ProductBenMaster> getByProdBenId(@PathVariable Long prodBenId) {
        return productBenMasterService.getByProdBenId(prodBenId);
    }

    @GetMapping("/by-percentage/{prodBenPercentage}")
    public List<ProductBenMaster> getByProdBenPercentage(@PathVariable double prodBenPercentage) {
        return productBenMasterService.getByProdBenPercentage(prodBenPercentage);
    }
    @PostMapping(value = "api/addProduct")
	 public void addpro(@RequestBody ProductBenMaster product)
	 {
		System.out.println("addproduct called");
		 productBenMasterService.addProduct(product);
	 }
    
    @PutMapping(value="api/updateProduct/{id}")
    public ProductBenMaster ProductBenMaster(@PathVariable Long id,@RequestBody ProductBenMaster probenmaster)
    {
    	ProductBenMaster newmaster=productBenMasterService.updateProduct(probenmaster, id);
    	return newmaster;
    }
    
    @DeleteMapping(value = "/deleteProduct/{prodBenId}")
	 public void deleteProduct(@PathVariable Long prodBenId)
	 {
    	 productBenMasterService.delete(prodBenId);
	 }
}
