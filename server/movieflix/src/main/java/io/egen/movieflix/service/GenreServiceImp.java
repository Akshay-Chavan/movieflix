package io.egen.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.movieflix.entity.Genre;
import io.egen.movieflix.repository.GenreRepository;

public class GenreServiceImp implements GenreService{

	@Autowired
	GenreRepository repository;
	
	@Override
	public List<Genre> findAll(String movieId) {
		return repository.findAll(movieId);
	}

}
