package com.oop.lab3;

public class HourlyEmployee extends Employee {
	
	private double hoursWorked;
	private double hourlyRate;
	
	public HourlyEmployee(String firstName, String surName, int staffNumber, double hoursWorked, double hourlyRate) {
		super(firstName, surName, staffNumber, 0);
		
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}	
	
	public double calculatePay() {
		return hoursWorked * hourlyRate;
	}
	
	public String toString() {
		return super.toString();
	}
}
