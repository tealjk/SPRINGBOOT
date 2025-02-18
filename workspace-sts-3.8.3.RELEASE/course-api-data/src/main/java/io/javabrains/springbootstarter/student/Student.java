package io.javabrains.springbootstarter.student;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Student {
	
	@Id
	private String id;
	private String first;
	private String last;
	
	
	private String major;
	private String pool;
	private String school;
	private String graduation;
	private String notes;
	private String availability; 
	private String description; 
	
	

	
	
	public Student(){
		
	}
	
	

	public Student(String id, String first, String last) {
		super();
		this.id = id;
		this.first = first;
		this.last = last; 
		
		
		/*
		
		this.major = major;
		this.pool = pool;
		this.school = school;
		this.graduation = graduation;
		this.notes = notes; 
		this.availability = availability; 
		this.description = description; 
		*/

	}
	
	
	
	
	
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	
	

	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}

		


	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}

	
		
	
	
	
	
	
	
	/*

	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}





	public String getMajor() {
		return major;
	}



	public void setMajor(String major) {
		this.major = major;
	}



	public String getPool() {
		return pool;
	}



	public void setPool(String pool) {
		this.pool = pool;
	}



	public String getSchool() {
		return school;
	}



	public void setSchool(String school) {
		this.school = school;
	}



	public String getGraduation() {
		return graduation;
	}



	public void setGraduation(String graduation) {
		this.graduation = graduation;
	}



	public String getNotes() {
		return notes;
	}



	public void setNotes(String notes) {
		this.notes = notes;
	}



	public String getAvailability() {
		return availability;
	}



	public void setAvailability(String availability) {
		this.availability = availability;
	}

	*/
	
	
	
	
	
	
}
