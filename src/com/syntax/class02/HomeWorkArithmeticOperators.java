package com.syntax.class02;

public class HomeWorkArithmeticOperators {

	public static void main(String[] args) {
		// Part 1
		double myNum1=15.99;
		double myNum2=9.99;
		double sum,sub, mult, div;
		sum=myNum1+myNum2;
		sub=myNum1-myNum2;
		mult=myNum1*myNum2;
		div=myNum1/myNum2;
	System.out.println("The addition of two numbers "+myNum1+" and "+myNum2+ " is equal to "+sum);
	System.out.println("The subtraction of two numbers " +myNum1+" and " +myNum2+" equals to "+sub);
	System.out.println("The multiplication of two numbers " +myNum1+" and " +myNum2+" equals to " +mult);
	System.out.println("The division of two numbers " +myNum1+" and " +myNum2+" equals to "+div);
		// Part 2 
		double myNum3=3.9;
		//myNum3=3.9*3.9; <> Is this a good way of doing it?
		// or I should do it like the following:
		double myNum4=myNum3*myNum3;
	System.out.println("The square of " +myNum3+" is " +myNum4);
		
		int W=5;
		int H=8;
		int perimeter, area;
		perimeter=W*2+H*2;
		area=W*H;
	System.out.println("The perimeter of a rectangle with width " +W+" and height " +H+" is equal to "+perimeter+ " and the area is "+area);

	}

}
