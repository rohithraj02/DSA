package com.Arrays_I;
import java.util.*;
public class nextPermutation {
    public static void nextPermutation(int[] nums) {
        int breakPoint=-1;
        //finding the break poiint i.e the point from right to left at which a[i]<a[i+1]
        for(int i=nums.length-2;i>=0;i--)
        {
            if(nums[i]<nums[i+1]){
                breakPoint=i;break;}
        }
//        if there is no breakpoint, that means it is the largest permutation possible....so just reverse the array
        if(breakPoint==-1){
            reverse(nums,0,nums.length-1);return;}
        int index=-1;
        //find the first element from right to left which is greater than element at breakpoint
        for(int i=nums.length-1;i>breakPoint;i--){
            if(nums[i]>nums[breakPoint])
                index=i;
        }
        //swap the element at breakpoint with the element at the index found above and reverse the array
        int temp=nums[index];
        nums[index]=nums[breakPoint];
        nums[breakPoint]=temp;
        reverse(nums,breakPoint+1,nums.length-1);
    }
    public static void reverse(int[] nums,int start,int end){
        for(int i=start;i<(end-start)/2;i++){
            int temp=nums[i];
            nums[i]=nums[end-i];
            nums[end-i]=temp;
        }
    }
    public static void main(String[] args){
        Scanner sn = new Scanner(System.in);
        System.out.println("enter the size of the array");;
        int n=sn.nextInt();
        int[] nums=new int[n];
        System.out.println("Enter the array elements");;
        for(int i=0;i<nums.length;i++){
            nums[i]=sn.nextInt();
        }
        System.out.println(Arrays.toString(nums));
        System.out.println("the next permutation is ");
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    /* Initial approach.....find all possible permutations using backtracking find the next permutation but complexity is o(n^2*n!)
    class Solution {
    List<String> l=new ArrayList<>();
    public void nextPermutation(int[] nums) {
        String s="";
        int numsSort[]=nums.clone();
        Arrays.sort(numsSort);
        String sorted="";
        for(int i=0;i<nums.length;i++){
        s+=Integer.toString(nums[i]);
        sorted+=Integer.toString(numsSort[i]);}
        findPer(sorted,"");
        Collections.sort(l);
        System.out.println(l);
        String ans="";
        for(int i=0;i<l.size();i++){
            if(l.get(i).equals(s))
            ans=l.get((i+1)%l.size());
        }
        for(int i=0;i<nums.length;i++){
        nums[i]=ans.charAt(i)-'0';}

    }
    public void findPer(String s,String per){
        if(s.length()==0){
            l.add(per);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String newS=s.substring(0,i)+s.substring(i+1);
            findPer(newS,per+c);
        }
    }
}
     */
}
