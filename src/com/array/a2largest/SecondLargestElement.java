package com.array.a2largest;
import java.util.*;
		
public class SecondLargestElement{

	public static void main(String[] args)
	{
		
		int a[] = {1,2,3,4,5,6,7,7,6};
		Arrays.sort(a);
		int n = a.length;
		

		for (int i=n-2; i>=0; i--)
		{	
			if (a[i]!=a[n - 1])
			{
			System.out.printf("The second largest element " + a[i]);
			return;
			}
		}
	}
	}

	



