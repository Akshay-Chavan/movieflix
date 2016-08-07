package io.egen.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import io.egen.movieflix.entity.Movie;
import io.egen.movieflix.exception.MovieAlreadyExistsException;
import io.egen.movieflix.exception.MovieNotFoundException;
import io.egen.movieflix.repository.MovieRepository;


public class MovieServiceImp implements MovieService{
	
	@Autowired
	MovieRepository repository;

	@Override
	public List<Movie> findAll() {
		return repository.findAll();
	}

	@Override
	public Movie findOne(String id) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with id:" + id + " not found");
		}
		return existing;
	}

	@Override
	@Transactional
	public Movie create(Movie movie) {
		Movie existing = repository.findByTitle(movie.getTitle());
		if (existing != null) {
			throw new MovieAlreadyExistsException("Email is already in use: " + movie.getTitle());
		}
		return repository.create(movie);
	}

	@Transactional
	public Movie update(String id, Movie movie) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with id:" + id + " not found");
		}
		return repository.update(movie);
	}

	@Override
	@Transactional
	public void delete(String id) {
		Movie existing = repository.findOne(id);
		if (existing == null) {
			throw new MovieNotFoundException("Movie with id:" + id + " not found");
		}
		repository.delete(id);
	}

}
