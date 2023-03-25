package com.fibonnaci;

import java.util.Scanner;

public class Fibonnaci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int a=0,b=1,c;
	System.out.println("Enetr Term");
	int x=sc.nextInt();
	for(int i=1;i<=x;i++)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
	
}
}
