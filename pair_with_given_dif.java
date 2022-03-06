package com.two_pointer;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class pair_with_given_dif {
    public static void main(String [] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(s.nextInt());

        }
        int b=s.nextInt();
        cal(a,b);
    }
    static  void cal(ArrayList<Integer> a,int b)
    {
        Hashtable<Integer,Integer> hs=new Hashtable<>();
        for(int i=0;i<a.size();i++)
        {
            hs.put(a.get(i),0);
        }
        for(int i=0;i<a.size();i++)
        {
            if(hs.containsKey(a.get(i)+b)) {
                System.out.println("1");
                return;

            }
            else {
                hs.put(a.get(i), b + a.get(i));
            }
        }
        System.out.println("0");
    }
}
