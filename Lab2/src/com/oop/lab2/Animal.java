package com.oop.lab2;

public class Animal {
	private String name;
	private String breed;
	private int age;
	private boolean domestic;
	private String colour;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, String breed, int age, boolean domestic, String colour) {
		this.name = name;
		this.breed = breed;
		this.age = age;
		this.domestic = domestic;
		this.colour = colour;
	}
	
	public void makeNoise() {
		if(breed == "dog") {
			System.out.println("bark");
		}
		else if(breed == "bird") {
			System.out.println("chirp");
		}
		else if(breed == "lion") {
			System.out.println("roar");
		}
		else if(breed == "turtle") {
			System.out.println("hiss");
		}
	}
	
	public void makeNoise(boolean old) {
		System.out.println("Quiet animal");
	}
	
	public String toString() {
		String stringDomestic = domestic ? "domestic" : "not domestic";
		return "This animal is called " + name + ", is a " + breed + ", is " + age + " years old, is " + stringDomestic + " and is coloured " + colour;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setDomestic(boolean domestic) {
		this.domestic = domestic;
	}
	
	public boolean getDomestic() {
		return domestic;
	}
	
	public void setColour(String colour) {
		this.colour = colour;
	}
	
	public String getColour() {
		return colour;
	}
}
