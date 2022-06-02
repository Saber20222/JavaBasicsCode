package com.syntax.class07;

public class DoWhile {

	public static void main(String[] args) {
		// while loop first checks condition then executes block
		// of code
		
		
		int num=10;
		while(num<=3) {
			System.out.println(num+" ");
			num++;
		}
		
		System.out.println("----------------------");
		// do while first executes the code and then check 
		//the condition
		
		int num1=10;
		do {
			System.out.print(num1+" ");
			num1++;
		}while(num1<=3);
		// it executes in do while block once
		
		// print numbers 1 to 30 using do while
	int u=1;
	do {
		System.out.println(u);
		u++;
	}while(u<=30);
	System.out.println("---------------------");
	// Print even number from 70 to 30 
	int t=70;
	do {
		System.out.print(t+" ");
		t-=2;
		
	}while (t>=30);
	}
}
