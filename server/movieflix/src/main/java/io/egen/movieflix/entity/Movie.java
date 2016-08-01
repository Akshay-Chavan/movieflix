package io.egen.movieflix.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
@NamedQueries({ 
	@NamedQuery(name = "Movie.findAll", query = "SELECT m FROM Movie m ORDER BY m.title ASC"),
	@NamedQuery(name = "Movie.findByTitle", query = "SELECT m FROM Movie m WHERE m.title=:mTitle") 
})
public class Movie {
	
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	private String id;
	private String title, rated, released, runTime, director, plot, 
	language, country, poster, type, metascore;
	int year;
	
	@OneToMany
	private List<Actor> actor;
	
	public List<Actor> getActor() {
		return actor;
	}

	public void setActor(List<Actor> actor) {
		this.actor = actor;
	}
	@OneToMany
	private List<Genre> genre;
	
	public List<Genre> getGenre() {
		return genre;
	}

	public void setGenre(List<Genre> genre) {
		this.genre = genre;
	}

	public Movie(){
		
	}
	
	public Movie(String id, String title, String rated, String released, String runTime, String director, String plot,
			String language, String country, String poster, String type, String metascore, int year) {
		super();
		this.id = id;
		this.title = title;
		this.rated = rated;
		this.released = released;
		this.runTime = runTime;
		this.director = director;
		this.plot = plot;
		this.language = language;
		this.country = country;
		this.poster = poster;
		this.type = type;
		this.metascore = metascore;
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getRated() {
		return rated;
	}
	public void setRated(String rated) {
		this.rated = rated;
	}
	public String getReleased() {
		return released;
	}
	public void setReleased(String released) {
		this.released = released;
	}
	public String getRunTime() {
		return runTime;
	}
	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getPlot() {
		return plot;
	}
	public void setPlot(String plot) {
		this.plot = plot;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPoster() {
		return poster;
	}
	public void setPoster(String poster) {
		this.poster = poster;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMetascore() {
		return metascore;
	}
	public void setMetascore(String metascore) {
		this.metascore = metascore;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", rated=" + rated + ", released=" + released + ", runTime="
				+ runTime + ", director=" + director + ", plot=" + plot + ", language=" + language + ", country="
				+ country + ", poster=" + poster + ", type=" + type + ", metascore=" + metascore + ", year=" + year
				+ "]";
	}
	
	

}
