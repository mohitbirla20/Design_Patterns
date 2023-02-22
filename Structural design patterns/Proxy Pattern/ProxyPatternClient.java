package com.proxy;

public class ProxyPatternClient {

	  public static void main(String[] args)   
	  {  
	        OfficeInternetAccess access = new ProxyInternetAccess("Mohit Birla");  
	        access.grantInternetAccess();  
	  }  
	
}
