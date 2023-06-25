package com.Arrays_III;

import java.util.HashMap;
import java.util.Map;
//This problem uses top down dp approach
public class uniquePaths {
    public static int uPaths(int m, int n) {
        // Create a memoization map to store the computed results
        Map<String, Integer> memo = new HashMap<>();

        return uniquePathsRecursive(m, n, 0, 0, memo);
    }

    private static int uniquePathsRecursive(int m, int n, int row, int col, Map<String, Integer> memo) {
        // Check if the result is already memoized
        String key = row + "," + col;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }

        // Base case: when we reach the bottom-right cell, return 1
        if (row == m - 1 && col == n - 1) {
            return 1;
        }

        // Recursive case: calculate the number of paths by summing the paths from right and down
        int pathsRight = 0;
        int pathsDown = 0;

        if (col < n - 1) {
            pathsRight = uniquePathsRecursive(m, n, row, col + 1, memo);
        }

        if (row < m - 1) {
            pathsDown = uniquePathsRecursive(m, n, row + 1, col, memo);
        }

        // Store the result in the memoization map
        int totalPaths = pathsRight + pathsDown;
        memo.put(key, totalPaths);

        return totalPaths;
    }

    public static void main(String[] args) {
        int gridM = 3;  // Number of rows
        int gridN = 3;  // Number of columns
        int totalPaths = uPaths(gridM, gridN);
        System.out.println("Total unique paths: " + totalPaths);
    }
}