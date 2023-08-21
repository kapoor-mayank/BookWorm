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
import com.example.services.GenreService;



@RestController
public class GenreMasterController {

    private final GenreService genreServices;

    @Autowired
    public GenreMasterController(GenreService genreServices) {
        this.genreServices = genreServices;
    }

    @GetMapping("/api/getGenres")
    public List<GenreMaster> getGenres() {
        return genreServices.getGenreMasters();
    }

    @GetMapping("/api/getGenresById/{id}")
    public Optional<GenreMaster> getGenreById(@PathVariable Long id) {
        return genreServices.getGenreMaster(id);
    }

    @GetMapping("/api/getGenreByName/{name}")
    public Optional<GenreMaster> getGenreByName(@PathVariable String name) {
        return genreServices.getGenreMasterByName(name);
    }

    @DeleteMapping("/api/deleteGenre/{id}")
    public void deleteGenre(@PathVariable Long id) {
        genreServices.deleteGenreMaster(id);
    }

    @PutMapping("/api/putGenre/{id}")
    public void updateGenre(@RequestBody GenreMaster genre, @PathVariable Long id) {
        genreServices.updateGenreMaster(genre, id);
    }

    @PostMapping("/api/postGenre")
    public void addGenre(@RequestBody GenreMaster genre) {
        genreServices.addGenreMaster(genre);
    }
}
