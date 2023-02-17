package com.singletonPattern;

public class Lazy_Instantiation {

   private static Lazy_Instantiation obj;
	
	private Lazy_Instantiation() { };
	
	public static Lazy_Instantiation getObjectOfEarly_Instantiation() {
		
		if(obj == null) {
			synchronized (Lazy_Instantiation.class) {
				if(obj == null)
					obj = new Lazy_Instantiation();
			}
		}
		
		return obj;
	}
	
	
}
