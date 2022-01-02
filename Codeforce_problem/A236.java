package com.company.cp;

import java.util.HashSet;

public class A236 {
public void girl(String n)
{
    HashSet<Character> h=new HashSet<>();
    for(int i=0;i<n.length();i++)
    {
        char value=n.charAt(i);
        h.add(value);
    }
    System.out.println(h.size());
}
}
