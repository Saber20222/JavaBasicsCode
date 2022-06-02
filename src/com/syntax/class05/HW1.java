package com.syntax.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println(" What is the amount of loan nedded?");
		int loan=scan.nextInt();
		
		
		if(loan<=200000) {
			System.out.println("Lend the money");
			
		}else {
			System.out.println("Reject client");
			
			scan.close();
		}
		
	}

}
	