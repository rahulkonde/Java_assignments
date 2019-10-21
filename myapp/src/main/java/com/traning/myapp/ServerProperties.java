package com.traning.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ServerProperties {


		public static void main(String[] args) {
			
			final String DB_URL = "jdbc:mysql://localhost:3306/temp";
			final String DB_USERNAME = "root";
			final String DB_PASSWORD = "root";
			
			try(Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD)) {
				if(connection != null)
					System.out.println("-- connected --");
			}
			catch (SQLException e) {
				e.printStackTrace();
				System.out.println("-- Failed to connect --");
			}
		}
	}


