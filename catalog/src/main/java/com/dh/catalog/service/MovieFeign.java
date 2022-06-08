package com.dh.catalog.service;

import com.dh.catalog.dto.MovieDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MOVIE-SERVICE")
public interface MovieFeign {
    @RequestMapping(method = RequestMethod.GET, value = "movie/{genre}")
    List<MovieDTO> findMoviesByGenre(@PathVariable String genre);
}

