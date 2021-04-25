package com.bookmyshow.dao;

import java.util.List;

import com.bookmyshow.model.Movie;

public interface MovieDAO {
	
	void addOneMovie(Movie movie);
	int updateOneMovie(int bookId, double price);
	int deleteOneMovie(int bookId);
	
	Movie findMovieById(int movieId);
	
	List<Movie> findAllMovies();
	List<Movie> findMovieByChoice(String choice);
	
}
