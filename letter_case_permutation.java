package com.backtracking;
import  java.util.*;
public class letter_case_permutation {
    public List<String> solve1(String str)
    {
        ArrayList<String> ans=new ArrayList<>();
        solve(str,"",ans);
        return ans;
    }
    public void solve(String str,String out,ArrayList<String> myans)
    {
        if(str.length()==0)
        {
            myans.add(out);
            return;
        }
        char prev=str.charAt(0);
        solve(str.substring(1),out+prev,myans);
        if(prev>='A'&&prev<='Z')
        {
            char val=(char)(prev-'A'+'a');
            solve(str.substring(1),out+val,myans);
        }
        else if(prev>='a'&&prev<='z')
        {
            char val=(char)(prev-'a'+'A');
            solve(str.substring(1),out+val,myans);
        }
    }


}
