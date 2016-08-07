package io.egen.movieflix.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table
public class IMDB {
	
	@Id
	@GenericGenerator(name = "customUUID", strategy = "uuid2")
	@GeneratedValue(generator = "customUUID")
	String id;
	String imdbVotes;
	String imdbRating;
	
	public IMDB(){
		
	}
	
	public IMDB(String id, String imdbVotes, String imdbRating) {
		super();
		this.id = id;
		this.imdbVotes = imdbVotes;
		this.imdbRating = imdbRating;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getImdbVotes() {
		return imdbVotes;
	}
	public void setImdbVotes(String imdbVotes) {
		this.imdbVotes = imdbVotes;
	}
	public String getImdbRating() {
		return imdbRating;
	}
	public void setImdbRating(String imdbRating) {
		this.imdbRating = imdbRating;
	}
	@Override
	public String toString() {
		return "IMDB [id=" + id + ", imdbVotes=" + imdbVotes + ", imdbRating=" + imdbRating + "]";
	}
	
	
	

}
