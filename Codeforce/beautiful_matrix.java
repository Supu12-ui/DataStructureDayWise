package com.company.cp;

public class beautiful_matrix {
   public void search(int [][]mat)
    {
        int start=0;
        int end=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    start=i;
                    end=j;
                }
            }
        }
        System.out.println(beautiful_matrix(mat,start,end,0));
    }
    int beautiful_matrix(int mat[][],int start,int end,int count)
    {
        if(start==2&&end==2)
        {
            return 0;
        }
        if(2<=start&&2>end)
        {
            int recans=beautiful_matrix(mat,start,end+1,count);
            count=1+recans;
        }
        else if(2>start&&2>=end)
        {
            int recans=beautiful_matrix(mat,start+1,end,count);
            count=1+recans;
        }
        else if(2>=start&&2<end)
        {
            int recans=beautiful_matrix(mat,start,end-1,count);
            count=1+recans;
        }
        else if(2<start&&2<=end)
        {
            int recans=beautiful_matrix(mat,start-1,end,count);
           count=1+recans;
        }
        return count;
    }
}
