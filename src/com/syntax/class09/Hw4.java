package com.syntax.class09;

public class Hw4 {

	public static void main(String[] args) {
		// Create an array on integers and calculate 
		//the sum of all elements in an array
		
		int []numbers= {55,89,25,22,39,77};
		int sum=0;
		for(int i=0; i<numbers.length; i++) {
			sum=sum+numbers[i];
			//sum+=numbers[i];// the other way of shorthand
			}
		System.out.println("The sum of all elements in array is "+numbers);	
	
		sum=0;
		
		for(int num :numbers) {
			sum+=num;
		}
	System.out.println("sum of all elements = "+sum);
	}

	

}
