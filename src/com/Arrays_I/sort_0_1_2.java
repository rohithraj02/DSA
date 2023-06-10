package com.Arrays_I;

import java.util.Arrays;

public class sort_0_1_2 {
    public static void sort012(int[] arr)
    {
        //Write your code here
        int start=0,end=arr.length-1,mid=0;
        while(mid<=end){
            if(arr[mid]==0){
                swap(arr,mid,start);
                start++;mid++;
            }
            else if(arr[mid]==1){
                // swap(arr,mid)
                mid++;
            }
            else if(arr[mid]==2){
                swap(arr,mid,end);
                end--;
            }
        }
    }
    public static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int ar[]={2,1,2,2,0,0,1,2,1,2};
        sort012(ar);
        System.out.println(Arrays.toString(ar));
    }
}
