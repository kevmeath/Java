package com.oop.lab2;

import java.util.Scanner;

public class Control {
	public static void main(String[] args) {
		Animal dog = new Animal("Mick", "dog", 15, false, "grey");
		Animal bird = new Animal("Sarah", "bird", 66, false, "black");
		Animal lion = new Animal("Leo", "lion", 9, true, "brown");
		Animal turtle = new Animal("Theresa", "turtle", 122, false, "brown");
		
		System.out.println(dog);
		System.out.println(bird);
		System.out.println(lion);
		System.out.println(turtle);
		
		dog.makeNoise();
		bird.makeNoise();
		lion.makeNoise();
		turtle.makeNoise();
	}
	
	public void createAnimal() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter animal name: ");
		String name = input.nextLine();
		System.out.println("Enter animal breed: ");
		String breed = input.nextLine();
		System.out.println("Enter animal age: ");
		int age = Integer.valueOf(input.nextLine());
		System.out.println("Is this animal domestic? ");
		boolean domestic;
		if(input.nextLine() == "y") {
			domestic = true;
		}
		else {
			domestic = false;
		}
		System.out.println("Enter animal colour: ");
		String colour = input.nextLine();
		
		Animal newAnimal = new Animal(name, breed, age, domestic, colour);
	}
}
