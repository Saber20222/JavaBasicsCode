package com.syntax.class06;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		/*let's as a user where is he from 
		 * based on the country we will define favorite food
		 */
		Scanner scan=new Scanner(System.in);
		String country, favoriteFood ;
		
		System.out.println(" Please tell me where you are from");
		scan.nextLine();
		country=scan.nextLine();
		
		switch(country) {
		case "Mexico":
			favoriteFood="tacos";
			break;
		case "Canada":
			favoriteFood="Poutine";
			break;
		case "Turkey":
			favoriteFood="Luhmcun";
					
		}
	System.out.println(" you are from "+country+" and your food is");
	}

}
