package com.company.cp;

import java.awt.*;

public class A_59 {
    public void check(String s)
    {
        int count_upp=0;
        int count_low=0;
        for(int i=0;i<s.length();i++)
        {
            char value=s.charAt(i);
            if(value>='A'&&value<='Z')
            {
                count_upp++;
            }
            else
            {
                count_low++;
            }
        }
        if(count_upp<=count_low)
        {
            s=s.toLowerCase();
        }
       else if(count_upp>count_low)
        {
            s=s.toUpperCase();
        }
        System.out.println(s);

    }
}
