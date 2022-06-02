package com.syntax.class04;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		/*
		 * we need to check if Repl is completed
		 * if Repl is completed we want to see how many assignments is completed
		 */
		boolean didRepl=true;
		int assignments;
		if (didRepl) {
			System.out.println(" how many assingments have you done");
			assignments=17;
			
		if (assignments<5) {System.out.println(" you did a great job");}
		
		else if (assignments<10) {
			System.out.println(" you did a good job ");
		}else {
			System.out.println(" please complete all repls");
		}
		
		
				
	   }else {
		   System.out.println(" you should complete all your HW");
	   }

    }
  }