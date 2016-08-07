package io.egen.movieflix.service;

import java.util.List;

import io.egen.movieflix.entity.Writer;

public interface WriterService {
	
	public List<Writer> findAll(String movieId);

}
