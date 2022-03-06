package com.backtracking;

public class groupsum {
    public boolean groupSum(int start,int nums[],int target)
    {
        if(start==nums.length)
        {
            if(target==0)
            {
                return true;
            }
        }
        if(target==0)
        {
            return true;
        }
        if(nums[start]<=target)
        {
            return groupSum(start+1,nums,target-nums[start]);
        }
        else
        {
            return groupSum(start+1,nums,target);
        }
    }
}



class Solution
{

    static int[] x = {-1, 0, 1, 0};
    static int[] y = {0, 1, 0, -1};

    public boolean isWordExist(char[][] board, String word)
    {
        int r = board.length;
        int c = board[0].length;
        boolean[][] visited = new boolean[r][c];

        for(int i=0; i<r; i++) {
            for(int j=0; j<c; j++) {
                if( searchWord(board, visited, word, i, j, 0) ) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean searchWord(char[][] board, boolean[][] visited, String word, int i, int j, int index) {
        if(index > word.length()) {
            return false;
        }

        if(index == word.length()) {
            return true;
        }

        if(word.charAt(index) != board[i][j]) {
            return false;
        }

        visited[i][j] = true;

        boolean wordFound = false;
        for(int k=0; k<4; k++) {
            int u = i+x[k];
            int v = j+y[k];

            if(isValidCell(board, visited, u, v)) {
                if( searchWord(board, visited, word, u, v, index+1) ) {
                    wordFound = true;
                    break;
                }
            }
        }

        visited[i][j] = false;

        return wordFound;
    }

    public boolean isValidCell(char[][] board, boolean[][] visited, int u, int v) {
        return (u<0 || v<0 || u>=board.length || v>=board[u].length || visited[u][v])? false:true;
    }
}

