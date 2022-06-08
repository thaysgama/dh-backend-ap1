package com.dh.catalog.controller;

import com.dh.catalog.dto.MovieDTO;
import com.dh.catalog.service.CatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

    @Autowired
    private CatalogService service;

    @GetMapping("/{genre}")
    @ResponseStatus(HttpStatus.OK)
    public List<MovieDTO> findFilmsByGenre(@PathVariable String genre){
        return service.findMoviesByGenre(genre);
    }
}
