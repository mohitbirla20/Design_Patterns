package com.singletonPattern;

public class Early_Instantiation {

	private static Early_Instantiation obj;
	
	private Early_Instantiation() { };
	
	public static Early_Instantiation getObjectOfEarly_Instantiation() {
		return obj;
	}
	
}
