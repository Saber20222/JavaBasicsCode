package com.syntax.class04;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.println(" what is your name");
		String name=input.next();
		System.out.println(name);
	}   

}
