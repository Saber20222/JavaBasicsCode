package com.syntax.class09;

public class Task1 {

	public static void main(String[] args) {
		/* 1. Create an array of chars and store grades into
		 * it: A,B,C,D,E,F. then print a grade B
		 * (use 2 different ways creating an array).
		 * 
		 * 
		 */
		char[] grade=new char[6];
		
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		System.out.println(grade [1]);
		
		// second way to do it
		char[]grade1= {'A','B','C','D','E','F'};
		System.out.println(grade1[3]);
		
		
		for (int i=0; i<grade.length; i++) {
			System.out.println(grade[i]);
		}
	}

}
