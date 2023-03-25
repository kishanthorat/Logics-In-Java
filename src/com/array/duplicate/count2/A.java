package com.array.duplicate.count2;
import java.util.*;
public class A
{
public static void main(String args[])
{
    int a[]={1,2,3,1,2,3,4,};
    
    Arrays.sort(a);
       
        for(int i=0; i<a.length-1;i++)
        {
         int count=1;
            for(int j=i+1; j<a.length;j++)
              {
              if(a[i]==a[j])
                count++;
              else
                break;
              }    
   if(count>1)
    {
        System.out.println(a[i]+"="+count);
         i+=(count-1);
    }
}
}


}