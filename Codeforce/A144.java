package com.company.cp;

public class A144 {
    public void arrival(int a[])
    {
        int max=Integer.MIN_VALUE;
        int maxIndex=0;
        int min=Integer.MAX_VALUE;
        int minIndex=0;
        for(int i=a.length-1;i>=0;i--)
        {
            if(max<=a[i])
            {
                max=a[i];
                maxIndex=i;
            }
        }
        for(int i=0;i<a.length;i++)
        {
            if(min>=a[i])
            {
                min=a[i];
                minIndex=i;
            }
        }
        System.out.println(max+" min"+min);
        System.out.println(minIndex +" max"+maxIndex);
        int t1=maxIndex-0;
        int t2=Math.abs(minIndex-(a.length-1));
        int time=t1+t2;
       if(maxIndex>minIndex)
       {
           System.out.println(time-1);
       }
       else
       {
           System.out.println(time);
       }

    }
}
