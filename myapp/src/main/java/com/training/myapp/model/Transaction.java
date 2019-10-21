package com.training.myapp.model;

import java.time.LocalDateTime;

public class Transaction {
private long transactionID;
private LocalDateTime transaction_time_stamp;
private double transactionAmount;
private BankAccount accountNumber;
public Transaction() {
	super();
}
public Transaction(long transactionID, LocalDateTime transaction_time_stamp, double transactionAmount) {
	super();
	this.transactionID = transactionID;
	this.transaction_time_stamp = transaction_time_stamp;
	this.transactionAmount = transactionAmount;
	this.accountNumber = accountNumber;
}
public double getTransactionID() {
	return transactionID;
}
public void setTransactionID(long transactionID) {
	this.transactionID = transactionID;
}
public LocalDateTime getTransaction_time_stamp() {
	return transaction_time_stamp;
}
public void setTransaction_time_stamp(LocalDateTime transaction_time_stamp) {
	this.transaction_time_stamp = transaction_time_stamp;
}
public double getTransactionAmount() {
	return transactionAmount;
}
public void setTransactionAmount(double transactionAmount) {
	this.transactionAmount = transactionAmount;
}
public BankAccount getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(BankAccount accountNumber) {
	this.accountNumber = accountNumber;
}
@Override
public String toString() {
	return "Transaction [transactionID=" + transactionID + ", transaction_time_stamp=" + transaction_time_stamp
			+ ", transactionAmount=" + transactionAmount + ", accountNumber=" + accountNumber + "]";
}

}
