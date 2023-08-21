package com.example.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
<<<<<<< HEAD
import org.springframework.web.bind.annotation.PutMapping;
=======
>>>>>>> a0a538e2648ce6abccac512e89d9b7e81da00c7f
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.GenreMaster;
import com.example.services.GenreMasterService;



@RestController
public class GenreMasterController {
	
	 private final GenreMasterService gmi;
	
	 @Autowired
	public GenreMasterController(GenreMasterService gmi) {
		this.gmi=gmi;
	}
	
	@GetMapping(value = "api/getGenres")
	 public List<GenreMaster> getGenres()
	 {
		System.out.println("in getGenres method");
		  return gmi.getGenreMasters(); 
		
	 }
	
	@GetMapping(value = "api/getGenresById/{id}")
	 public Optional<GenreMaster> getGenreById(@PathVariable Long id)
	 {
		Optional<GenreMaster> p=gmi.getGenreMaster(id);
		return p;
	 }
	
<<<<<<< HEAD
	@GetMapping(value = "api/getGenreByName/{name}")
	 public Optional<GenreMaster> getGenreByName(@PathVariable String name)
	 {
		Optional<GenreMaster> p=gmi.getGenreMasterBygenreDesc(name);
		return p;
	 }
=======
//	@GetMapping(value = "api/getGenreByName/{name}")
//	 public Optional<GenreMaster> getGenreByName(@PathVariable String name)
//	 {
//		Optional<GenreMaster> p=gmi.findGenreMasterByName(name);
//		return p;
//	 }
>>>>>>> a0a538e2648ce6abccac512e89d9b7e81da00c7f

	@DeleteMapping(value = "api/deleteGenre/{id}")
	 public void deleteGenre(@PathVariable Long id)
	 {
		gmi.deleteGenreMaster(id);
	 }
	
<<<<<<< HEAD
	 @PutMapping(value = "api/putGenre/{id}")
     public void updateGenre(@RequestBody GenreMaster g,@PathVariable Long id)
	 {
	    System.out.println("inside updateGenreMasters of controller");
		gmi.updateGenreMaster(g, id);
	 }
=======
	// @PutMapping(value = "api/putGenre/{id}")
//	 public void updateGenre(@RequestBody GenreMaster g,@PathVariable Long id)
//	 {
//		System.out.println("inside updateGenreMasters of controller");
//		gmi.updateGenreMaster(g, id);
//	 }
>>>>>>> a0a538e2648ce6abccac512e89d9b7e81da00c7f
	@PostMapping(value = "api/postGenre")
	 public void addGenre(@RequestBody GenreMaster g)
	 {
		System.out.println("addGenre called");
		gmi.addGenreMaster( g ); 
	 }
}
