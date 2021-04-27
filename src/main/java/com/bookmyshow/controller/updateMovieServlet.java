package com.bookmyshow.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookmyshow.exception.IdNotFoundException;
import com.bookmyshow.model.Movie;
import com.bookmyshow.service.MovieService;
import com.bookmyshow.service.MovieServiceImple;

/**
 * Servlet implementation class ViewServlet
 */
@WebServlet("/updateMovieServlet")
public class updateMovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateMovieServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Update Movie Servlet");
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		MovieService service = new MovieServiceImple();
		Movie movie = null;
		try {
			movie = service.getMovieById(movieId);
		} catch (IdNotFoundException e) {
			e.printStackTrace();
		}
		if (movie == null) {
			request.setAttribute("message", "Movie not found with this ID");
			RequestDispatcher rd = request.getRequestDispatcher("updateMovie.jps");
			rd.forward(request, response);
		}
	
		RequestDispatcher rd = request.getRequestDispatcher("Update.jsp");
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
