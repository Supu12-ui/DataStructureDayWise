package com.company.cp;
import java.util.*;
public class A160 {
    public void twins(int a[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+a[i];
        }
        int count=0;
        int mysum=0;
        Arrays.sort(a);
        for(int i=n-1;i>=0;i--)
        {
            mysum=mysum+a[i];
            count++;
            if(mysum>(sum-mysum))
            {
                break;
            }
        }
        System.out.print(count);
    }
}
