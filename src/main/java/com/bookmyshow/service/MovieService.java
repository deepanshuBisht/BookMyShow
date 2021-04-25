package com.bookmyshow.service;

import java.util.List;

import com.bookmyshow.exception.ChoiceNotFoundException;
import com.bookmyshow.exception.IdNotFoundException;
import com.bookmyshow.model.Movie;


public interface MovieService {

	void addMovie(Movie movie);
	void updateMovieById(int movieId, double moviePrice) throws IdNotFoundException;
	void deleteMovieById(int bookId) throws IdNotFoundException;
	
	Movie getMovieById(int bookId) throws IdNotFoundException;
	List<Movie> getAllMovie();
	List<Movie> getMovieByChoice(String choice) throws ChoiceNotFoundException;
	
}
