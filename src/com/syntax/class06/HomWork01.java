package com.syntax.class06;

import java.util.Scanner;

public class HomWork01 {

	public static void main(String[] args) {
		/*
		 *  Ask user to enter their country and capture it. 
		 *  Once values are captured print which language user speaks.
		 */
		Scanner scan=new Scanner(System.in);
		String country,language;
		System.out.println(" Which country are you from?");
		
		language=scan.nextLine();
	
		
		
		
		
		switch(language) {
		case "USA":
			language="English";
			break;
		case "Mexico":
		language="Spanish";
		break;
		case "France":
			language="French";
		}
		System.out.println(" The user speaks "+language);
	}

}
