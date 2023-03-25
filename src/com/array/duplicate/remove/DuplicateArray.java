package com.array.duplicate.remove;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateArray {
	
	
	public static void main(String[] args) {
		
		//for integer type of Array
		
		    int a[]= {1,2,2,3,1,3} ;	
		    
		    Set<Integer> set= new HashSet<>();
		
		    Set<Integer>  dp = Arrays.stream(a)
		    		                        .filter(j -> !set.add(j))
		    		                        .boxed().collect(Collectors.toSet());
		 
	        System.out.println(dp);
	       
	       
	     //for String type of Array  
	        
	        String b[]= {"ram","lakhan","sita","ram","lakhan",};	
	    
	        Set<String> set1= new HashSet<>();
	    
	        Set<String>  dd = Arrays.stream(b)
	        		                   .filter(m -> !set1.add(m))
	        		                   .collect(Collectors.toSet());
	      
	    	   
	      System.out.println(dd);
	    	   
	    	   
	    	   
		
	}
}


