package com.array.duplicate.count;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesElement {

	  public static void main(String[] args) {
	      // Create an array list
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(1);
	      list.add(2);
	      list.add(3);
	      list.add(2);
	      list.add(3);
	      list.add(3);
	      
	      // Create a HashMap to store the element and its count
	      Map<Integer, Integer> map = new HashMap<Integer, Integer>();
	      
	      // Loop through the array list and store the element count in the HashMap
	      for(int i=0; i<list.size(); i++) {
	         int key = list.get(i);
	         if(map.containsKey(key)) {
	            int count = map.get(key);
	            map.put(key, count+1);
	         }
	         else {
	            map.put(key, 1);
	         }
	      }
	      
	      // Loop through the HashMap and print the duplicate elements
	      System.out.println("Duplicate elements:");
	      for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	         if(entry.getValue() > 1) {
	            System.out.println(entry.getKey() + " - " + entry.getValue());
	         }
	      }
	   }
	
}
