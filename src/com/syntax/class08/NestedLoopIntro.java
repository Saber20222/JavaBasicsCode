package com.syntax.class08;

public class NestedLoopIntro {

	public static void main(String[] args) {
		for (int i=1; i<=3; i++) {// outer loop
			System.out.println("HELLO");
			for(int y=1; y<=2; y++) {// inner loop 
				System.out.println("Bye");
			}
		}
		// more example
		System.out.println("-----------------");
		for(int i=1; i<=3; i++) {
			System.out.println(i);
			
			for(int y=1; y<=3; y++) {
				System.out.println(y);
			}
		}
	}

}
