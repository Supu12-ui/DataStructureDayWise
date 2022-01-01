package com.company.cp;

public class robot_cleaner {
   public void robot(int n,int m,int rb,int cb,int rd,int cd,int count)
    {
        if(rb==rd||cb==cd)
        {
            System.out.println(count);
            return;
        }
        if(rb>n||cb>m)
        {
            count--;
            return;
        }
        if((rb+1)<n&&(cb+1)<m)
        {
            robot(n,m,rb+1,cb+1,rd,cd,1+count);
        }
        else if((rb-1)>0&&(cb-1)>0)
        {
           robot(n,m,rb-1,cb-1,rd,cd,1+count);
        }
    }

}
