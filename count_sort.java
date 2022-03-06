package com.two_pointer;
import java.util.*;
public class count_sort {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int a[]={9,6,3,5,3,4,3,9,6,4,6,5,8,9,9};
        get(a);

    }
    static void get(int a[])
    {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            min=Math.min(min,a[i]);
            max=Math.max(max,a[i]);
        }
       int store[]=new int[max-min+1];
        for(int i=0;i<a.length;i++)
        {
            int idx=a[i]-min;
            store[idx]=store[idx]+1;
        }
        int range[]=new int[max-min+1];
        int sum=0;
        for(int i=0;i<store.length;i++)
        {
           sum=sum+store[i];
           range[i]=sum-1;
        }
        int ans[]=new int[a.length];
        for(int i=a.length-1;i>=0;i--)
        {
            int idx=a[i]-min;
            int index=range[idx];
            ans[index]=a[i];
            range[idx]=range[idx]-1;
        }
       for(int i=0;i<ans.length;i++)
       {
           System.out.print(ans[i]+" ");
       }
    }
}
