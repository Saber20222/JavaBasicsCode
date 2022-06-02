package com.syntax.class09;

public class ArrayExample {

	public static void main(String[] args) {
		// I WAN TO STORE PRICEs IN ARRAY
		
		double[] price=new double[4];
		
		price [1]=1.99;
		price [2]=2.99;
		price [3]=3.99;
		System.out.println(price[0]);

		int[]numbers=new int[3];
		numbers[0]=10;
		numbers[1]=11;
		numbers[2]=12;
		//numbers[3]=13; during run time error
		//arrayIndexOutOfBoundsException
		System.out.println(numbers[2]);
		
		//arrays are fixed in size
		//During runtime jAVA cannot increase or
		//decrease the size of an array.

		

	}

}
