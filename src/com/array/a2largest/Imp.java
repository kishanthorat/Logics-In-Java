package com.array.a2largest;

public class Imp {
	
	public static void main(String[] args) {
	    int[] arr = {10, 20, 30, 40, 50};
	    int highest = arr[0];
	    int secondHighest = arr[0];
	    
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] > highest) {
	            secondHighest = highest;
	            highest = arr[i];
	        } else if (arr[i] > secondHighest && arr[i] != highest) {
	            secondHighest = arr[i];
	        }
	    }
	    
	    System.out.println("Second highest number in the array is: " + secondHighest);
	}

}
