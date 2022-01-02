package com.company.cp;

public class A228 {
    public void horseshoes(int a[],int count,int index)
    {
     if(index==a.length)
     {
         System.out.println(count);
         return;
     }
     if(index!=0&&a[index]==a[index-1])
     {
     horseshoes(a,count+1,index+1);
     return;
    }
     horseshoes(a,count,index+1);
}}
