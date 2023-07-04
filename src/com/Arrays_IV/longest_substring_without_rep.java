package com.Arrays_IV;

import java.util.LinkedList;
import java.util.Queue;

public class longest_substring_without_rep {
    public static int lengthOfLongestSubstring(String s) {
        int count=1;
        Queue<Character> q= new LinkedList<>();
        if(s.length()==0)
            return 0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            while(q.contains(c)){
                q.poll();
            }
            q.add(c);

//            System.out.println(q);
            count=Math.max(q.size(),count);
        }
        return count;
    }

    public static void main(String[] args) {
        String x="abcabcbb";
        System.out.println(lengthOfLongestSubstring(x));
    }
}
