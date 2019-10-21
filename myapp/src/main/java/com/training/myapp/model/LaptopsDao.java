package com.training.myapp.model;


//import com.training.myapp.model.Laptops;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.training.myapp.model.DBUtil;

public class LaptopsDao {
	public boolean addLaptops(Laptops L)
	            {
	            	String query = "INSERT INTO laptops (companyName, modelNo, price) VALUES(?, ?, ?)";
	            	try (Connection connection = DBUtil.getConnection();
	        				PreparedStatement statement = connection.prepareStatement(query)){	
	            	statement.setString(1, L.getCompanyName());
	            	statement.setString(2, L.getModelNo());
	            	statement.setInt(3,L.getPrice());
	            			
	            			int count = statement.executeUpdate();
	            			if(count == 1)
	            				return true;				
	            		}
	catch(SQLException ex)
	{
	     ex.printStackTrace();
	}
	            		return false;
}
	public Laptops findEmployeeById(String companyName) {
		Laptops laptop = null;
		String query = "SELECT * FROM laptops WHERE companyName = "  + laptop.getCompanyName() ;	
		
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
			
			if(result.next()) {
				laptop = 
						new Laptops(result.getString(1), result.getString(2), result.getInt(3));
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return laptop;
	}
public List<Laptops> findAllLaptops() {
		
		String query = "SELECT * FROM Laptops";
		List<Laptops> laptops = new ArrayList<Laptops>();
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
		
			
			while(result.next()) {
				Laptops laptop = 
						new Laptops(result.getString(1), result.getString(2), result.getInt(3));
				laptops.add(laptop);
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return laptops;
	}

	}
