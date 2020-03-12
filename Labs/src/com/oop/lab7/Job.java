package com.oop.lab7;

public class Job {
	private double salary;
	private String role;
	private int jobID;
	
	public Job(double salary, String role, int jobID) {
		this.salary = salary;
		this.role = role;
		this.jobID = jobID;
		
		FileProcessor fp = new FileProcessor("C:/Users/km/College/OOP/OOP-Java/Labs/src/com/oop/lab7/roles.txt");
		fp.checkRole(role);
	}
	
	public String toString() {
		return "JobID: " + jobID + "\nRole: " + role + "\nSalary: " + salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getJobID() {
		return jobID;
	}

	public void setJobID(int jobID) {
		this.jobID = jobID;
	}
}
