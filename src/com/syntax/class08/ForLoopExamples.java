package com.syntax.class08;

public class ForLoopExamples {

	public static void main(String[] args) {
		// I need to print numbers from 1 to 90
		
		for (int i=1; i <=90; i++) {
			System.out.print(i+" ");
			
			}
		/* initialization =/ start point
		 *  condition=/ end point
		 *  increment/decrement
		 */
						
	//I need numbers from 60 to 10
		
		for (int i=60; i>=10; i--){
		System.out.println(i+" ");
	}
	// what is the output?
		for (int v=5; v<=40; v+=5) {
			System.out.println(v+" ");// repeats 8 times
	}
	// print even numbers 20 to 1 (2 ways)
		for(int h=20; h>=1; h-=2) {
			System.out.println(h+" ");
		}
	// second way
		System.out.println();
		for(int k=20; k>=1; k-=2) {
			
			if (k%2==0){
			}		System.out.println(k+" ");
		}
	// print odd numbers between 20 and 50(2 ways)
		for(int o=21; o<=50; o +=2) {
			System.out.print(o+" ");
		}
		System.out.println("---- 2 way");
		
		for (int g=20; g<=50; g++) {
			if( g%2 !=0) {
				System.out.print(g+" ");
			}
		
		}
	}
}