package io.egen.movieflix.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.movieflix.entity.Actor;
import io.egen.movieflix.repository.ActorRepository;

public class ActorServiceImp implements ActorService{

	@Autowired
	ActorRepository repository;
	
	@Override
	public List<Actor> findAll(String movieId) {
		return repository.findAll(movieId);
	}
	
	

}
