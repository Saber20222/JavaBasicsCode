package com.syntax.class09;

public class Hw3 {

	public static void main(String[] args) {
		/*
		 * Create an array to store double values and 
		 * then print all elements using 2 different loops 
		 */
		double[]x={10.99, 19.99,5.5,79.5,80.99};
		for(int y=0; y<x.length; y++) {
			System.out.print(x[y]+" ");
			
			
		}
		System.out.println("---the other way as follows");
		
		
		for (double a:x) {
		System.out.print(a+" ");
	}
	}

}
