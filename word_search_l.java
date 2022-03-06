package com.backtracking;

public class word_search_l {
    public void search(char c[][],String word)
    {
        int n=c.length;
        int m=c[0].length;
        boolean vis[][]=new boolean[n][m];
        boolean see=false;
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c[0].length;j++)
            {
                char prev=word.charAt(0);
                if(c[i][j]==prev)
                {
                    check(i,j,c,word.substring(1),vis,see);
                    if(see==true) {
                        System.out.println(true);
                        return;
                    }
                }
            }
        }
        System.out.println(see);
    }
    void check(int row,int col,char c[][],String word,boolean vis[][],boolean see) {
        if (row >= c.length || col >= c.length || row < 0 || col < 0 || vis[row][col] == true || c[row][col] != word.charAt(0)) {
            return;
        }
        if (word.length() == 0) {
            see = true;
            return;
        }
        char prev = word.charAt(0);
        vis[row][col] = true;
        if (prev == c[row][col]) {
            check(row - 1, col, c, word.substring(1), vis, see);
            check(row, col - 1, c, word.substring(1), vis, see);
            check(row, col + 1, c, word.substring(1), vis, see);
            check(row + 1, col, c, word.substring(1), vis, see);
        }
        vis[row][col] = false;



    }
}
