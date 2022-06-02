 package com.syntax.class07;

public class WhileLoopExamples {

	public static void main(String[] args) {
		// print numbers from 1 to 10;
		
		int num=1;
		
		while(num<=10) {
			System.out.print(num+" ");
			num++;
		}
		
		//print numbers from 1 to 10;
		
		int num1=1;
		
		while (num1<10) {
			num1++;
			System.out.print(num1+" ");
		}
	
		//print numbers from 1 to 10;
		
		int a=10;
		while(a<=100) {
			System.out.print(a+" ");
			a++;
		}
	
		//print numbers from 1 to 10;
		
		int b=10;
		
		while(b>=10) {
		System.out.print(b+" ");
		b--;
	}
	// print 10 to 100
	System.out.println("----------------");
	int i=10;
	while(i<=100) {
		System.out.print(i+" ");
		i++;
	}
	System.out.println("--------------------");
	// print 10 to 1
	int x=10;
	while(x>=1) {
		System.out.print(x+" ");
		x--;
	}
	// print 100 to 50
	System.out.println("-----------------");
	int v=100;
	while(v>=50) {
		System.out.print(v+" ");
		v--;
	}
	// print -1 to -10
	System.out.println("----------------");
	int n=-1;
	while(n>=-10) {
		System.out.print(n+" ");
		n--;
	}
	System.out.print("----------------");
	// print 1 to 20 but only the even numbers
	// one of the ways to do it
	int m=2;
	while(m<=20) {
		System.out.print(m+" ");
		m+=2;
	}
	// the other way to do it
	int f=1;
	while (f<=20){
		if(f%2==0) {
			System.out.print(f+" ");
			
	}	
		f++;	
	}
	// Print only odd numbers from 100 to 1
	System.out.println();
	int y=100;
	while(y>=1) {
		if(y%2!=0) {
			System.out.print(y+" ");
			
		}
		y--;
	}
	
	}
	
	}
