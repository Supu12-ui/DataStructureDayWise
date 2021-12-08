package com.company;

import java.util.*;

public class day3array {
    boolean find_element(int arr[],int data)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==data)
            {
                return true;
            }
        }
        return  false;
    }
    int maximum(int arr[])
    {
     int max=0;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]>=max)
         {
             max=arr[i];
         }
     }
     return  max;
    }
    int minimum(int arr[])
    {
       int min=Integer.MAX_VALUE;
       for(int i=0;i<arr.length;i++)
       {
           if(min>arr[i])
           {
               min=arr[i];
           }

       }
       return min;
    }


    void span_of_array(int arr[],int n)
    {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            max=Math.max(max,arr[i]);
            min=Math.min(min,arr[i]);
        }

        int span=max-min;
        System.out.print(span);
    }
    void sum_of_two_array(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int max=Math.max(n1,n2);
        int arr3[]=new int[max];
        int carry=0,sum=0;
        for(int i=n1-1,j=n2-1,k=max-1;i>=0||j>=0||k>=0;i--,j--,k--)
        {
            if(i>=0&&j>=0)
            {
                 sum=carry+arr1[i]+arr2[j];
            }

            else if(i<0) {
                 sum = carry  + arr2[j];
            }
            else
            {
                sum=carry+arr1[i];
            }

            carry=sum/10;
            sum=sum%10;
            arr3[k]=sum;
        }
        if(carry!=0)
        {
            System.out.print(carry);
            print(arr3,max);

        }
        else
        {
            print(arr3,max);
        }

    }
    void print(int arr[],int n)
    {
        for(int value:arr)
        {
            System.out.print(value);
        }
    }
    //
    //Difference of the two array
    //assume that arr2 length is greater
    void diff(int arr1[],int arr2[])
    {
        int n1=arr1.length;
        int n2=arr2.length;
        int arr3[]=new int[n2];
        int borrow=0;
        for(int i=n1-1,j=n2-1,k=n2-1;i>=0||j>=0||k>=0;i--,j--,k--)
        {
            int sum=borrow+arr2[j];
            if(i>=0)
            {
                sum=sum-arr1[i];
            }
            if(sum<0)
            {
                sum=sum+10;
                borrow=-1;
            }
            else
            {
                borrow=0;
            }
            sum=sum%10;
            arr3[k]=sum;
        }
        handlesubtraction(arr3,arr3.length);
    }
    void handlesubtraction(int arr[],int n)
    {
        int firstIndex=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                firstIndex=i;
                break;
            }
        }
        if(firstIndex==-1)
        {
            System.out.println("0");
        return;
        }
        for(int i=firstIndex;i<n;i++)
        {
            System.out.print(arr[i]);
        }

    }
    void rotate_the_array(int a[],int n,int r)
    {
        r=((r+n)%n+n)%n;
        while(r!=0)
        {
            leftrotation(a,n);
            r--;
        }

        print(a,n);
    }
    void leftrotation(int a[],int n)
    {
        int temp=a[n-1];
        for(int i=n-2;i>=0;i--)
        {
            a[i+1]=a[i];
        }
        a[0]=temp;
    }
    void barchartproblem(int a[],int n)
    {
        int max=maximum(a);
        for(int i=max;i>0;i--)
        {
            for(int value:a)
            {
                if(i>value)
                {
                    System.out.print("\t");
                }
                else
                {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
    void subarray(int a[], int index)
    {
        for(int start=0;start<a.length;start++)
        {
            for(int end=start;end<a.length;end++)
            {
                for(int k=start;k<=end;k++)
                {
                    System.out.print(a[k]+"\t");
                }
                System.out.println();
            }

        }
    }
    void subsset(int arr[],int n)
    {

    }
    void binarysearch(int a[],int n) {
        int flag = 0;
        int start = 0, end = a.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == n) {
                flag = 1;
                System.out.print("got the position" + mid);

                return;
            } else if (a[mid] < n) {
                start = mid + 1;
                end = a.length;
            } else {
                start = 0;
                end = mid - 1;
            }
        }
        if (flag == 0) {
            System.out.println("not found");
        }
    }
    void recursivebinarysearch(int data,int a[],int start,int end)
    {
        if(start>end)
        {
            System.out.print("not found");
            return;
        }
        int mid=(start+end)/2;
        if(a[mid]==data)
        {
            System.out.println("found"+(mid+1));
            return;
        }
        else if(a[mid]<data)
        {
            recursivebinarysearch(data,a,mid+1,end);
        }
        else
        {
            recursivebinarysearch(data,a,start,mid-1);
        }
    }
    void broken_economy(int a[],int data,int n)
    {
        int start=0,end=n-1;
        int flag=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(a[mid]==data)
            {
                flag=mid;
                break;
            }
            else if(a[mid]<data)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }

        }
        if(flag==0)
        {
            System.out.print(a[start]+" "+a[end]);
            return;
        }
        System.out.println(a[flag]);


    }
    void search(int a[],int data,int n)
    {
        first_last_index(a,n,data);
        last_index(a,n,data);
    }
    void first_last_index(int arr[],int n,int data)
    {
        int start=0,end=n-1;
        int left=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==data)
            {
                if(arr[mid-1]==data)
                {
                    end=mid-1;
                }
                else
                {
                   left=mid+1;
                   break;
                }
            }
            else if(arr[mid]<data)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        System.out.println(left);
    }
    void last_index(int arr[],int n,int data)
    {
        int start=0,end=n-1;
        int left=0;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==data)
            {
                if(arr[mid+1]==data)
                {
                    start=mid+1;
                }
                else
                {
                    left=mid+1;
                    break;
                }
            }
            else if(arr[mid]<data)
            {
                start=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        System.out.println(left);
    }
    void subset(int a[])
    {
        int n=a.length;
        int m=(int)Math.pow(2,n);
        for(int i=0;i<m;i++)
        {
         int arr[]=new int[n];
           decimaltobinary(i,n,arr);
           for(int j=0;j<n;j++)
           {
               if(arr[j]==0)
               {
                   System.out.print("_\t");
               }
               else
               {
                   System.out.print(a[j]+"\t");
               }
           }
            System.out.println();
        }
    }
    void decimaltobinary(int n,int length,int arr[])
    {
        int k=length-1;

        while(n!=0)
        {
         arr[k]=n%2;
         n=n/2;
         k--;
        }
    }
}
