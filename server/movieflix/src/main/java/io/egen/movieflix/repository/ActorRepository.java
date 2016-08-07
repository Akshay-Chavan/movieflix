package io.egen.movieflix.repository;

import java.util.List;

import io.egen.movieflix.entity.Actor;

public interface ActorRepository {
	
	public List<Actor> findAll(String movieId);

}
