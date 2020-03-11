package com.oop.lab1;

/****************************************
*	Control: The purpose of this class is to control and run things
*	Author: Kevin Meath
*	Date: 30/1/2020
*****************************************/

public class Control {
	public static void main(String[] args) {
		System.out.println("Hello world");
		
		Vehicle vehicle1 = new Vehicle("Kevin Meath", "20-D-1234");
		Vehicle vehicle2 = new Vehicle("Kevin Meath", "20-D-1234", 250, "Blue", "Manual", 4);
		
		System.out.println(vehicle1);
		System.out.println(vehicle2);
	}
}
