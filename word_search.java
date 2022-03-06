package com.backtracking;

public class word_search {
    public boolean cal(char [][] board,String word)
    {
        int n=board.length;
        int m=board[0].length;
        char prev=word.charAt(0);
        boolean vis[][]=new boolean[n][m];
     for(int i=0;i<board.length;i++)
     {
         for(int j=0;j<board[0].length;j++)
         {
             if(board[i][j]==prev) {

                 if (check(i, j, board, word, vis)) {
                     return true;
                 }
             }
         }
     }
     return false;
    }
    boolean check(int sr,int sc,char [][]board,String word,boolean vis[][])
    {
        if(sr>=board.length||sr<0||sc>=board.length||sc<0||vis[sr][sc]==true||board[sr][sc]!=word.charAt(0))
        {
            return false;
        }
        if(word.length()==0)
        {
            return true;
        }
        vis[sr][sc]=true;

            char prev = word.charAt(0);
            check(sr - 1, sc, board, word.substring(1), vis);
            check(sr, sc - 1, board, word.substring(1), vis);
            check(sr + 1, sc, board, word.substring(1), vis);
            check(sr, sc + 1, board, word.substring(1), vis);
        vis[sr][sc]=false;
        return false;
    }

}
