package com.oop.lab7;

public class Control {

	public static void main(String[] args) {
		Job engineer = new Job(123456, "Engineer", 123);
		Employee e1 = new Employee("Kevin", "Meath", new Date(1,1,2000), "male", engineer, new Date(1,1,2020));
		System.out.println(e1.getPersonnelNumber());
		Employee e2 = new Employee("Kevin", "Meath", new Date(1,1,2000), "male", engineer, new Date(1,1,2020));
		System.out.println(e2.getPersonnelNumber());
	}
}
