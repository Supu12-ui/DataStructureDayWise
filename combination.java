package com.backtracking;

import java.util.ArrayList;
import java.util.List;

public class combination {
    public void combination(int n,int k)
    {
        List<Integer> ans=new ArrayList<>();
        List<List<Integer>> myans=new ArrayList<>();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=i+1;
        }
        fun(a,k,0,ans,myans);
        System.out.println(myans);
    }
    public void fun(int a[],int k,int start,List<Integer> ans,List<List<Integer>> myans)
    {
        if(ans.size()==k)
        {
            myans.add(new ArrayList<>(ans));
            return;
        }
        for(int i=start;i<a.length;i++)
        {
            ans.add(a[i]);
            fun(a,k,i+1,ans,myans);
            ans.remove(ans.size()-1);
        }
    }
}




