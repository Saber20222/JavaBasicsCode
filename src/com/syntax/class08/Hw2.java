package com.syntax.class08;

public class Hw2 {

	public static void main(String[] args) {
		 /*
		 *2. Using nested loop, create a 24 hour clock that will 
		 *display 2 digits
		 * for an hour and 2 digits for a minute.
Example:

10:00

10:01

10:02

…..etc

10:59

11:00

……etc
 */
		 
		for (int hrs=0; hrs<24; hrs++) {
			for (int min=0; min<60;min++) {
			
			String time;
			if(hrs<10 && min<10) {
				time="0"+hrs+":"+"0"+min;
				
		}else if(hrs<10&& min>=10) {
			time="0"+hrs+":"+min;
			
		
		}else if(hrs>=10 && min<10) {
			time=hrs+":"+"0"+min;
		
		}else {
			time=hrs+":"+min;
		}
		System.out.println(time);	
			
		}
		
		}
	}

}
