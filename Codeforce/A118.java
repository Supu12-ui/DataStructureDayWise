package com.company.cp;

public class A118 {

    public void string_task(String str)
    {

        for(int i=0;i<str.length();i++)
        {

            char value=str.charAt(i);
            if(value=='a'||value=='A'||value=='e'||value=='E'||value=='o'||value=='O'||value=='y'||value=='Y'||value=='u'||value=='U'||value=='i'||value=='I')
            {
               str=str.replace(value,' ');
            }


        }
        String s="";
       for(int i=0;i<str.length();i++)
       {
           char prev=str.charAt(i);
           if(prev==' ')
           {
            str=str.substring(0,i)+s.substring(i+1,s.length());
           }
           s=s+'.'+prev;
       }
       s=s.toLowerCase();
        System.out.println(s);

    }
}
