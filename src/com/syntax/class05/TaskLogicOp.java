package com.syntax.class05;

import java.util.Scanner;

public class TaskLogicOp {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		System.out.println("Please enter your height");
		int height=input.nextInt();
		
		if(height<60) {
			System.out.println(" Person short");
		}else if (height>60 && height<=72) {
			System.out.println(" Person is short");
		}else if (height>72) {
			System.out.println(" Person is tal");
		input.close();
		}
		
		
	}

}
