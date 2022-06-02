package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println( " Please enter age");
		int age=scanner.nextInt();
		
		if (age>= 18) {
			System.out.println(" We will issue a driver license for you ");
			
		}else {
			System.out.println(" You should get permit first");
		scanner.close();
		}

	}

}
