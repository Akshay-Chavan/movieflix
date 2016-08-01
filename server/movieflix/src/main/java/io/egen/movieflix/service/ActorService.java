package io.egen.movieflix.service;

import java.util.List;

import io.egen.movieflix.entity.Actor;


public interface ActorService {
	
	public List<Actor> findAll(String movieId);

}
