package com.training.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ToAccountDao {
	
	
	public boolean addToAccount(BankAccount toaccount) {

		String query = "INSERT INTO ToAccount ( accountnumber,accountholdername,accounttype,balance ) VALUES (?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setDouble(1, toaccount.getAccountNumber());
			statement.setString(2, toaccount.getAccountHolderName());
			statement.setString(3, toaccount.getAccountType());
			statement.setDouble(4, toaccount.getBalance());

			int count = statement.executeUpdate();
			if (count == 1)
				return true;
		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		return false;

	}
	public BankAccount findAccountById(long number) {
		String query = "SELECT * FROM toaccount WHERE accountnumber = " + number;	
		BankAccount account = null;
		
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) {
			
			if(result.next()) {
				account = 
						new BankAccount(result.getLong(1), result.getNString(2), result.getString(3), result.getDouble(4));
			}			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return account;
	}
	

}
