package com.acts.classObj;

public class StudentDatabase {
	String name;
	int rollNo;
	String course;
	int age;

	// Default Constructor
	public StudentDatabase() {
		name = "(No Name Entered)";
		rollNo = 0;
		course = "";
		age = 0;
	}
	
	// Parametarized Constructor
	public StudentDatabase(String name,int rollNo, String course,int age) {
		this.name = name;
		this.rollNo = rollNo;
		this.course = course;
		this.age = age;
	}
	
	/* Set Methods : 
	
	private void setName(String name) {
		this.name = name;
	}
	
	private void setAge (int age) {
		this.age = age;
	}
	
	private void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	private void setCourse(String course) {
		this.course = course;
	}
	*/
	
	public String getStudent() {
		return "Name : "+this.name+"\nRoll No : "+this.rollNo+"\tCourse Name : "+this.course+"\tAge : "+this.age;
	}
	
	
	

}
