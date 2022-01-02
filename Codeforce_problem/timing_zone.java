package com.company.cp;

import java.util.ArrayList;
import java.util.Collections;

public class timing_zone {
    public void meeting(int a[][])
    {
        int n=a.length;
        boolean ans[]=new boolean[n];
        int last_time=a[n-1][1];
         ans[n-1]=true;
        for(int i=n-2;i>=0;i--)
        {
            if(last_time>a[i][0])
            {
               ans[i]=false;
            }
            else if(last_time<a[i][0])
            {
                last_time=a[i][0];
               ans[i]=true;
            }
        }
       for(int i=0;i<ans.length;i++)
       {
           System.out.println(ans[i]);
       }
    }
}
/*Given intervals such as (10,20), (5,16), (2,6) and you have to tell the number of meetings you could attend and return a boolean array of answers for ex- starting from the third slot you cannot attend the second slot as 5<6 so the answer array would be (true, false, true).
* */
