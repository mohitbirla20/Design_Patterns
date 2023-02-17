package com.builderPattern;

public class Main {

	public static void main(String[] args) {
		Student student = new StudentBuilder().setStudentName("Mohit Birla")
				                              .setCurrentCity("Indore")
				                              .setAge(25)
				                              .setEmail("mr.mohitbirla4920@gmail.com")
				                              .setRoll(21)
				                              .getStudentObject();
	                                          
		System.out.println(student);
	}
	
}
