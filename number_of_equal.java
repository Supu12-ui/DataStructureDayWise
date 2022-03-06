package com.two_pointer;

import java.util.Scanner;

public class number_of_equal {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[m];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();

        }
        for(int j=0;j<m;j++)
        {
            b[j]=s.nextInt();
        }
       cal(a,b,n,m);
    }
    static void cal(int a[],int b[],int n,int m) {

        int j = 0;
        int count = 0;
        while(j<m)
        {
            for(int i=0;i<n&&j<m;i++)
            {
                if(a[i]==b[j]) {
                    count++;
                }

            }
            j++;

        }
        System.out.println(count);
    }
}
