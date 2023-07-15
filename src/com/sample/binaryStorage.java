package com.sample;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Question asked in Junglee games 1st filtering round
/*
 A scientist needs to store DNA information in a database. Each record will be a binary number, and all the binary numbers will have
 the same number of bits set. These numbers can have many digits, but may have relatively few bits set.
 To save space, they are stored using the following compression scheme:
 -->Instead of the storing a list of binary numbers, they are stored as a list of integers matching the indices of the set bits (1 bits)
 -->The bits are O-indexed, starting from the right side (least significant bit).
 -->These indices are given in random order.
 Given a list of numbers represented in this fashion, associate their indices with their values and sort them in descending order by value.
  Return a list of the indices in the order of the sorted array
  Example bitArrays = [[0, 2), (2, 3). [2.1]]
  --> binary 0101 1100 0110
  --> decimal 5 12 6
   Answer --> [1,2,0]
 */
public class binaryStorage {
    public static void main(String args[]){
        List<List<Integer>> ar=new ArrayList<>();

        //test case 1
        ar.add(Arrays.asList(0,2));
        ar.add(Arrays.asList(2,3));
        ar.add(Arrays.asList(2,1));

        /*test case 2
          ar.add(Arrays.asList(0,2));
          ar.add(Arrays.asList(2,3));
          */
        bStorage(ar);
    }
    static void bStorage(List<List<Integer>> bitArrays){
        int length=10;
        int binary[][]=new int[bitArrays.size()][length];
        //filling binary array with 0
        for(int[] i:binary){
            Arrays.fill(i,0);
        }
        //setting 1 at the indexes specified in bitArrays
        for(int i=0;i<bitArrays.size();i++){
            for(int j=0;j<bitArrays.get(i).size();j++){
                binary[i][length-bitArrays.get(i).get(j)-1]=1;
            }
        }
//        System.out.println(Arrays.deepToString(binary));
        int decimal[]=new int[binary.length];
        //computing the decimal equivalent of the binary numbers
        for(int i=0;i< binary.length;i++){
            decimal[i]=findDecimal(binary[i],length);
        }
//        int ans[]=new int[decimal.length];
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<decimal.length;i++)
            ans.add(i);
            //            ans[i]=i;

        //sorting decimal in descending order and ans according to decimal

        for(int i=0;i<decimal.length;i++){
            for(int j=0;j<decimal.length-1;j++){
                if(decimal[j]<decimal[j+1]){
                    int temp=decimal[j];
                    decimal[j]=decimal[j+1];
                    decimal[j+1]=temp;

                    temp=ans.get(j);
                    ans.set(j,ans.get(j+1));
                    ans.set(j+1,temp);
                }
            }
        }
        System.out.println(Arrays.toString(decimal));
        System.out.println("Answer="+ans);
    }
    static int findDecimal(int[] binary,int length){
        int no=0;
        for(int i=length-1;i>=0;i--){
            no+=Math.pow(2,length-1-i)*binary[i];
        }
        return no;
    }
}
