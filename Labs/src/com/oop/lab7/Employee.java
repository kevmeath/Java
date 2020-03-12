package com.oop.lab7;

public class Employee extends Person {
	private Job job;
	private static int personnelNumber = 0;
	private Date startDate;
	
	public Employee(String firstName, String surName, Date dateOfBirth, String gender, Job job, Date startDate) {
		super(firstName, surName, dateOfBirth, gender);
		this.job = job;
		this.personnelNumber++;
		this.startDate = startDate;
	}
	
	public String toString() {
		FileProcessor fp = new FileProcessor("src/com/oop/lab7/names.txt");
		fp.writeNames(this.getFirstName());
		return "Name: "+this.getFirstName()+"\nSurname: "+this.getSurName()+"\nDate of Birth: "+this.getDateOfBirth()+"\nGender: "+this.getGender()+"\nJob: "+this.getJob()+"\nStart Date: "+this.getStartDate();
	}
	
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public int getPersonnelNumber() {
		return personnelNumber;
	}
	public void setPersonnelNumber(int personnelNumber) {
		this.personnelNumber = personnelNumber;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
}
