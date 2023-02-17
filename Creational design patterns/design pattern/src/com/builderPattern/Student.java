package com.builderPattern;

public class Student {

	private String studentName;
	private String currentCity;
	private Integer roll;
	private String email;
	private Integer age;
	
	public Student(String studentName, String currentCity, Integer roll, String email, Integer age) {
		super();
		this.studentName = studentName;
		this.currentCity = currentCity;
		this.roll = roll;
		this.email = email;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", currentCity=" + currentCity + ", roll=" + roll + ", email="
				+ email + ", age=" + age + "]";
	}
	
	
	
}
