package com.dh.movie.service;

import com.dh.movie.dto.MovieDTO;
import com.dh.movie.entity.Movie;
import com.dh.movie.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieRepository repository;

    @Override
    public MovieDTO save(MovieDTO movieDTO) {
        var movie = repository.save(new Movie(movieDTO));
        return new MovieDTO(movie);
    }

    @Override
    public List<MovieDTO> findByGenre(String genre) {
        return repository.findAllByGenre(genre).stream()
                .map(MovieDTO::new)
                .collect(Collectors.toList());
    }
}
