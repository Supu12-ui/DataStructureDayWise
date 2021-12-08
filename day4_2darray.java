package com.company;

public class day4_2darray {
    void print(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
    void matrix_multiplication(int a[][],int b[][])
    {
        int n1=a.length;
        int m1=a[0].length;
        int n2=b.length;
        int m2=b[0].length;

        if(m1!=n2)
        {
            System.out.println("Invalid matric");
        }
        else
        {
            int c[][]=matrix(a,b);
            print(c);
            return;
        }
    }
    int [][] matrix(int a[][],int b[][])//multiplication topic
    {
        int n1=a.length;
        int m1=a[0].length;
        int n2=b.length;
        int m2=b[0].length;
        int c[][]=new int[n1][m2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<m2;j++)
            {
                int sum=0;
                for(int k=0;k<n2;k++)
                {
                 sum+=a[i][k]*b[k][j];

                }

                c[i][j]=sum;

            }
        }
        return c;
    }
    void stateofwokanda(int a[][])
    {

        int n=a.length;

        int m=a[0].length;
        for(int j=0;j<m;j++)
        {
                if(j%2==0) {
                    for (int i = 0; i < n; i++) {
                        System.out.print(a[i][j] + "->");
                    }
                }
           else
            {
                   reverse(a,0,n-1,j);
                for(int i=0;i<n;i++) {


                    System.out.print(a[i][j] + "->");
                }
            }

        }
    }
    void reverse(int a[][], int start, int end, int j )
    {
        while(start<=end)
        {
            int temp=a[start][j];
            a[start][j]=a[end][j];
            a[end][j]=temp;
            start++;
            end--;
        }
    }
    void spiral(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        int minrow=0;
        int mincol=0;
        int maxrow=n-1;
        int maxcol=m-1;
        int count=0;
        int total=n*m;
        while(count<total)
        {
            for(int i=minrow;i<=maxrow && count<total;i++)
            {
                System.out.print(a[i][mincol]+"->");
                count++;
            }
            mincol++;
            for(int i=mincol;i<=maxcol&& count<total;i++)
            {
                System.out.print(a[maxrow][i]);
                count++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow&& count<total;i--)
            {
                System.out.print(a[i][maxcol]);
                count++;
            }
            maxcol--;
            for (int i=maxcol;i>=mincol&& count<total;i--)
            {
                System.out.print(a[minrow][i]);
                count++;
            }
            minrow++;
        }
    }
    //Homework
    void traverse(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        for(int col=0;col<m;col++)
        {
            if(col%2==0)
            {
                for(int i=n-1;i>=0;i--)
                {
                    System.out.print(a[i][col]+"->");
                }
            }
            else
            {
                for(int i=0;i<n;i++)
                {
                    System.out.print(a[i][col]+"->");
                }
            }

        }
    }
    void spiral_display(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        int mincol=0,minrow=0;
        int maxrow=n-1;
        int maxcol=m-1;
        int count=0;
        int total=n*m;
        while(count<total)
        {
            for(int i=mincol;i<=maxcol&&count<total;i++)
            {
                System.out.print(a[minrow][i]+"->");
                count++;
            }
            minrow++;
            for(int i=minrow;i<=maxrow&&count<total;i++)

            {
                System.out.print(a[i][maxcol]+"->");
                count++;
            }
            maxcol--;
            for(int i=maxcol;i>=mincol&&count<total;i--)
            {
                System.out.print(a[maxrow][i]+"->");
                count++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow&&count<total;i--)
            {
                System.out.print(a[i][mincol]+"->");
                count++;
            }
            mincol++;
        }
    }
    void exit_of_point(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        int i=0,j=0;
        int dir=0;
        while(true)
        {
            dir=dir+a[i][j];
            dir=dir%4;
            if(dir==0)
            {
                j++;
            }
            else if(dir==1)
            {
                i++;
            }
            else if(dir==2)
            {
                j--;
            }
            else if(dir==3)
            {
                i--;
            }
            if(i<0||j<0||i>=n||j>=m)
            {
                break;
            }
        }
        if(i<0)
        {
            i++;
        }
        else if(i>=n)
        {
            i--;
        }
        else if(j<0)
        {
            j++;
        }
        else if(j>=m)
        {
            j--;
        }
        System.out.println(i);
        System.out.println(j);

    }
    void rotate_90(int a[][])
    {
        int n=a.length;
        int m=a[0].length;
        transpose(a,n,m);
        for(int[] val:a)
        {
           print_reverse(val,0,m-1);
        }
        print(a);
    }
    void transpose(int a[][],int n,int m)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                if(i!=j)
                {
                    int temp=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=temp;
                }
            }
        }
    }
    void print_reverse(int a[],int start,int end)

    {

        while(start<=end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }

    void ringrotate(int a[][],int s,int r)
    {
     spiral2dto1d(a,s,r);
     print(a);

    }
    void spiral2dto1d(int a[][],int s,int r)
    {
        int n=a.length;
        int m=a[0].length;
        int minrow=s-1;
        int mincol=s-1;
        int maxrow=n-s;
        int maxcol=m-s;
        int count=0;
        int total=2*((maxrow-minrow)+(maxcol-mincol));
        System.out.println(total);
        int ans[]=new int[total];

        while(count<total)
        {
            for(int i=minrow;i<=maxrow&&count<total;i++)
            {
                ans[count]=a[i][mincol];
                count++;
            }
            mincol++;
            for(int i=mincol;i<=maxcol&&count<total;i++)
            {
                ans[count]=a[maxrow][i];
                count++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow&&count<total;i--)
            {
                ans[count]=a[i][maxcol];
                count++;
            }
            maxcol--;
            for(int i=maxcol;i>=mincol&&count<total;i--)
            {
                ans[count]=a[minrow][i];
                count++;
            }
            minrow++;

        }

        int []ans1=rotate(ans,r,ans.length);

        spiral1dto2d(a,s,r,ans1);

    }
    void spiral1dto2d(int a[][],int s,int r,int ans[])
    {
        int n=a.length;
        int m=a[0].length;
        int minrow=s-1;
        int mincol=s-1;
        int maxrow=n-s;
        int maxcol=m-s;
        int count=0;
        int total=ans.length;


        while(count<total)
        {
            for(int i=minrow;i<=maxrow&&count<total;i++)
            {
                a[i][mincol]=ans[count];
                count++;
            }
            mincol++;
            for(int i=mincol;i<=maxcol&&count<total;i++)
            {
                a[maxrow][i]=ans[count];
                count++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow&&count<total;i--)
            {
                a[i][maxcol]=ans[count];
                count++;
            }
            maxcol--;
            for(int i=maxcol;i>=mincol&&count<total;i--)
            {
                a[minrow][i]=ans[count];
                count++;
            }
            minrow++;

        }


    }

    int[] rotate(int a[],int r,int len)
    {
        r=((r%len)+len)+len;
        while(r!=0)
        {
            int temp=a[len-1];
            for(int i=len-1;i>0;i--)
            {
                a[i]=a[i-1];

            }
            a[0]=temp;
            r--;
        }
        return a;

    }
    void search2dmatrix(int a[][],int target)
    {
        int n=a.length;
        int m=a[0].length;
        int top=0;
        int down=m-1;
        while(true)
        {
            if(target==a[top][down])
            {
                System.out.print("true");
                break;
            }
            else if(a[top][down]<target)
            {
                top++;
            }
            else if(a[top][down]>target)
            {
                down--;
            }
            if(top>=n||down>=m)
            {
                System.out.println("false");
                break;
            }
            if(top<0||down<0)
            {
                System.out.println("false");
                break;
            }
        }
    }

}
