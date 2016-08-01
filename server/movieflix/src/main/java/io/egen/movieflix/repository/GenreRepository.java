package io.egen.movieflix.repository;

import java.util.List;

import io.egen.movieflix.entity.Genre;

public interface GenreRepository {
	
	public List<Genre> findAll(String movieId);

}
