package com.syntax.class10;

import java.util.Scanner;

public class GroupHw1 {


	public static void main(String[] args) {
		/*Hw2
		 *Using Scanner create an array of countries.
		 *When an array is created, retrieve all values 
		 *from it and while retrieving those values print
		 * capital for each country. 
		 *(use 2 different loops). 
		 */
		Scanner scan = new Scanner(System.in);
	    System.out.println("What is the length of your array: ");
	    int size = scan.nextInt();
	    String [] countries = new String [size];

	    for(int i=0; i<size; i++){
	    	
	    countries[i]= scan.next();
	    }
	    for(String j:countries){
	        if(j.equalsIgnoreCase("Afghanistan")) {
	            System.out.println(j + ":Kabul");
	        }else if(j.equalsIgnoreCase("France")) {
	            System.out.println(j + ":Paris");
	        }else if(j.equalsIgnoreCase("China")) {
	            System.out.println(j + ":Beijing");
	        }else if(j.equalsIgnoreCase("Germany"))
	            System.out.println(j+":Berlin");
	    }

	}
		
			
		
	}


