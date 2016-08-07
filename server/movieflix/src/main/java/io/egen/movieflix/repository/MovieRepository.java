package io.egen.movieflix.repository;

import java.util.List;

import io.egen.movieflix.entity.Movie;


public interface MovieRepository {
	
	public Movie findByTitle(String title);

	public List<Movie> findAll();

	public Movie findOne(String id);

	public Movie create(Movie movie);

	public Movie update(Movie movie);

	public void delete(String id);
}
