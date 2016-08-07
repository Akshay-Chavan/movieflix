package io.egen.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.movieflix.entity.Writer;
import io.egen.movieflix.repository.WriterRepository;

public class WriterServiceImp implements WriterService{
	
	@Autowired
	WriterRepository repository;
	
	@Override
	public List<Writer> findAll(String movieId) {
		return repository.findAll(movieId);
	}

}
