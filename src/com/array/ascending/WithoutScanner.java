package com.array.ascending;

public class WithoutScanner {
	
	public static void main(String[] args) {
		
		int a[]={111, 333, 666, 777, 222, 444, 555};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
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
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
