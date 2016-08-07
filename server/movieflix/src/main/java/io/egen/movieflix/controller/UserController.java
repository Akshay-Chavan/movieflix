package io.egen.movieflix.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix.service.UserService;

@RestController
@RequestMapping(path = "movies/actor/")
public class UserController {
	
	@Autowired
	UserService service;
	
	@RequestMapping(method = RequestMethod.GET)
	public boolean validateUser(String userName, String password, String userType){
		
		return service.validateUser(userName, password, userType);
	}

}
