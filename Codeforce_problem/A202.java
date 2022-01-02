package com.company.cp;

import java.util.ArrayList;
import java.util.Collections;

public class A202 {
      public void solve(String str)
      {
          ArrayList<String> ans=new ArrayList<>();
          subsequence(str,"",ans);
          Collections.sort(ans);
          String myans=ans.get(ans.size()-1);
          System.out.print(myans);
      }
     void subsequence(String str,String out,ArrayList<String> myans)
    {
        if(str.length()==0)
        {
            if(palindrome(out))
            {
                myans.add(out);
            }
            return;
        }
        char prev=str.charAt(0);
        subsequence(str.substring(1),out+prev,myans);
        subsequence(str.substring(1),out,myans);
    }
    boolean palindrome(String str)
    {
        int start=0;
        int end=str.length()-1;
        while(start<=end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
            start++;
            end--;

        }
        return true;
    }
}
