package com.company.cp;

public class A1409 {
    public void check(int a,int b)
    {
        int start=0;
        int end=0;
        if((a==b))
        {
            System.out.println(0);
            return;
        }
        if(a<b)
        {
            start=b;
            end=a;
        }
        else
        {
            start=a;
            end=b;
        }
        solve(start,end);
    }
    public void solve(int start,int end)
    {
        int k=10;
        int count=0;
        while(start!=end)
        {
          /*  if(start==end||k<1)
            {
                break;
            }*/
            if(Math.abs(start-k)>=end)
            {
                start=start-k;
                count++;
            }
            else {
                k--;
            }
        }
        System.out.println(count);




    }
}
