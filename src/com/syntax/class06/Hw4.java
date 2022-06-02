package com.syntax.class06;

import java.util.Scanner;

public class Hw4 {

	public static void main(String[] args) {
/*
** Write a program to ask user to enter value for sale: yes or no
* if there is no sale --> you are not going for shopping
* if there is sale ask user which item they want to buy and it’s price
* Based on the price you have to calculate the price of the item after the discount, discount rule:
* if price is less than $20 --> apply 10%
* if price is between $20 & $100 --> 20%
* if price between $100 & $500 --> 30%
* otherwise apply 50% discount
After discount ___ the price of the item reduce from __ to ___ 
* 
*/
		Scanner input=new Scanner (System.in);
		System.out.println("Is there sale going on today?");
		String sale=input.next();
		if (sale.equals("no")) {
			System.out.println("Ok then I will come back and check with you next weekend for discount.");}
		else if(sale.equals("yes")) {
			System.out.println("What are you looking for?");
		}
		String item=input.next();
		System.out.println("What is the price of the "+item+"?" );
		
		double price=input.nextDouble();
		double discount=0;
		double discountedPrice=0;
		
		
		if(price<=20) {
			discount=10;
		}else if (price>=20&& price <100) {
			discount=20;
		}else if (price>=100 && price <=500) {
			discount=30;
			
		}else if(price>=500 && price <=2000) {
			discount=50;
		}else {
			System.out.println("Soory no");
		}
		discountedPrice=((100-discount) * price) /100;
		discountedPrice=Math.round(discountedPrice * 100.0) / 100.0;
		System.out.println("After the discount "+discount+" % "+" the price of the item is reduced from $"+price+" to $ "+discountedPrice);
		
		
	
	}
	
	{	
	}
		
		
		
		
		
	{
		
		
		
		
		
		
		
		

	}

}
