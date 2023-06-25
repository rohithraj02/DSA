package com.Arrays_III;

public class pow {
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        else
            return x*myPow(x,n-1);
    }

    public static void main(String[] args) {
        pow obj=new pow();
        System.out.println(obj.myPow(2.1000,5));
    }
}
