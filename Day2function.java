package com.company;

public class Day2function {
    void digit_frequency(int n,int d)
    {
        int count=0;
        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            if(rem==d)
            {
                count++;
            }
        }
        System.out.println(count-1);
    }
    void fibonacci(int n)
    {
        int a=0,b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
    int count(int n)
    {
        int c=0;
        while(n!=0)
        {
            n=n/10;
            c++;
        }
        return  c-1;
    }
    void digit_of_a_number(int n)
    {
      int len=count(n);
      while(len>=0)
      {
          int rem=n/(int)Math.pow(10,len);
          n=n%(int)Math.pow(10,len);
          len--;
          System.out.println(rem);
      }
    }
    //input 1440
    //output 2 2 2 2 2 3 3 5
    void primefactorisation(int n)
    {
        for(int i=2;i*i<=n;i++)
        {
            while(n%i==0)
            {
                System.out.println(i);
                n=n/i;
            }

        }
        if(n!=0)
        {
            System.out.println(n);
        }
    }
    int gcd(int a,int b) {
        //int sum = 0;
        while (a != b) {
            if (a < b) {
                b = b - a;
            }
            else if(a>b)
            {
                a=a-b;
            }
        }
        return a;
    }
    int lcd(int a,int b)
    {
        return (a*b)/gcd(a,b);
    }
    int decimaltoanybase(int n)
    {
       int ans=0,pow=1;
       while(n!=0)
       {
           int sum=n%2;
           n=n/2;
           
       }
    }













    int decimaladdition(int a,int b)
    {
        int carry=0,ans=0,pow=1;
        while(a!=0||b!=0||carry!=0)
        {
            int sum=carry+(a%10)+(b%10);
            a=a/10;
            b=b/10;
            carry=sum/10;
            sum=sum%10;
            ans+=sum*pow;
            pow*=10;
        }
        return ans;
    }
    int getmult(int n,int base)
    {
        int ans=0,carry=0,pow=1;
        while(n!=0||carry!=0)
        {
            int sum=carry+(n%10)*(base);
            n=n/10;
            carry=sum/10;
            sum=sum%10;
            ans+=sum*pow;
            pow*=10;
        }
        return  ans;
    }
    int getmultiply(int n,int m)
    {
        int ans=0,pow=1;

        while(m!=0)
        {
           int digitsum=getmult(n,m%10);
           m=m/10;
           ans=decimaladdition(ans,pow*digitsum);
           pow=pow*10;
        }
        return  ans;
    }
}
