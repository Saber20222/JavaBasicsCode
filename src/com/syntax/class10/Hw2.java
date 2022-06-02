package com.syntax.class10;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		/*Hw2
		 *Using Scanner create an array of countries.
		 *When an array is created, retrieve all values 
		 *from it and while retrieving those values print
		 * capital for each country. 
		 *(use 2 different loops). 
		 */
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many countries do  you want to enter");
		int size=scan.nextInt();
		String capital=null;
		
		String[]countries=new String[size];
		
		for(int i=0; i<size; i++ ) {
			System.out.println("Enter country's name");
			String country=scan.next();
			if(country.equalsIgnoreCase("Afghanistan")) {
				capital="Kabul";
			}else if(country.equalsIgnoreCase("India")) {
				capital=("Delhi");
			}else if(country.equalsIgnoreCase("Iran")) {
				capital=("Tehran");
			}else if(country.contentEquals("USA")) {
				capital="Washington DC";
			}
		System.out.println("the capital of "+country+" is "+capital);
		}
		
		
	    }

	}
		
		
	


