package com.bookmyshow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;
import com.bookmyshow.service.MovieServiceImple;

/**
 * Servlet implementation class AddMovieServlet
 */
@WebServlet("/addMovieServlet")
public class AddMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Add Movie Servlet");
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		String title = request.getParameter("title");
		String language = request.getParameter("language");
		String duration = request.getParameter("duration");
		String gener = request.getParameter("gener");
		String director = request.getParameter("director");
		String actor = request.getParameter("actor");
		String description = request.getParameter("description");
		double moviePrice = Double.parseDouble(request.getParameter("moviePrice"));

		Movie movie = new Movie();
		movie.setMovieId(movieId);
		movie.setTitle(title);
		movie.setLanguage(language);
		movie.setDuration(duration);
		movie.setGener(gener);
		movie.setDirector(director);
		movie.setActor(actor);
		movie.setDescription(description);
		movie.setMoviePrice(moviePrice);
		
		MovieService service = new MovieServiceImple();
		service.addMovie(movie);
		
		RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
