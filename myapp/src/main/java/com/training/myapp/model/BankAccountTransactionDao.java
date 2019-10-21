package com.training.myapp.model;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class BankAccountTransactionDao {
	
	public boolean transactionBetweenTwoAccounts(BankAccount account1,BankAccount account2,Transaction transact) {
		try(Connection connection=DBUtil.getConnection()){
			Statement statement=connection.createStatement();
					statement.addBatch("UPDATE fromaccount SET balance="+(account1.getBalance()-transact.getTransactionAmount())+"where accountnumber="+account1.getAccountNumber());
			statement.addBatch("UPDATE toaccount SET balance="+(account2.getBalance()+transact.getTransactionAmount())+"where accountnumber="+account2.getAccountNumber());
			statement.executeBatch();
			return true;			
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		return false;
		
	}

}
