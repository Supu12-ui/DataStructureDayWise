package com.company.cp;

import java.util.Arrays;

public class A339 {
    public void cal(String str)
    {

        String s="";
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c!='+')
            {
                s=s+c;
            }
        }
       char ch[]=s.toCharArray();
        Arrays.sort(ch);

       for(int i=0;i<s.length()-1;i++)
       {
           System.out.print(ch[i]+"+");
       }
       System.out.println(ch[s.length()-1]);
    }
}
