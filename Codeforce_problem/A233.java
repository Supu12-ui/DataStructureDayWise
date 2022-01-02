package com.company.cp;

public class A233 {
    public void solve(int n)
    {
      if(n%2!=0)
      {
          System.out.println(-1);
      }
      else
      {
          int a[]=new int[n];
          for(int i=0;i<n;i++)
          {
              a[i]=i+1;
          }
          for(int i=0;i<n-1;i++)
          {
              int temp=a[i];
              a[i]=a[i+1];
              a[i+1]=temp;
              i++;
          }
          for(int i=0;i<n;i++)
          {
              System.out.println(a[i]);
          }
      }
    }
}
