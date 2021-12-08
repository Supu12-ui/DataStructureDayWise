package com.company;

public class pattern_problem_day1 {
    //pattern 6
    /*
     *	*	*		*	*	*
     *	*				*	*
     *						*
     *	*				*	*
     *	*	*		*	*	*
     */
    void pattern6(int n)
    {
        if(n%2==0)
        {
            n++;
        }
        int nsp=1,nst=(n+1)/2;
        for(int row=1;row<=n;row++)
        {
            for(int colstar=1;colstar<=nst;colstar++)
            {
                System.out.print("*\t");
            }
            for(int colspace=1;colspace<=nsp;colspace++)
            {
                System.out.print("\t");
            }
            for(int colstar=1;colstar<=nst;colstar++)
            {
                System.out.print("*\t");
            }
            if(row<=n/2)
            {
                nsp=nsp+2;
                nst=nst-1;
            }
            else
            {
                nsp=nsp-2;
                nst=nst+1;
            }
            System.out.println();
        }

    }



    void pattern5(int n)
    {

        if(n%2==0) n++;
        int nsp=n/2,nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int colsp=1;colsp<=nsp;colsp++)
            {
                System.out.print("\t");
            }
            for(int colst=1;colst<=nst;colst++)
            {
                System.out.print("*\t");
            }
            if(row<((n/2)+1))
            {
                nsp=nsp-1;
                nst=nst+2;
            }
            else
            {
                nsp=nsp+1;
                nst=nst-2;
            }
            System.out.println();
        }
    }
    /*
     *
     *
     *
     *
     */
    void pattern7(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==col)
                {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    /*
     *
     *
     *
     *
     *
     */
    static  void pattern8(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if((row+col)==n+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    /*
     *          *
     *     *
     *
     *     *
     *          *
     */
    static void pattern9(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(row==col)
                {
                    System.out.print("*\t");
                }
                else  if((row+col)==n+1)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    void patter9_gap(int n)
    {
        int nsp1=0,nsp2=(n-2),nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int row_nsp1=1;row_nsp1<=nsp1;row_nsp1++)
            {
                System.out.print("\t");
            }

            System.out.print("*\t");
            for(int row_nsp2=1;row_nsp2<=nsp2;row_nsp2++)
            {
                System.out.print("\t");
            }
            if(row!=(n+1)/2)
            {
                System.out.print("*\t");
            }
            if(row<=(n)/2)
            {
                nsp1=nsp1+1;
                nsp2=nsp2-2;

            }
            else
            {
                nsp1=nsp1-1;
                nsp2=nsp2+2;
            }
            System.out.println();
        }
    }
    /*
      1
      2 2
      3 3 3
      4 4 4 4
      5 5 5 5 5
     */
    void pattern10(int n)
    {
        int nst=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print(i);
            }
            nst++;
            System.out.println();
        }
    }
    void pattern11(int n)
    {
        int nst=1;
        int count=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=nst;j++)
            {
                System.out.print(count+++"\t");
            }
            nst++;
            System.out.println();
        }
    }
    /*
           1
         2 2 2
       3 3 3 3 3
         2 2 2
           1
     */
    void pattern12(int n)
    {
        int nsp=n/2,nst=1,count=1;
        for(int row=1;row<=n;row++)
        {
            for(int space=1;space<=nsp;space++)
            {
                System.out.print("\t");
            }
            for(int col=1;col<=nst;col++)
            {
                System.out.print(count+"\t");
            }
            if(row<=n/2)
            {
                nsp=nsp-1;
                nst=nst+2;
                count++;
            }
            else
            {
                nsp=nsp+1;
                nst=nst-2;
                count--;
            }
            System.out.println();
        }

    }
    /*      1
		2	3	2
	3	4	5	4	3
4	5	6	7	6	5	4
	3	4	5	4	3
		2	3	2
			1
			*/
    void pattern15(int n)
    {


        int nsp=n/2,nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
             int count=row<=n/2?row:n-row+1;
            for(int j=1;j<=nst;j++)
            {
                    System.out.print(count+"\t");
                    count=(j<=(nst)/2)?count+1:count-1;


            }
            if(row<=n/2)
            {
                nsp--;
                nst=nst+2;

            }
            else
            {
                nsp++;
                nst=nst-2;

            }
            System.out.println();
        }
    }
 /*
            1
		2	1	2
	3	2	1	2	3
4	3	2	1	2	3	4
	3	2	1	2	3
		2	1	2
			1
  */
    void pattern16(int n)
    {


        int nsp=n/2,nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("\t");
            }
            int count=row<=n/2?row:n-row+1;
            for(int j=1;j<=nst;j++)
            {
                System.out.print(count+"\t");
                count=(j<=(nst)/2)?count-1:count+1;


            }
            if(row<=n/2)
            {
                nsp--;
                nst=nst+2;

            }
            else
            {
                nsp++;
                nst=nst-2;

            }
            System.out.println();
        }
    }      /*
     *												*
     *	*										*	*
     *	*	*								*	*	*
     *	*	*	*						*	*	*	*
     *	*	*	*	*				*	*	*	*	*
     *	*	*	*	*	*		*	*	*	*	*	*
     *	*	*	*	*	*	*	*	*	*	*	*	*

     */
    void pattern17(int n)
    {
        int nst=1,nsp=2*n-3;
        for(int row=1;row<=n;row++)
        {
            for(int i=1;i<=nst;i++)
            {
                System.out.print("*\t");
            }
            for(int i=1;i<=nsp;i++)
            {
                System.out.print("\t");
            }
            if(row==n)
            {
                nst--;
            }
            for(int i=1;i<=nst;i++)
            {
                System.out.print("*\t");
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
    /*
1								1
1	2						2	1
1	2	3				3	2	1
1	2	3	4		4	3	2	1
1	2	3	4	5	4	3	2	1
     */
    void pattern18(int n)
    {
        int nst=1,nsp=2*n-3;
        for(int row=1;row<=n;row++)
        {
            for(int i=1;i<=nst;i++)
            {
                System.out.print(i+"\t");
            }
            for(int i=1;i<=nsp;i++)
            {
                System.out.print("\t");
            }
            if(row==n)
            {
                nst--;
            }
            for(int i=nst;i>=1;i--)
            {
                System.out.print(i+"\t");
            }
            nst++;
            nsp-=2;
            System.out.println();
        }
    }
    /*
0
1	1
2	3	5
8	13	21	34
55	89	144	233	377
     */
    void patter19(int n)
    {
        int nst=1,a=0,b=1;
        for(int row=1;row<=n;row++)
        {
            for(int i=1;i<=nst;i++)
            {
                System.out.print(a+"\t");
                int sum=a+b;
                a=b;
                b=sum;
            }
            nst++;
            System.out.println();
        }
    }
    /*
1
1	1
1	2	1
1	3	3	1
1	4	6	4	1
1	5	10	10	5	1

     */
    void pascalPattern(int n) {
        int nst = 0;
        for (int row = 0; row <= n; row++) {
            int value = 1;
            for (int col = 0; col <= nst; col++) {
                System.out.print(value + "\t");
                value = ((row - col) * value) / (col + 1);
            }
            nst++;
            System.out.println();
        }
    }
    /*
                *
                *	*
                *	*	*
     *	*	*	*	*	*	*
                *	*	*
                *	*
                *
     */
    void pattern20(int n)
    {
        int nsp=n/2,nst=1;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=nsp;col++)
            {
                System.out.print("\t");
            }
            for(int col=1;col<=nst;col++)
            {
                System.out.print("*\t");
            }
             if(row<n/2)
             {
                 nst++;
             }
             else if(row==n/2)
             {
                 nst=n;
                 nsp=0;
             }
             else if(row==(n+1)/2)
             {
                 nsp=n/2;
                 nst=n/2;
             }
             else
             {
                 nst--;
             }
            System.out.println();
        }
    }
    void pattern21(int n)
    {
        int nsp1=0,nst1=n,nsp2=0,nst2=0;
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=nsp1;col++)
            {
                System.out.print("\t");
            }
            for(int col=1;col<=nst1;col++)
            {
                System.out.print("*\t");
            }
            for(int col=1;col<=nsp2;col++)
            {
                System.out.print("\t");
            }
            nst2=row>=(n+1)/2||row==1?0:1;
            for(int col=1;col<=nst2;col++)
            {
                System.out.print("*\t");
            }
            if(row==1)
            {
                nsp1=1;
                nst1=1;
                nsp2=n-4;

            }
            else if(row<=n/2)
            {
                nsp1+=1;
                nsp2=nsp2-2;
            }
            else
            {
                nsp1--;
                nsp2=0;
                nst1+=2;
            }
            System.out.println();
        }
    }
    /*

     *						*
     *						*
     *						*
     *			*			*
     *		*		*		*
     *	*				*	*
     *						*


     */
    void pattern22(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(col==1||col==n)
                {
                    System.out.print("*\t");
                }
                else if((n+1)/2==row&&(n+1)/2==col)
                {
                    System.out.print("*\t");
                }
                else if(row>(n+1)/2&&(row+col)%2==0&&col!=(n+1)/2&&row!=n)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }

            }
            System.out.println();
        }
    }
    /*
     *	*	*	*	*	*	*						*
     						*                       *
     						*                       *
     						*                       *
     						*                       *
     						*                       *
     *	*	*	*	*	*	*	*	*	*	*	*	*
     *						*
     *						*
     *						*
     *						*
     *						*
     *						*	*	*	*	*	*	*







     */
    void pattern23(int n)
    {
        for(int row=1;row<=n;row++)
        {
            for(int col=1;col<=n;col++)
            {
                if(((row==1&&col<=(n+1)/2)||col==n)&&row<(n+1)/2||col==(n+1)/2)
                {
                    System.out.print("*\t");
                }
                else if(row==(n+1)/2)
            {
                System.out.print("*\t");
            }
                else if(row>(n+1)/2 && (col==1)||(row==n)&&(col>(n+1)/2))
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
    void pattern25(int n)
    {
       int m=n/2;
       int m1=(4*m)+n;
       int nsp1=(2*m);
       int nst1=n;
       int nsp2=n-2;
       int nst2=0;
       for(int i=0;i<m1;i++)
       {
           if(i==0||i==m1)
           {
               nsp2=0;
           }
           for(int col=0;col<nsp1;col++)
           {
               System.out.print("\t");
           }
           for(int col=0;col<nst1;col++)
           {
               System.out.print("*\t");
           }
           for(int col=0;col<nsp2;col++)
           {
               System.out.print("\t");
           }
           for(int col=0;col<nst2;col++)
           {
               System.out.print("*\t");
           }
           if(i==n-1)
           {
               nsp1=0;
               nst1=0;
               nst2=1;

           }
           System.out.println();
       }
    }
}
