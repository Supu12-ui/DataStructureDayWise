package com.company.cp;

public class B118 {
    public  void pattern(int n)
    {
        int count=0;
        int nsp=n,nst=1,nst2=0;
        for(int row=0;row<(n*2+1);row++)
        {
            for(int i=0;i<nsp;i++)
            {
                System.out.print("  ");
            }
            for(int i=0;i<nst;i++)
            {
                if(row==0)
                {
                    System.out.print(count);
                }
                else if(row==(n*2))
                {
                    System.out.print(count);
                }
                else {
                    System.out.print(count + " ");
                    count++;
                }

            }
            count--;
            for(int i=0;i<nst2;i++) {
                count--;
                if (i == nst2 - 1) {
                    System.out.print(count);
                } else {
                    System.out.print(count + " ");
                }
            }
            if(n>row)
            {
                count=0;
                nsp--;
                nst=nst+1;
                nst2++;
            }
            else
            {
                count=0;
                nsp++;
                nst=nst-1;
                nst2--;
            }
            System.out.println();

        }
    }
}
