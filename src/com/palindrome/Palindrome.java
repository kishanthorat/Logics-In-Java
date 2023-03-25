package com.palindrome;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b=0,c,d;
		System.out.println("Enter No");
		a=sc.nextInt();
		c=a;
		while(a>0)
		{
		    d=a%10;
		    b=(b*10)+d;
		    a=a/10;
		}
		if(c==b)
		{
		   System.out.println("Palindrome");	
		}
		else {
			System.out.println("Not Palindrome");
		}
	}

}
