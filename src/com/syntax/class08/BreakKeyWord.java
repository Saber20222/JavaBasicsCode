package com.syntax.class08;

public class BreakKeyWord {

	public static void main(String[] args) {
		// break breaks block of code
		
		for (int i=1; i<=5; i++) {
			System.out.println("hello");
			if(i==2)
			break;
		}
		
		
		boolean summer=true;
		while(summer) {
			System.out.println("it is hot");
			int temp=95;
			if (temp<70) {
			break;
		
		}
		temp-=5;
		}
		
	}
}