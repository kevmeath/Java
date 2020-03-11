package com.oop.lab4;

public class CurrentAccount extends Account {
	private double penaltyAmount;
	
	public CurrentAccount(String accountName, String sortCode, String branchName, boolean inCredit, double accountBalance, double penaltyAmount) {
		super(accountName, sortCode, branchName, inCredit, accountBalance);
		this.penaltyAmount = penaltyAmount;
	}

	public void withdraw(double withdrawAmount) {
		if (getAcctBalance() > withdrawAmount) {
			setAcctBalance(getAcctBalance() - withdrawAmount);
		}
		else {
			System.out.println("Insufficient funds");
		}
	}

	public String checkCredit() {
		return isInCredit() ? "In credit" : "Not in credit";
	}

	public void checkCredit(String warningMsg) {
		if (getAcctBalance() > 0 && getAcctBalance() < 100) {
			System.out.println(warningMsg);
		}
	}

	public double getPenaltyAmount() {
		return penaltyAmount;
	}

	public void setPenaltyAmount(double penaltyAmount) {
		this.penaltyAmount = penaltyAmount;
	}
}
