package com.bookmyshow.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	static Connection connection;

	public static Connection openConnection() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String username = "system";
			String password = "admin123";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return connection;
	}

	public static void closeConnection() {
		if (connection != null)
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		System.out.println("closeConnection");
	}
	
}
