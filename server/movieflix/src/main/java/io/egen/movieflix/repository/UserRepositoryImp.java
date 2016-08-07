package io.egen.movieflix.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import io.egen.movieflix.entity.User;

public class UserRepositoryImp implements UserRepository{
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public boolean validateUser(String userName, String password, String userType) {
		TypedQuery<User> query = em.createNamedQuery("User.findByCredentials", User.class);
		query.setParameter("userId", userName);
		query.setParameter("password", password);
		query.setParameter("userType", userType);
		User user = query.getSingleResult();
		if(user.getUserName().equals(userName)&&user.getPassword().equals(password)){
			return true;
		}else{
			return false;
		}
		
	}

}
