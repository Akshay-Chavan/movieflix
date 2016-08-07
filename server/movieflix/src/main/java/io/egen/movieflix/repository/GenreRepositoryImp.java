package io.egen.movieflix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.movieflix.entity.Genre;

public class GenreRepositoryImp implements GenreRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Genre> findAll(String movieId) {
		TypedQuery<Genre> query = em.createNamedQuery("Genre.findByMovie", Genre.class);
		query.setParameter("movieId", movieId);
		return query.getResultList();
	}

}
