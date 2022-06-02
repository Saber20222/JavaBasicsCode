package com.syntax.class09;

public class Task2 {

	public static void main(String[] args) {
		/*
		 * 2. Create an array of words: Java, Saturday, 
		 * Day, coding, is. Print the following sentence
		 * using elements of array: "Saturday is Java
		 * coding day"
		 */
		String[] words= {"Java", "Saturday",
				"day","coding","is"};
		
		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
		
		
		String[] term=new String[5];
		term[0]="Java";
		term[1]="Saturday";
		term[2]="day";
		term[3]="coding";
		term[4]="is";
		System.out.println(term[1]+" "+term[4]+" "+term[0]+" "+term[3]+" "+term[2]);
		// i want to retrieve all elements
		for(int i=0; i<term.length; i++) {
			System.out.println(term[i]+" ");
		}
		
	}

}
