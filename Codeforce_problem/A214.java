package com.company.cp;

public class A214 {
  public void print(int n,int m)
  {
      int count=0;
     for(int a=0;a*a<=n;a++)
     {
       int b=n-(a*a);
       if(a+(b*b)==m)
       {
           count++;
       }
     }
      System.out.println(count);
  }
}
