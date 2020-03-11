package com.oop.lab4;

public class Control {
	public static void main(String[] args) {
		Account account1 = new Account("Account", null, null, false, 1000);
		DepositAccount account2 = new DepositAccount("Deposit", null, null, false, 1000, 0.01);
		CurrentAccount account3 = new CurrentAccount("Current", null, null, false, 1000, 0.01);
		
		account1.deposit(100);
		account1.withdraw(100);
		account1.getDetails();
		account1.valuableAccount();
		System.out.println(account1.getAccountNumber());
		
		account2.deposit(100);
		account2.withdraw(100);
		account2.getDetails();
		account2.valuableAccount();
		System.out.println(account2.getAccountNumber());
		
		account3.deposit(100);
		account3.withdraw(1500);
		account3.checkCredit();
		account3.checkCredit("warning");
		account3.getDetails();
		account3.valuableAccount();
		System.out.println(account3.getAccountNumber());
	}
}
