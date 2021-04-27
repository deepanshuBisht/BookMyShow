package com.bookmyshow.main;

import com.bookmyshow.exception.ChoiceNotFoundException;
import com.bookmyshow.exception.IdNotFoundException;
import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;
import com.bookmyshow.service.MovieServiceImple;

public class Main {

	public static void main(String[] args) {
		MovieService service = new MovieServiceImple();
		
//		Movie movie = new Movie(01,"Passengers","English","116 Minutes","Romantic","Morten Tyldum","Jennifer Lawrence","During a voyage to a distant colony planet, Jim's hypersleep pod malfunctions, waking him up. He and fellow passenger Aurora must work together to prevent their spaceship from meeting with a disaster.", 250.0);
//		Movie movie = new Movie(02,"Iron Man","English","126 Minutes","Action","Jon Favreau","Robert Downey, Jr.","When Tony Stark, an industrialist, is captured, he constructs a high-tech armoured suit to escape. Once he manages to escape, he decides to use his suit to fight against evil forces to save the world.", 300.0);
//		Movie movie = new Movie(03,"Thor","English","115 Minutes","Fantasy","Kenneth Branagh","Chris Hemsworth","Thor is exiled by his father, Odin, the King of Asgard, to the Earth to live among mortals. When he lands on Earth, his trusted weapon Mjolnir is discovered and captured by S.H.I.E.L.D.", 350.0);
//		Movie movie = new Movie(04,"Edge of Tomorrow","English","113 Minutes","Sci-fi","Doug Liman","Tom Cruise","With the help of warrior Rita Vrataski, Major William Cage has to save Earth and the human race from an alien species, after being caught in a time loop.", 150.0);
		Movie movie = new Movie(05,"Alita: Battle Angel","English","122 Minutes","Sci-fi","Robert Rodriguez","Rosa Salazar","Alita, a battle cyborg, is revived by Ido, a doctor, who realises that she actually has the soul of a teenager. Alita then sets out to learn about her past and find her true identity.", 250.0);
		// add movies into data base
		service.addMovie(movie);
		
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
//		try {
//			service.deleteMovieById(3);
//		} catch (IdNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
