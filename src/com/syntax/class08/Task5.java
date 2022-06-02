package com.syntax.class08;

public class Task5 {

	public static void main(String[] args) {
		//Task 1. Print numbers from 1 to 50 except those 
		//that are divisible by 3
		
		
		
		for (int i=1; i<=50;i++) {
			if(i%2==0) {
				continue;
			}
		System.out.print(i+" ");
		}
	}

}
