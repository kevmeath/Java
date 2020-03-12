package com.oop.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileProcessor {
	private File file;
	private Scanner scanner;
	
	public FileProcessor(String filename) {
		setFile(filename);
	}
	
	public boolean checkRole(String role) {
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			if (line.contains(role)) {
				return true;
			}
		}
		return false;
	}

	public void writeNames(String name) {
		try {
			PrintWriter pw = new PrintWriter(file);
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		}
	}
	
	private void setFile(String filename) {
		file = new File(filename);
		try {
			scanner = new Scanner(file);
		}
		catch (FileNotFoundException e) {
			System.out.println("File not founds");
		}
	}
}
