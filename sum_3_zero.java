package com.two_pointer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class sum_3_zero {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(s.nextInt());

        }
        cal(arr);
    }
    static void cal(ArrayList<Integer> a)
    {
        HashSet<ArrayList<Integer>> hs=new HashSet<>();
        Collections.sort(a);
        for(int i=0;i<a.size();i++)
        {
            int start=i+1;
            int end=a.size()-1;
            while(start<end)
            {
                int sum=a.get(i)+a.get(start)+a.get(end);
                if(sum==0)
                {
                    ArrayList<Integer> arr=new ArrayList<>();
                    arr.add(a.get(i));
                    arr.add(a.get(start));
                    arr.add(a.get(end));
                    hs.add(new ArrayList<>(arr));
                }
                if(sum<0)
                {
                    start++;
                }
                else
                {
                    end--;
                }
            }
        }
       ArrayList<ArrayList<Integer>> ans=new ArrayList<>(hs);
        System.out.println(ans);
    }
}
