package com.Arrays_II;

import java.util.Arrays;

public class Repeating_Missing {
        // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
        static public int[] repeatedNumber(final int[] A) {
            int n=A.length;
            int hash[]=new int[n+1];

            for(int i=0;i<n;i++){
                hash[A[i]]++;
            }
            int missing=-1,repeating=-1;
            for(int i=1;i<=n;i++){
                if(hash[i]==0)
                    missing=i;
                if(hash[i]==2)
                    repeating=i;
                if (repeating != -1 && missing != -1)
                    break;
            }
            return new int[]{repeating,missing};
        }

    public static void main(String[] args) {
        int ar[]={5,2,3,4,1,1,};
        System.out.println(Arrays.toString(repeatedNumber(ar)));

    }

}
