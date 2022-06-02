package com.syntax.class06;

import java.util.Scanner;

public class RecapHw {

	public static void main(String[] args) {
		boolean checkboxSelected=false;
		
		if (!checkboxSelected) {
			System.out.println("Click on checkbox");
		}
		System.out.println("----------------------");
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number of years");
		int years=scan.nextInt();
		System.out.println(" Enter annual salary");
		int salary=scan.nextInt();
		
		if(years >=5) {
			System.out.println("You are eligible for the bonus");
				if(salary>50000) {
					System.out.println("Your bonus is going to be 5000");
				}else {
					System.out.println("Your bonus is going to be 3000");
				}
		
		}else {
			System.out.println("Sorry you are not eligible for any bonus");
		}
	
	
	}

}
