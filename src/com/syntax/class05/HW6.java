package com.syntax.class05;

import java.util.Scanner;

public class HW6 {
/*
 *  Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules:

if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
			System.out.println("Quiz score is");
			int quiz=scan.nextInt();
			System.out.println("Medterm score is");
			int medterm=scan.nextInt();
			System.out.println("Enter your Quiz score");
			int num1 = scan.nextInt();
			System.out.println("Enter your Mid-term score");
			int num2 = scan.nextInt();
			System.out.println("Enter your Final score");
			int num3 = scan.nextInt();
			
			int result = ((num1+num2+num3)/3);
			
			if (result >= 90) {
				System.out.println("Your grade is A");
			}else if(result>=70 && result<=90) {
				System.out.println("Your grade is B");
			}else if(result>=50 && result<=70) {
				System.out.println("Your grade is C");
			}else if(result<50) {
				System.out.println("Your ghreat is F");
			scan.close();
			}
	}

}
