package com.syntax.class10;

public class Task2 {

	public static void main(String[] args) {
		// create an array to store char values and 
		// then print those in reverse order
		char[]values= {'a', 'b', 'c', 'd'};
		
		for (int i=values.length-1; i>=0; i--) {
			System.out.println(values [i]);
		}
	}

}
