package io.egen.movieflix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.movieflix.entity.Actor;

public class ActorRepositoryImp implements ActorRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Actor> findAll(String movieId) {
		TypedQuery<Actor> query = em.createNamedQuery("Actor.findByMovie", Actor.class);
		query.setParameter("movieId", movieId);
		return query.getResultList();
	}

}
