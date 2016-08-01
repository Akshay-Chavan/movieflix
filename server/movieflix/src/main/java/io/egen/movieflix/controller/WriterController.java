package io.egen.movieflix.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.egen.movieflix.entity.Writer;
import io.egen.movieflix.service.WriterService;

@RestController
@RequestMapping(path = "movie/{id}/writers")
public class WriterController {
	
	@Autowired
	WriterService service;
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Writer> findAll(@PathVariable("id") String movieId) {
		return service.findAll(movieId);
	}

}
