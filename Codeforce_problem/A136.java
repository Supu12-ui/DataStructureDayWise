package com.company.cp;

public class A136 {
    public void present(int a[])
    {
        int n=a.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++)
        {
           int value=a[i];
           ans[value-1]=i+1;

        }
        for(int i=0;i<n;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
