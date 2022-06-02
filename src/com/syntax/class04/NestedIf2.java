package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		String month="June";
		int day=9;
		
		if(month.equals("May")) {
			System.out.println("Let me check the date");
		
		if (day==8) { 
			System.out.println("Today is mother's day");
		}
		}else if (month.equals("June")) {
			System.out.println("Let me check day in june");
			
			if (day==19) {
				System.out.println("Today is a fathers day");
			}
		}
			

	}

}
