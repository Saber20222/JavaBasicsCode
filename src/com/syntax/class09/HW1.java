package com.syntax.class09;

public class HW1 {

	public static void main(String[] args) {
		/* Homework 1. Create an array of cars and store 6 elements into it. 
		 * Using 2 different loops print all values from the array. 
		 */
		
		String[] cars=new String[6];
		cars[0]= "Tesla";
		cars[1]= "Toyota";
		cars[2]= "BMW";
		cars[3]= "Jeep";
		cars[4]= "Chrysler";
		cars[5]= "Honda";
		for(int x=0; x<cars.length; x++) {
		
		System.out.print(cars[x]+" ");
		
		
	}
		System.out.println();
		System.out.println("------------------------------------------");
		
		for(String y:cars) {
			System.out.print(y+" ");
		}
    }
 
    }