
package com.array.non_reapeated;

import java.util.Arrays;

public class A {

	public static void main(String[] args) {
		
		int a[]={10, 30, 40, 20, 10, 20, 50, 10};
		Arrays.sort(a);
		boolean b[]=new boolean[a.length];
		
		for(int i=0;i<a.length-1;i++)
		{
			
		if(a[i]==a[i+1])
		{
		  b[i]=true;
		  b[i+1]=true;
		}
		 
		}
		for(int i=0;i<a.length;i++)
		{
		if(!b[i])
		{
		System.out.print(a[i]+" ");
		}
		}
		
		
	}
	
}
