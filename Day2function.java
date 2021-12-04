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
    int decimaltoanybase(int n,int b)
    {
       int ans=0,pow=1;
       while(n!=0)
       {
           int sum=n%b;
           n=n/b;
           ans+=sum*pow;
           pow=pow*10;
       }
       return  ans;
    }
    int anybasetobase(int n,int b1,int b2)
    {
     int ans=binarytodecimal(n,b1);
        System.out.println(ans);
     int ans1=decimaltoanybase(ans,b2);
     return ans1;
    }
    int binarytodecimal(int n,int b1)
    {
        int ans=0,pow=1;
        while(n!=0)
        {
         int sum=n%10;
         n=n/10;
         ans+=sum*pow;
         pow=pow*b1;

        }
        return ans;
    }
    int decimaltobinary(int n,int b1)
    {
        int ans=0,pow=1;
      while(n!=0)
      {
          int sum=n%b1;
          n=n/b1;
          ans+=sum*pow;
          pow=pow*10;


      }
      return  ans;
    }
    int decimaladdition1(int base,int a,int b)
    {
        int ans=0,carry=0,pow=1;
        while(carry!=0||a!=0||b!=0)
        {
            int sum=carry+(a%10)+(b%10);

            carry=sum/base;
            sum=sum%base;
            a=a/10;
            b=b/10;
            ans+=sum*pow;
            pow=pow*10;


        }
        return  ans;
    }
    int decimalsubtraction(int n,int m,int b)
    {
        int borrow=0,ans=0,pow=1;
        while(n!=0)
        {
            int sum=borrow+(n%10)-(m%10);
            n=n/10;
            m=m/10;
            if(sum<0)
            {
                sum=b+sum;
                //System.out.println(sum);
                borrow=-1;

            }
            else
            {
                borrow=0;
            }
            ans+=sum*pow;
            pow*=10;
        }
        return  ans;
    }

}
