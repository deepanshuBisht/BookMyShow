package com.bookmyshow.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bookmyshow.model.Movie;

public class MovieDAOImple implements MovieDAO{

	@Override
	public void addOneMovie(Movie movie) {
		String sql = "insert into movie values(?,?,?,?,?,?,?,?,?)";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, movie.getMovieId());
			statement.setString(2, movie.getTitle());
			statement.setString(3, movie.getLanguage());
			statement.setString(4, movie.getDuration());
			statement.setString(5, movie.getGener());
			statement.setString(6, movie.getDirector());
			statement.setString(7, movie.getActor());
			statement.setString(8, movie.getDescription());
			statement.setDouble(9, movie.getMoviePrice());
			statement.execute();
			System.out.println("Inserted \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		
	}

	@Override
	public int updateOneMovie(int movieId, double moviePrice) {
		String sql = "update Movie set price = ? where movieId = ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setDouble(1, moviePrice);
			statement.setInt(2, movieId);
			result = statement.executeUpdate();
			if(result == 1)
				System.out.println("Movie Price Updated \n");
			else
				System.out.println("Movie Price not Updated \n");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			if (statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	@Override
	public int deleteOneMovie(int movieId) {
		String sql = "delete from movie where movieId = ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		int result = 0;
		try {
			statement = connection.prepareStatement(sql);
			statement.setInt(1, movieId);
			result = statement.executeUpdate();
			if(result == 1)
				System.out.println("Movie Deleted \n");
			else
				System.out.println("Movie is not Deleted");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return result;
	}

	@Override
	public Movie findMovieById(int movieId) {
		String sql = "select * from movie where movieId = ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		Movie movie = null;
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setInt(1,movieId);
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				int movieid = rs.getInt("movieId");
				String title = rs.getString("title");
				String language = rs.getString("language");
				String duration = rs.getString("duration");
				String gener = rs.getString("gener");
				String director = rs.getString("director");
				String actor = rs.getString("actor");
				String description = rs.getString("description");
				Double moviePrice = rs.getDouble("price");
				movie = new Movie(movieid, title, language, duration, gener, director, actor, description, moviePrice);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return movie;
	}

	@Override
	public List<Movie> findAllMovies() {
		String sql = "select * from movie";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Movie> movieList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			ResultSet rs = statement.executeQuery();
			while(rs.next()) {
				int movieid = rs.getInt("movieId");
				String title = rs.getString("title");
				String language = rs.getString("language");
				String duration = rs.getString("duration");
				String gener = rs.getString("gener");
				String director = rs.getString("director");
				String actor = rs.getString("actor");
				String description = rs.getString("description");
				Double moviePrice = rs.getDouble("price");
				Movie movie = new Movie(movieid, title, language, duration, gener, director, actor, description, moviePrice);
				movieList.add(movie);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return movieList;
	}

	@Override
	public List<Movie> findMovieByChoice(String choice) {
		String sql = "select * from movie where title like ? or language like ?  or gener like ? or director like ? or actor like ?";
		Connection connection = DBConnection.openConnection();
		PreparedStatement statement = null;
		List<Movie> movieList = new ArrayList<>();
		try {
			statement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			statement.setString(1, "%"+choice+"%");
            statement.setString(2, "%"+choice+"%");
            statement.setString(3, "%"+choice+"%");
            statement.setString(4, "%"+choice+"%");
            statement.setString(5, "%"+choice+"%");
			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
				int movieid = rs.getInt("movieId");
				String title = rs.getString("title");
				String language = rs.getString("language");
				String duration = rs.getString("duration");
				String gener = rs.getString("gener");
				String director = rs.getString("director");
				String actor = rs.getString("actor");
				String description = rs.getString("description");
				Double moviePrice = rs.getDouble("price");
				Movie movie = new Movie(movieid, title, language, duration, gener, director, actor, description, moviePrice);
				movieList.add(movie);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}finally {
			if(statement != null)
				try {
					statement.close();
				} catch (SQLException e) {
					System.out.println(e.getMessage());
				}
			DBConnection.closeConnection();
		}
		return movieList;
	}

}
