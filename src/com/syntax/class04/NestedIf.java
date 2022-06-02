package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		// Nested if is if within another if
		// boolean expression)
		
		boolean vaccine=true;
		int dose=2;
		
		if(vaccine){
			System.out.println("let me check how many doses you have");
			{if(dose==1){System.out.println("You need one more");
			} else {
				System.out.println("you are fully vaccinated");}
			}
	
		}
		System.out.println("-----------");
		
		String month=("june");
		int day=19;
		
		if(month.equals("may")) {
			System.out.println(" let me check the day in may");
			if (day==8) {
				System.out.println("today is mothers day");
			}
		}else if(month.equals("june")) {
			System.out.println(" let me check the day in june");
			
			if (day==19) {
				System.out.println(" today is father's day");
			}
		}
		
	}

}
