package com.bookmyshow.service;

import java.util.List;
import java.util.stream.Collectors;

import com.bookmyshow.dao.MovieDAO;
import com.bookmyshow.dao.MovieDAOImple;
import com.bookmyshow.exception.ChoiceNotFoundException;
import com.bookmyshow.exception.IdNotFoundException;
import com.bookmyshow.model.Movie;

public class MovieServiceImple implements MovieService{
	
	MovieDAO service = new MovieDAOImple();

	@Override
	public void addMovie(Movie movie) {
		service.addOneMovie(movie);
	}

	@Override
	public void updateMovieById(int movieId, double moviePrice) throws IdNotFoundException {
		int result = service.updateOneMovie(movieId, moviePrice);
		if(result == 0)
			throw new IdNotFoundException("Invalid ID for Updating Movie Price");
	}

	@Override
	public void deleteMovieById(int bookId) throws IdNotFoundException {
		int result = service.deleteOneMovie(bookId);
		if(result == 0)
			throw new IdNotFoundException("Invalid ID for Deleting Movie");
	}

	@Override
	public Movie getMovieById(int movieId) throws IdNotFoundException {
		Movie movie = service.findMovieById(movieId);
		if(movie == null)
			throw new IdNotFoundException("Invalid ID for Searching Movie");
		return movie;
	}

	@Override
	public List<Movie> getAllMovie() {
		return service.findAllMovies().stream().sorted((b1,b2)->b1.getTitle().compareToIgnoreCase(b2.getTitle()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Movie> getMovieByChoice(String choice) throws ChoiceNotFoundException {
		List<Movie> movieList = service.findMovieByChoice(choice);
		if(movieList.isEmpty())
			throw new ChoiceNotFoundException("Choice not found");
		return movieList;
	}

}
