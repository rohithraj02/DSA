package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class revStr {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        String s=sn.next();
        char c[]=s.toCharArray();
        ArrayList<Character> ar=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(c[i]))
                ar.add(c[i]);
        }
        Collections.reverse(ar);
//        System.out.println(ar);
        String ans="";int j=0;
        for(int i=0;i<c.length;i++){
            if(Character.isLetter(c[i]))
            {
                ans+=ar.get(j++);

            }
            else
                ans+=c[i];
        }
        System.out.println(ans);
    }
}
