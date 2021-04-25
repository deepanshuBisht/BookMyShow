package com.bookmyshow.model;

public class Movie {
	
	int movieId;
	String title;
	String language;
	String duration;
	String gener;
	String director;
	String actor;
	String description;
	Double moviePrice;
	
	public Movie() {
		super();
	}

	public Movie(int movieId, String title, String language, String duration, String gener, String director,
			String actor, String description, Double moviePrice) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.language = language;
		this.duration = duration;
		this.gener = gener;
		this.director = director;
		this.actor = actor;
		this.description = description;
		this.moviePrice = moviePrice;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public String getGener() {
		return gener;
	}

	public void setGener(String gener) {
		this.gener = gener;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Double getMoviePrice() {
		return moviePrice;
	}

	public void setMoviePrice(Double moviePrice) {
		this.moviePrice = moviePrice;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", title=" + title + ", language=" + language + ", duration=" + duration
				+ ", gener=" + gener + ", director=" + director + ", actor=" + actor + ", description=" + description
				+ ", moviePrice=" + moviePrice + "]";
	}
	
}
