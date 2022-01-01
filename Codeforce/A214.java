package com.company.cp;

public class A214 {
  public void print(int a,int b)
  {
      if(a==b)
      {
          System.out.println(0);
      }
      else
      {
          int count=0;
          while(true)
          {
              if(a==b)
              {
                  System.out.println(count);
                  return;
              }
              if(a<b)
              {
                b=b-a;
                count++;
              }
              else
              {
                  a=a-b;
                  count++;
              }
              if(a<=0||b<=0)
              {
                  System.out.println(0);
              }
          }
      }
  }
}
