package com.oop.lab3;

public class SalesEmployee extends Employee {

	private double commissionEarned;
	
	public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary, double commissionEarned) {
		super(firstName, surName, staffNumber, annualSalary);
		
		this.commissionEarned = commissionEarned;
	}	
	
	public double calculatePay() {
		return super.calculatePay() + commissionEarned;
	}
	
	public String toString() {
		return super.toString();
	}
}
