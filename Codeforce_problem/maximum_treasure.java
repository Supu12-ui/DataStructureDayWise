/*
Island with Maximum Tressure
Easy

Given a 2D matrix with dimension n x m , which represents a map of land and water, each cell of the matrix can consist of any value from 0 to 9(both included). Where 0 represents the water and non-zero represents the land. Non-zero value i.e., 1 to 9 represents the treasure hidden in that particular cell. You have to return the maximum treasure that can be collected from a single island.

An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.

Constraints

n == matrix.length
m == matrix[i].length
1 <= n, m <= 300
0 <= matrix[i][j] <= 9

Format

Input

Input is managed for you.

Output

Output is managed for you.

Example

Sample Input

3 5
1 3 1 2 0
1 2 0 9 0
1 1 0 0 0
0 0 0 0 0

Sample Output

21


 */

package com.company.cp;

import java.util.ArrayList;
import java.util.Scanner;

public class maximum_treasure {
    public static void main(String [] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        boolean vis[][]=new boolean[n][m];
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> ans=new ArrayList<>();
        check(0,0,mat,0,vis,ans,max);
        int ans1=Integer.MIN_VALUE;
        for(int i=0;i<ans.size();i++)
        {
            int value=ans.get(i);
            ans1=Math.max(ans1,value);
        }
        System.out.println(ans1);

    }
    static void check(int sr,int sc,int mat[][],int sum,boolean vis[][],ArrayList<Integer> ans,int max)
    {
        if(sr<0||sc<0||sr>=mat.length||sc>=mat[0].length||mat[sr][sc]==0||vis[sr][sc]==true)
        {
            max=Math.max(sum,max);
            ans.add(max);
            return;
        }
        vis[sr][sc]=true;

        sum=sum+mat[sr][sc];
        //max=Math.max(sum,max);
        check(sr-1,sc,mat,sum,vis,ans,max);
        check(sr,sc-1,mat,sum,vis,ans,max);
        check(sr,sc+1,mat,sum,vis,ans,max);
        check(sr+1,sc,mat,sum,vis,ans,max);


        vis[sr][sc]=false;


    }



}
