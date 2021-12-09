package com.company;

public class peer_programming {
    //Input: grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
    //Output: 8
    //Explanation: There are 8 negatives number in the matrix.
    void count_negative_number_in_agrid(int grid[][])
    {

    }
    void kthsmallest(int a[][],int k)
    {

    }
    int binarysearch1(int a[][],int target)
    {
        int n=a.length;
        int m=a[0].length;
        int left=a[0][0];
        int right=a[n-1][m-1];
        while(left<right)
        {
            int mid=left+(right-left)/2;
            System.out.println("mid"+mid);
            int count=bs(a,mid);
            System.out.println("count"+count);
            if(count<target)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
    int bs(int a[][],int target)
    {
        int n=a.length;
        int m=a[0].length;
        int row=0;
        int count=0;
        int col=m-1;
        while(row<n&&col>=0)
        {
            System.out.println(" a"+a[row][col]);
            if(target<a[row][col])
            {
                col--;
            }
            else
            {
                count=count+(col+1);
                row++;
            }
        }
        return  count;
    }

    void k_thsmallest(int a[][],int k)
    {
        int n=a.length;

        int m=a[0].length;
        int arr[]=new int[n*m];
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[count]=a[i][j];
                count++;
            }
        }
        sort(arr,arr.length,k);


    }
    void sort(int a[],int n,int k)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(binarysearch(a,a.length,k));
    }
    int binarysearch(int a[],int n,int k)
    {
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(mid==(k-1))
            {
              return a[mid];
            }
            else if(mid<(k-1))
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        return 0;
    }
    public int findKthNumber(int m, int n, int k) {
        int left=0;
        int right=m*n;
        while(left<right)
        {
            int mid=(left+right)/2;
            int count=0;
            for(int i=1;i<=m;i++)
            {
                count=count+Math.min(n,mid/i);
            }
            if(count<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return  left;

    }
    int kthsmallest1(int a[][],int k)
    {
        int left=a[0][0];
        int right=a[a.length-1][a[0].length-1];
        while(left<right)
        {
            int mid=left+(right-left)/2;
            int count=bs1(a,mid);
            if(count<k)
            {
                left=mid+1;
            }
            else
            {
                right=mid;
            }
        }
        return left;
    }
    int bs1(int a[][],int k)
    {
        int n= a.length;
        int m=a[0].length;
        int count=0;
        int row=0;
        int col=m-1;
        while(row<n&&col>=0)
        {
            if(a[row][col]>k)
            {
                col--;
            }
            else
            {
                count=count+col+1;
                row++;
            }
        }
        return count;

    }
    void spiralmatrix2(int n)
    {
        int minrow=0;
        int mincol=0;
        int maxrow=n-1;
        int maxcol=n-1;
        int count=1;
        int total=n*n;
        int a[][]=new int[n][n];
        while(count<=total)
        {
            for(int i=mincol;i<=maxcol;i++)
            {
                a[minrow][i]=count;
                count++;
            }
            minrow++;
            for(int i=minrow;i<=maxrow;i++)
            {
                a[i][maxcol]=count;
                count++;
            }
            maxcol--;
            for(int i=maxcol;i>=mincol;i--)
            {
                a[maxrow][i]=count;
                count++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow;i--)
            {
                a[i][mincol]=count;
                count++;
            }
            mincol++;

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
