package com.syntax.class05;

import java.util.Scanner;

public class HW4 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter current time");
		int time=scan.nextInt();
		
		if(time>= 1 && time <=11) {
		System.out.println(" It is morning");
	}else if(time>=12 && time>=15) {
		System.out.println("It is afternoo here in the Bay area");
	}else if (time>=16 && time<=20) {
		System.out.println(" It is evening");	
	}
	else if(time>=21 && time<=24) {
		System.out.println(" It is night go to bed you are tired");
		
	}else {
		System.out.println(" Invalid value");
		scan.close();
	}

}
}