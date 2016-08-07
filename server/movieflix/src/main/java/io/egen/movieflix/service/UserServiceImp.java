package io.egen.movieflix.service;

import org.springframework.beans.factory.annotation.Autowired;

import io.egen.movieflix.repository.UserRepository;

public class UserServiceImp implements UserService{
	
	@Autowired
	UserRepository repository;

	@Override
	public boolean validateUser(String userName, String password, String userType) {
		return repository.validateUser(userName, password, userType);
	}

}
