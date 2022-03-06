package com.two_pointer;
import java.util.*;
public class merge_two_array {
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
        merge(a,b,n,m);
    }
    static void merge(int a[],int b[],int n,int m )
    {
        int i=0;
        int j=0;
        int c[]=new int[n+m];
        int k=0;
        while(i<n||j<m)
        {
            if((i<n )||a[i]<b[j])
            {
                c[k]=a[i];
                i++;
                k++;
            }
            else
            {
                c[k]=b[j];
                j++;
                k++;
            }
        }
        for(int p=0;p<c.length;p++)
        {
            System.out.print(c[p]+" ");
        }
    }
}
