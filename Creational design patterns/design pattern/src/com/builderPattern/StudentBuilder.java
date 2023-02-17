package com.builderPattern;

public class StudentBuilder {

	private String studentName;
	private String currentCity;
	private Integer roll;
	private String email;
	private Integer age;
	
	
	public StudentBuilder setStudentName(String studentName) {
		this.studentName = studentName;
		return this;
	}
	
	public StudentBuilder setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
		return this;
	}
	
	public StudentBuilder setRoll(Integer roll) {
		this.roll = roll;
		return this;
	}
	
	public StudentBuilder setEmail(String email) {
		this.email = email;
		return this;
	}
	
	public StudentBuilder setAge(Integer age) {
		this.age = age;
		return this;
	}
	
	
	public Student getStudentObject() {
		return new Student(studentName, currentCity, roll, email, age);
	}
	
	
	
}
