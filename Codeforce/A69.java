package com.company.cp;

public class A69 {
    public  void young_physicist(int mat[][],int n)
    {
        //int sum1=0;
        for(int col=0;col<3;col++)
        {
            int sum1=0;
            for(int row=0;row<n;row++)
            {
             sum1=sum1+mat[row][col];

            }
            if(sum1!=0)
            {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
