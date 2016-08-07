package io.egen.movieflix.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.movieflix.entity.Writer;

public class WriterRepositoryImp implements WriterRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public List<Writer> findAll(String movieId) {
		TypedQuery<Writer> query = em.createNamedQuery("Writer.findByMovie", Writer.class);
		query.setParameter("movieId", movieId);
		return query.getResultList();
	}

}
