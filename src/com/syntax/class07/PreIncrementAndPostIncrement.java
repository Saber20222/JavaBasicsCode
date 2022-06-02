package com.syntax.class07;

public class PreIncrementAndPostIncrement {

	public static void main(String[] args) {
		// post increment first use and then increment
		int num=10;
		int result=num++;
		System.out.println("value of num=" +num);
		System.out.println("value of result="+result);
		// pre increment first increment and then use
		int num1=10;
		int result1=++num1;
		System.out.println("value of num1="+num1);
		System.out.println("value of result1 ="+result1);
	}

}
