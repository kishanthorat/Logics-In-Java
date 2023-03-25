package com.array.a2largest;

public class Pqr {
	
	public static void main(String[] args) {
		
		 int[] arr = {5, 10, 15, 2, 25, 30,5,1,1,222}; // Sample array
		    int max = Integer.MIN_VALUE;
		    int secondMax = Integer.MIN_VALUE;

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] > max) {
		            secondMax = max;
		            max = arr[i];
		        } else if (arr[i] > secondMax && arr[i] != max) {
		            secondMax = arr[i];
		        }
		    }
		System.out.println(secondMax);
		}	
	}
		


