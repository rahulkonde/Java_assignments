package com.training.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FromAccountDao {

	public boolean addFromAccount(BankAccount fromaccount) {

		String query = "INSERT INTO fromaccount ( accountnumber,accountholdername,accounttype,balance ) VALUES (?,?,?,?)";
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setDouble(1, fromaccount.getAccountNumber());
			statement.setString(2, fromaccount.getAccountHolderName());
			statement.setString(3, fromaccount.getAccountType());
			statement.setDouble(4, fromaccount.getBalance());

			int count = statement.executeUpdate();
			if (count == 1)
				return true;
		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		return false;

	}
	
	public BankAccount findAccountById(long number) {
		String query = "SELECT * FROM fromaccount WHERE accountnumber = " + number;	
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

	public boolean updatebalance(BankAccount bankAccount) {
		String query1 = "UPDATE fromaccount set balance =?,accountholdername=? where accountnumber="
				+ bankAccount.getAccountNumber();
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query1)) {
			statement.setDouble(1, bankAccount.getBalance());
			statement.setString(2, bankAccount.getAccountHolderName());
			int count = statement.executeUpdate();
			System.out.println("Updated queries: " + count);
			int count1 = statement.executeUpdate();

			return true;
		} catch (SQLException ex) {
			ex.printStackTrace();

		}
		return false;
	}

	public boolean deletefromaccount(BankAccount bankAccount) {
		String query2 = "DELETE  FROM fromaccount where accountnumber = ?" ;
		try (Connection connection = DBUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query2)) {
			statement.setDouble(1, bankAccount.getAccountNumber());
			int count4 = statement.executeUpdate();
			System.out.println(count4);
			return true;
		} catch (SQLException ez) {
			ez.printStackTrace();
		}

		return false;

	}
}
//public boolean deletefromaccount(double accountnumber)
//{
//	
//	BankAccount bankaccount =  findaccountnumberByBankAccount(accountnumber);
//	if (bankaccount == null)
//		return false;
//	else 
//	{
//		String query = " DELETE FROM fromaccount WHERE accountnumber = 212131.0" + accountnumber;
//		try (Connection connection = DBUtil.getConnection();
//				PreparedStatement statement = connection.prepareStatement(query)) {
//			int count = statement.executeUpdate();
//			if(count == 1)
//				return true;				
//		}
//		catch(SQLException e) {
//			e.printStackTrace();
//		}
//		return false;
//	}
//	
//}
