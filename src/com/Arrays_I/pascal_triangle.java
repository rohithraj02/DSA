package com.Arrays_I;
import java.util.*;
public class pascal_triangle {
    public static int nCR(int n,int r){
        double ans=1;
        for(int i=1;i<=r;i++)
            ans*=(double)(n--)/(double)i;
        return (int)ans;
    }
    public static List<Integer> generateRow(int row){
        List<Integer> l=new ArrayList<>();
        for(int i=1;i<=row;i++)
            l.add(nCR(row-1,i-1));
        return l;
    }
    public static void main(String[] args){
        Scanner sn =new Scanner(System.in);
        System.out.println("Enter the nunmber of rows");
        int n=sn.nextInt();
        List<List<Integer>> l=new ArrayList<List<Integer>>();
        for(int i=1;i<=n;i++){
            l.add(generateRow(i));
        }
        System.out.println(l);
    }
    /* Method 2
    public List<List<Integer>> generate(int numRows) {
        //List <List<Integer>> l = new ArrayList<List<Integer>>();
        List<List<Integer> > l = new ArrayList<List<Integer> >();
        List<Integer> row, pre = null;
        for(int i=0;i<numRows;i++){
            row = new ArrayList<Integer>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                row.add(1);
                else
                row.add(pre.get(j-1)+pre.get(j));
            }
            pre=row;
            l.add(row);
        }
        return l;
    }*/

}
