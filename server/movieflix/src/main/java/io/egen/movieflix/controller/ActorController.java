package io.egen.movieflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix.entity.Actor;
import io.egen.movieflix.service.ActorService;

@RestController
@RequestMapping(path = "movies/{id}/actors")
public class ActorController {
	
	@Autowired
	ActorService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Actor> findAll(@PathVariable("id") String movieId) {
		return service.findAll(movieId);
	}

	

}
