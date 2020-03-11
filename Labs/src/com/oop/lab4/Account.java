package com.oop.lab4;

public class Account implements ValidatedAccount {
	private String accountName;
	private static int accountNumber = 1;
	private String sortCode;
	private String branchName;
	private boolean inCredit;
	private double accountBalance;
	
	public Account(String accountName, String sortCode, String branchName, boolean inCredit, double acctBalance) {
		this.accountName = accountName;
		this.accountNumber = accountNumber++;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		this.accountBalance = acctBalance;
		
	}
	
	public void	deposit(double depositAmount) {
		accountBalance += depositAmount;
	}
	
	public void withdraw(double withdrawAmount) {
		accountBalance -= withdrawAmount;
		
		if (accountBalance < 0) {
			inCredit = false;
		}
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getSortCode() {
		return sortCode;
	}

	public void setSortCode(String sortCode) {
		this.sortCode = sortCode;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public boolean isInCredit() {
		return inCredit;
	}

	public void setInCredit(boolean inCredit) {
		this.inCredit = inCredit;
	}

	public double getAcctBalance() {
		return accountBalance;
	}

	public void setAcctBalance(double acctBalance) {
		this.accountBalance = acctBalance;
	}

	@Override
	public void getDetails() {
		System.out.println(accountName);
	}

	@Override
	public void valuableAccount() {
		System.out.println("Balance: " + accountBalance);
	}
}
