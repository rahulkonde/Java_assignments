package com.traning.myapp;

import java.time.LocalDateTime;

import com.training.myapp.model.BankAccount;
import com.training.myapp.model.BankAccountTransactionDao;
import com.training.myapp.model.FromAccountDao;
import com.training.myapp.model.Laptops;
import com.training.myapp.model.ToAccountDao;
import com.training.myapp.model.Transaction;

public class BankAccountTransactionMain {
	public static void main(String[] args) {
		FromAccountDao account1 = new FromAccountDao();
		BankAccount account2=new BankAccount();
		
//		if (account1.addFromAccount(new BankAccount(987654,"charan", "savings", 40000)))
//			 
//			
//			System.out.println("account details found");
//		else
//			System.out.println("details not found");
//		System.out.println(account2.getBalance());
//		
		
	
	
//	
//		if (account1.updatebalance(new BankAccount (987654, "ramesh","savings",50000)))
//				System.out.println("updated");
//		else 
//			System.out.println("unable to update ");
//				
			
//		if (account1.deletefromaccount(new BankAccount(987654, "ramesh","savings",50000)))
//			System.out.println("deleted");
//		else 
//			System.out.println("unable to delete");
//		
		ToAccountDao account3 = new ToAccountDao();
//		if 
//	(account3.addToAccount(new BankAccount (454565,"suresh","savings", 5000)))
//				System.out.println("added");
//				
//		else
//			System.out.println("unale to add");
//		}
		
		BankAccountTransactionDao b = new BankAccountTransactionDao();
		if (b.transactionBetweenTwoAccounts(account1.findAccountById(987654), account3.findAccountById(454565),new Transaction(123, LocalDateTime.now(), 2000)))
			System.out.println("Transaction is successfull");
		else
			System.out.println("transaction  failed");
}}
	
	
	
	
	
	
	
	

