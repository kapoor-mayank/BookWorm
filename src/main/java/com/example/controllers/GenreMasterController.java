package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.GenreMaster;
import com.example.services.GenreMasterImplementation;


@RestController
public class GenreMasterController {
	
	@Autowired
	GenreMasterImplementation manager;

	@GetMapping(value = "api/genres")
	 public List<GenreMaster> getGenreMaster()
	 {
		System.out.println("in GetGenre method");
		  return manager.getGenreMaster(); 
		
	 }
	
	@GetMapping(value = "api/genresById/{id}")
	 public Optional<GenreMaster> getGenreMaster(@PathVariable Long id)
	 {
		Optional<GenreMaster> g=manager.getGenreMaster(id);
		return g;
	 }
	@GetMapping(value = "api/genresByName/{name}")
	 public Optional<GenreMaster>findGenreMasterByName(@PathVariable String name)
	 {
		Optional<GenreMaster> g=manager.getGenreMasterByName(name);
		return g;
	 }

	
	@DeleteMapping(value = "api/genres/{id}")
	 public void deleteGenreMaster(@PathVariable Long id)
	 {
		manager.deleteGenreMaster(id);
	 }
	@PutMapping(value = "api/genres/{pid}")
	 public void updateGenreMaster(@RequestBody GenreMaster g, Long id)
	 {
		System.out.println("inside updatepro of controller");
		manager.updateGenreMaster(g, id);
	 }
	@PostMapping(value = "api/products")
	 public void addpro(@RequestBody Product product)
	 {
		System.out.println("addpro called");
		manager.addProduct(product);
	 }
}
