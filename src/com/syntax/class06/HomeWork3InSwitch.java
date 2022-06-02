package com.syntax.class06;

import java.util.Scanner;

public class HomeWork3InSwitch {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner (System.in);
		System.out.println("This is a calculator");
		System.out.println("Please enter first number");
		
		int num1=scan.nextInt();
		System.out.println(" Enter the second number");
		
		int num2=scan.nextInt();
		System.out.println(" Enter the operator that you need");
		
		char sign=scan.next().charAt(0);
		int digit=(0);
		
		switch (sign) {
		case '+':
			digit=(num1+num2);
			break;
		case '-':
			digit=(num1-num2);
			break;
		case '*':
			digit=(num1*num2);
		case '/':
			digit=(num1/num2);
			break;
		}
		System.out.println("The result of calculation is " +digit );
	}

}
