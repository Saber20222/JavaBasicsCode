package com.syntax.class10;

public class Task1 {

	public static void main(String[] args) {
		// From an array of integer elements find the 
		//the largest number
	
		int[]arr= {15, 18, 25, 4, 3};
		int biggest=arr[0];
		for(int i=0; i<arr.length; i++){
			if(arr[i]>biggest) {
				biggest=arr[i];
			}
		}
		System.out.println(biggest);
		biggest=arr[0];
		for (int i : arr) {
			if(i>biggest) {
				biggest=i;
			}
		}
	}

}
