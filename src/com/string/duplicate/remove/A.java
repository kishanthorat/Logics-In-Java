package com.string.duplicate.remove;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class A {
	
	public static void main(String args[])
	{
	String str="kpt kkk kpt ";
 	
   String[] string= str.split(" ");
   
   List<String> list=Arrays.asList(string);
   Set<String> set=new HashSet<>(list);
   
   for(String se:set)
   {
	   System.out.println(se);
  }
	
	}

}
