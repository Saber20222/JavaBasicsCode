package com.syntax.class04;

public class TaskNestedIfLargestNumber {

	public static void main(String[] args) {
		int a=108;
		int b=120;
		int c= 85;
		
			if(a>=b)
					if(a>=c) {
						System.out.println(a+" is the largest number ");
					}else {
						System.out.println(c+" is the largest number");
					}
				if(b>=c) {
					System.out.println(b+" is the largest number");
				}else {
					System.out.println(c+" is the largest number ");
				}
	}

}
