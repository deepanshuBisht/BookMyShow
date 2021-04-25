package com.bookmyshow.main;

import com.bookmyshow.exception.ChoiceNotFoundException;
import com.bookmyshow.exception.IdNotFoundException;
import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;
import com.bookmyshow.service.MovieServiceImple;

public class Main {

	public static void main(String[] args) {
		MovieService service = new MovieServiceImple();
		
//		Movie movie = new Movie(04,"Passengers","English","116 Minutes","Romantic","Morten Tyldum","Jennifer Lawrence","During a voyage to a distant colony planet, Jim's hypersleep pod malfunctions, waking him up. He and fellow passenger Aurora must work together to prevent their spaceship from meeting with a disaster.", 250.0);
//		// add movies into data base
//		service.addBook(movie);
//		
		// get all movies from data base
		System.out.println("******************GET ALL MOVIES********************");
		service.getAllMovie().forEach(System.out::println);
		
		// get movie by Id from data base
//		try {
//			System.out.println("******************GET BY ID********************");
//			System.out.println(service.getMovieById(4));
//		} catch (IdNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		// get movie by choice
//		try {
//			System.out.println("******************GET BY CHOICE********************");
//			service.getMovieByChoice("Eng").forEach(System.out::println);
//		} catch (ChoiceNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
//		// update movie price
//		try {
//			service.updateMovieById(4, 300.10);
//		} catch (IdNotFoundException e) {
//			e.printStackTrace();
//		}
//		
		// delete movie by Id
		try {
			service.deleteMovieById(3);
		} catch (IdNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
