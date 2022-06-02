package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		
		String[]disney={"Shrek", "Elsa", "Goofy", "Mulan","Tom&Jerry"};
		System.out.println(disney[1]);
		
		System.out.println(" All elements using regular loop-------");
		
		
		// to get all elements from an array
		
		for(int i=0; i<disney.length; i++) {
		System.out.println(disney[i]+" ");	
		}

	
	for(String character:disney) {
		System.out.println(character+" ");
	}
	}
	}