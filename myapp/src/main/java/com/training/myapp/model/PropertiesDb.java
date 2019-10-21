package com.training.myapp.model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDb {

	private static String DB_URL;
	private static String DB_USERNAME;
	private static String DB_PASSWORD;

	public static void main(String[] args) throws IOException {

		Properties proper = new Properties();
		proper.setProperty("DB_URL", "localhost");
		proper.setProperty("DB_USERNAME", "Rahul");
		proper.setProperty("DB_PASSWORD", "qwerty");

		OutputStream output = new FileOutputStream("C:/Users/rakonde/sts/myapp/src/main/resources/DBProperties.properties");
		proper.store(output, "work");

		InputStream input = new FileInputStream("C:/Users/rakonde/sts/myapp/src/main/resources/DBProperties.properties");
		proper.load(input);

		DB_URL = proper.getProperty("DB_URL");
		DB_PASSWORD = proper.getProperty("DB_PASSWORD");
		DB_USERNAME = proper.getProperty("DB_USERNAME");

		System.out.println(DB_URL+ "\n" + DB_USERNAME+ "\n" +DB_PASSWORD);

	}

}