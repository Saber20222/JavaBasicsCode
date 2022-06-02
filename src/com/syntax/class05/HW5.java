package com.syntax.class05;

import java.util.Scanner;

public class HW5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println( " Enter your birth month");
		String month=scan.next();
		String season;
		if(month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println(" You were born in Season of Spring");
			
		}else if(month.equals("June")|| month.equals("July")|| month.equals("August")) {
			System.out.println(" you were born Season of Summer");
		}else if (month.equals("September")|| month.equals("October")|| month.equals("November")) {
			System.out.println(" You were born in Season of winter ");
		scan.close();
		}

	}

}
