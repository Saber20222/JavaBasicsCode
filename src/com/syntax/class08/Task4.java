package com.syntax.class08;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		/*Declare a secret number; you want to ask user
		 * to guess your secret number. your code should
		 * keep asking to guess until user gets your 
		 * secret number. once user get the secret number
		 * it prints --> you got it !
		 */ 
	
		
		int secretNum = 24;
		int guessedNum;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Guess my secret number");
			guessedNum = scan.nextInt();
		} while (guessedNum != secretNum);
		
		System.out.println("You got it");
		scan.close();
	}

}
