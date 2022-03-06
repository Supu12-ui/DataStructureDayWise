package com.backtracking;

import java.util.ArrayList;

public class flood_fill {
    //method 1
    public void flood_fill(int sr, int sc, int mat[][], boolean vis[][], String out, ArrayList<String> ans)
    {
        if(sr<0 ||sc<0||sr>=mat.length||sc>=mat[0].length||vis[sr][sc]==true||mat[sr][sc]==1)
        {
            return;
        }
        if(sr==mat.length-1 && sc==mat[0].length-1)
        {
            ans.add(out);
            return;
        }
        vis[sr][sc]=true;
        flood_fill(sr-1,sc,mat,vis,out+"t",ans);
        flood_fill(sr,sc-1,mat,vis,out+"l",ans);
        flood_fill(sr+1,sc,mat,vis,out+"d",ans);
        flood_fill(sr,sc+1,mat,vis,out+"r",ans);
        vis[sr][sc]=false;
    }
    //method 2 using dir
    static  int dir[][]={{-1,0},{0,-1},{1,0},{0,1}};
    static String ndir[]={"t","l","d","r"};
    public void cal(int sr,int sc,int mat[][],boolean vis[][],String out,ArrayList<String> ans)
    {
        if(sr<0 ||sc<0||sr>=mat.length||sc>=mat[0].length||vis[sr][sc]==true||mat[sr][sc]==1)
        {
            return;
        }
        if(sr==mat.length-1&&sc==mat[0].length-1)
        {
            ans.add(out);
            return;
        }
        vis[sr][sc]=true;
        for(int d=0;d< dir.length;d++)
        {
            int r=sr+dir[d][0];
            int c=sc+dir[d][1];
            cal(r, c, mat, vis, out+ndir[d], ans);
        }
        vis[sr][sc]=false;
    }
}
