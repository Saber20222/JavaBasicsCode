package com.syntax.class03;

public class PrimitiveCasting {

	public static void main(String[] args) {
		
		// ctrl+space
		
		int i=100;
		double d=100;//widening
		System.out.println(i); //100
		System.out.println(d);//100.0
		// casting in java is converting 1 type into another
		//two types of casting 
		//widening and narrowing
		
		// widening is converting smaller number into bigger 
		//byte--> short--> int--> float-> double 
		// another word for widening is implicit and automatic
		
		long l =10000;
		//byte b=130;
				
				// narrowing = explicit or manually
				// double-> float-> long-> int-> short-> byte
			int x=(int)99.99;// narrowing
			System.out.println(x); // lost the .99
			byte b=(byte)130;
			System.out.println(b); //crazy answer -126 why /? cant figure out
			
			float f=10.99f;// type mismatch
			double dd=9.99;
			
	}

}
