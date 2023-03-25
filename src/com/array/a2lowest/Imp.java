package com.array.a2lowest;

public class Imp {
	
	public static void main(String[] args) {
		
	int[] arr = {5, 10, 15, 2, 25, 30,5,1,1,222}; // Sample array
	
	    int min = Integer.MAX_VALUE;
	    int secondMin = Integer.MAX_VALUE;

	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] < min) {
	            secondMin = min;
	            min = arr[i];
	        } else if (arr[i] < secondMin && arr[i] != min) {
	            secondMin = arr[i];
	        }
	    }
	   System.out.println(secondMin);
	}
}

