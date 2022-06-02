package com.syntax.class02;

public class NonPrimitives {

	public static void main(String[] args) {
		String Name= "Oleg";
		String LastName= "Smith";
		
		long phone=1234567890l;
		
		// xxx-xxx-xxxx
		String PhoneNumber="123-456-7890";
		String address = "123 Wshington str";
		
		int age = 30;
		String City= "Miami";		
		// WE CAN USE + TO ATTACH STRING TO STRING
		
		
	  System.out.println(Name+ " "+ LastName);
	  System.out.println(Name+ " lives in "+ City);
	  
	  System.out.println( Name+ " is " +age+" years old");
	}

}
