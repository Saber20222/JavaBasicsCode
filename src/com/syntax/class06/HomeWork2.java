package com.syntax.class06;

import java.util.Scanner;

public class HomeWork2 {

	public static void main(String[] args) {
		/*
		 * Allow user to enter grade (A, B, or C etc...) 
		 * and then provide explanation: A-Excellent, B-Good, 
		 * C-Average, D-Bad, any other grade --> Not Acceptable. 
		 * At the end your program should print which grade was 
		 * entered by a user with explanation.
		 *
		 */
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter grade");
			char grade=scan.next().charAt(0);
			
			String output;
			
			switch (grade) {
			case 'A':
				output="Excelent";
				break;
			case 'B':
				output="Good";
				break;
			case 'C':
				output="Average";
				break;
			case 'D':
				output="Bad";
				break;
				default:
					output="Not Acceptable";
			}
		System.out.println(output);	
	}

}
