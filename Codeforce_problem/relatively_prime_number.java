package com.company.cp;

import java.util.Scanner;

public class relatively_prime_number {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        long l=s.nextLong();
        long r=s.nextLong();
        cal(l,r);
    }
    static void cal(long l,long r)
    {
        for(long i=l;i<=r;i=i+2)
        {
            System.out.println(i+" "+(i+1));
        }
    }
}
