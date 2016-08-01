package io.egen.movieflix.repository;

import java.util.List;

import io.egen.movieflix.entity.Writer;

public interface WriterRepository {
	
	public List<Writer> findAll(String movieId);

}
