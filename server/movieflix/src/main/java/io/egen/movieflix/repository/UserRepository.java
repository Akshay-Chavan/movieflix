package io.egen.movieflix.repository;

public interface UserRepository {
	
	public boolean validateUser(String userName, String password, String userType);

}
