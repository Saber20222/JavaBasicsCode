package com.syntax.class09;

public class NestedLoppClock {

	public static void main(String[] args) {
		 /*/
		  * 2. Using nested loop, create a 24 hour clock that will 
		  *display 2 digits
		  * for an hour and 2 digits for a minute.
		  */
		for(int a=0; a<=2; a++) {
			for(int b=0; b<=9; b++) {
				if(a==2 && b==4) {
					break;
				}
			for(int c=0; c<=5; c++) {
				for(int d=0; d<=9; d++) {
					System.out.println(a+""+b+":"+c+d);
				}
			}
			
		}
	}
	
}

}
