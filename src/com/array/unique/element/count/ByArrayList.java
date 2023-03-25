package com.array.unique.element.count;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


//Unique No. and their Count
public class ByArrayList {

	 public static void main(String args[])
	  {
	     List<Integer> list=new ArrayList<Integer>();
	                   list.add(36);
	                   list.add(23);
	                   list.add(45);
	                   list.add(23);
	                   list.add(56);
	                   list.add(45);
	                   list.add(36);
	                   list.add(22);
	                   list.add(23);
	                   list.add(45);

	  Map<Integer,Integer> numCounts=new HashMap<Integer,Integer>();

	   for(int num:list)
	  {
	   if(numCounts.containsKey(num))
	  {
	   int count= numCounts.get(num);
	   numCounts.put(num,count + 1);
	  }
	   else
	  {
	   numCounts.put(num,1);
	  }
	  }

	  List<Integer> uniNum=new ArrayList<Integer>(numCounts.keySet());
	  System.out.println("The Unique numbers and Their Total Count : ");
	  for(int num : uniNum)
	 {
	  int count=numCounts.get(num);
	  System.out.println(num + ": " +count);
	 }
	}
	
	
}
