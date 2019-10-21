package com.training.myapp.model;

public class BankAccount {
	private long accountNumber;
	private String accountHolderName;
	private String accountType;
	private double balance;
	
	public BankAccount() {
		super();
	}
	
	

	public BankAccount(long accountNumber, String accountHolderName, String accountType, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.balance = balance;
	}

	public double getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "accountNumber= " + accountNumber + " accountHolderName=  " + accountHolderName + " amount=  "
				+ accountType + "balance=  " + balance ;
	}
	
	
	

}
