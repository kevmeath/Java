package com.oop.lab4;

public class DepositAccount extends Account {
	private double interestRate;
	
	public DepositAccount(String accountName, String sortCode, String branchName, boolean inCredit, double accountBalance, double interestRate) {
		super(accountName, sortCode, branchName, inCredit, accountBalance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double withdrawAmount) {
		System.out.println("You cannot withdraw from a deposit account");
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
}
