package com.company.cp;

public class A1622 {
    public void check(int l1,int l2,int l3)
    {
        if(l1==l2)
        {
            if(l3%2==0)
            {
                System.out.println("YES");
                return;
            }
        }
         if(l1==l3)
        {
            if(l2%2==0)
            {
                System.out.println("YES");
                return;
            }
        }
         if(l2==l3)
        {
            if(l1%2==0)
            {
                System.out.println("YES");
                return;
            }
        }
         if((l1+l2)==l3)
         {
             System.out.println("YES");
             return;
         }
         if((l2+l3)==l1)
         {
             System.out.println("YES");
             return;
         }
         if((l1+l3)==l2)
         {
             System.out.println("YES");
         }
        System.out.println("NO");
    }
}
