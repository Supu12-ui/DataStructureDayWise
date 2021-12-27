package com.company.cp;

public class A266 {
    void check(String s[])
    {
        for(int i=1;i<s.length;i++)
        {
            if(s[i]=="G"&&s[i-1]=="B")
            {
                s[i-1]="G";
                s[i]="B";
                i++;
            }
        }
    }
}
