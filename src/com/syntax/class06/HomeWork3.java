package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3 {

	public static void main(String[] args) {
		/*
		 * HW: Using scanner class create calculator. 
		 * Allow user to enter 2 numbers and operator(+,-,*,/).
		 *  Based on operator provide the result to user.
			Please complete this assignment in 2 ways: 
			using if statement and switch case.
		 * 
		 */
		
		Scanner scan=new Scanner (System.in);
		System.out.println("This is a calculator");
		System.out.println("Please enter first number");
		
		int num1=scan.nextInt();
		System.out.println(" Enter the second number");
		
		int num2=scan.nextInt();
		System.out.println(" Enter the operator that you need");
		
		char sign=scan.next().charAt(0);
		int digit=(0);
			if(sign=='+') {
				digit=(num1+num2);
			}else if(sign=='-') {
				digit=(num1-num2);
			}else if(sign=='*') {
				digit=(num1*num2);
			}else if (sign =='/') {
				digit=(num1/num2);
			}
		
		System.out.println("Result is " +digit);
		

	}

}
