package com.array.ascending;

import java.util.Scanner;

//by using Scanner Class
public class AscendingArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		System.out.println("Enetr Element");
		for(int i=0; i<a.length;i++)
		{
		   a[i]=sc.nextInt();	
		  // System.out.println("before"+a[i]);
		}
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1;j<a.length; j++)
			{
				  if(a[i]>a[j])
				  {
					  int temp;
					  temp=a[i];
					  a[i]=a[j];
					  a[j]=temp;
					  
				  }
			}
			
			
		}
		for(int i=0; i<=4;i++)
		{
			System.out.println(a[i]);      
		}
	
	}

}
