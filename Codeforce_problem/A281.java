package com.company.cp;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A281 {
    public static  void main(String []args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the numbear");
        int n=s.nextInt();
    }
    public void cal(String s)
    {
            char val=s.charAt(0);
            if(val>='a'&&val<='z') {
                val = (char) (val - 'a' + 'A');
            }
            s=val+s.substring(1,s.length());
            System.out.println(s);
    }
}
