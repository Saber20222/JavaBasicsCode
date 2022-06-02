package com.syntax.class09;

public class Hw2 {

	public static void main(String[] args) {
		/*Create an array of animals and store 5 elements into it. 
		 * Using 2 different loops print all elements from the array.
		 * 
		 */
		String[] animals=new String[5];
		animals[0]= "Horse";
		animals[1]= "Lion";
		animals[2]= "Tiger";
		animals[3]= "whale";
		animals[4]= "Shark";
		
		for(int x=0; x<animals.length; x++) {
		
		System.out.print(animals[x]+" ");
		
		
	}
		System.out.println();
		System.out.println("------------------------------------------");
		
		for(String y:animals) {
			System.out.print(y+" ");
		}
	}

}
