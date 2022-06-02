package com.syntax.class07;

import java.util.Scanner;

public class LoopWithScanner {

	public static void main(String[] args) {
		/*
		 * we are going to ask you if you got a job
		 * we will continuously ask if you got a job until
		 * you say yes, once you say yes then we 
		 * will say congratulations!
		 */
		
		Scanner scan=new Scanner(System.in);
		String job;
		
		do {
		System.out.println("Did  you get a job?");
		job=scan.nextLine();
		}while(!job.equalsIgnoreCase("Yes"));
		System.out.println("Congratulation!");
		scan.close();
		
		
		Scanner input=new Scanner(System.in);
		String offer;
		System.out.println(" Did you get a job?");
		offer=input.nextLine();
		while(!offer.equalsIgnoreCase("yes")) {
		System.out.println("Did you get a job?");
		offer=input.nextLine();
		}
	System.out.println("Congratulations");
	input.close();
	}

}
