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

import com.example.entities.AttributeMaster;
import com.example.services.IAttributeMaster;


@RestController  
@CrossOrigin("*")
public class AttributeMasterController {
	@Autowired
	IAttributeMaster a;
	
	
	 @GetMapping(value = "/allattributes")
	 public List<AttributeMaster> showAllProducts()
	 {
		  return a.getAllAttribute(); 
		
	 }
	
	 @DeleteMapping(value = "/attributes/{pid}")
	 public void deleteattribute(@PathVariable Long pid)
	 {
		a.delete(pid);
	 }
	 @PutMapping(value = "/attributes/{pid}")
	 public void updateAttribute(@RequestBody AttributeMaster attribute,@PathVariable Long pid)
	 {
		System.out.println("inside updateattri of controller");
		a.update(attribute, pid);
	 }
	 @PostMapping(value = "api/attribute")
	 public void addattribute(@RequestBody AttributeMaster attribute)
	 {
		System.out.println("addattri called");
		a.addAttribute(attribute);
	}
}
