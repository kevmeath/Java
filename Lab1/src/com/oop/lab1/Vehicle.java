package com.oop.lab1;

/****************************************
*	Control: The purpose of this class is to represent vehicles
*	Author: Kevin Meath
*	Date: 30/1/2020
*****************************************/

public class Vehicle {
	private String owner;
	private String registration;
	private int maxSpeed;
	private String colour;
	private String transmission;
	private int wheels;
	
	public Vehicle(String owner, String registration) {
		this.owner = owner;
		this.registration = registration;
	}
	
	public Vehicle(String owner, String registration, int maxSpeed, String colour, String transmission, int wheels) {
		this.owner = owner;
		this.registration = registration;
		this.maxSpeed = maxSpeed;
		this.colour = colour;
		this.transmission = transmission;
		this.wheels = wheels;
	}
	
	public String toString() {
		String content = "\nOwner: " + owner + "\nRegistration: " + registration.toUpperCase() + "\nMax speed: " + maxSpeed + "\nColour " + colour + "\nTransmission: " + transmission + "\nWheels: " + wheels;
		return content;
	}
}
