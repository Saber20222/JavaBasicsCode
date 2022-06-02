package com.syntax.class08;

public class ContinueKeyWord {

	public static void main(String[] args) {
		// continues skips current execution/ iteration
		// when java executes continue -> go back the 
		// beginning of of the loop so rest of the code  inside the 
		// loop body will be skipped/ignored
		for (int i=1; i<=5; i++) {
			if (i==2) {
				continue;
				
		}
		System.out.print(i+" ");	
		System.out.println("HELLO");
		System.out.println(" we ar going to beak");
		
		}

		
		// print 1 to 7
		for (int i=1; i<=10;i++) {
			if(i==5|| i==7)
				continue;
				
			System.out.print(i+"");//1 2 3 4 6 8 9 10
		}
	}

}
