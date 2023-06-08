package com.Arrays_I;
import java.util.*;
//Given an m x n integer matrix, if an element is 0, set its entire row and column to 0's.
public class Set_matrix_zeroes {

        public static void setZeroes(int[][] matrix) {
            int rows[]=new int[matrix.length];
            int cols[]=new int[matrix[0].length];
            Arrays.fill(rows,-1);
            Arrays.fill(cols,-1);
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(matrix[i][j]==0){
                        rows[i]=0;cols[j]=0;}
                }
            }
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    if(rows[i]==0 || cols[j]==0)
                        matrix[i][j]=0;
                }
            }
            System.out.println(Arrays.deepToString(matrix));
        }

        public static void main(String args[]){
            Scanner sn = new Scanner(System.in);
            System.out.println("Enter the dimensions");
            int m=sn.nextInt();
            int n=sn.nextInt();
            System.out.println(m+" "+n);
            System.out.println("Enter the matrix elements");
            int ar[][]=new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    ar[i][j]=sn.nextInt();
                }
            }
//    sample ip  [[0,1,2,0],[3,4,5,2],[1,3,1,5]]  o/p [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
            setZeroes(ar);
        }
    }

