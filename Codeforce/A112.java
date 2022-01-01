package com.company.cp;

public class A112 {
    public void peter(String first,String second)
    {
        if(first.length()==0||second.length()==0)
        {
            System.out.print(0);
            return;
        }
        char a1=first.charAt(0);
        char a2=second.charAt(0);
        if(a1==a2)
        {
           peter(first.substring(1),second.substring(1));
        }
        else if(a1!=a2)
        {
       char ch1=check(a1);
       if(ch1==a2)
       {
           peter(first.substring(1),second.substring(1));
       }
       else
       {
           System.out.print(-1);
           return;
       }
        }

    }
    char check(char ch)
    {
        char ans='0';
        if(ch>='a'&&ch<='z')
        {
            ans= (char)((char)ch-'a'+'A');
        }
        else
        {
            ans=(char)(ch-'A'+'a');
        }
        return ans;
    }
}
