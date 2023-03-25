package com.array.unique.element.count;

import java.util.HashMap;

public class ByArray {

	 public static void main(String[] args) {
		 
	        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4, 6, 7, 6, 8};
	        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
	        
	        for (int i = 0; i < arr.length; i++) {
	            if (map.containsKey(arr[i])) {
	                map.put(arr[i], map.get(arr[i]) + 1);
	            } else {
	                map.put(arr[i], 1);
	            }
	        }
	        
	        for (Integer key : map.keySet()) {
	            System.out.println(key + " = " + map.get(key) );
	        }
	    }
	
}
