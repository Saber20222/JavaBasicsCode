package com.syntax.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of worked years");
		int workedyears=scan.nextInt();
		
		System.out.println( "Anual salary");
		int salary=scan.nextInt();
		
		if(workedyears>=5) {
			System.out.println(" You are eligible for bonus");
			if(salary>50000) {
				System.out.println("bonus is 5000");
			}else {
				System.out.println("bonus is 3000");
			
			}
			
		}else {
			System.out.println("not eligible for bonus");
			scan.close();
		}
		
		

	}

}
