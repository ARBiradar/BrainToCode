import java.util.Arrays;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalElements = n * n;
        
        // Frequency array to store counts of numbers from 1 to n^2
        int[] counts = new int[totalElements + 1];
        
        // Step 1: Count frequencies of each number in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                counts[grid[i][j]]++;
            }
        }
        
        int repeated = -1;
        int missing = -1;
        
        // Step 2: Find which number appeared twice and which appeared zero times
        for (int i = 1; i <= totalElements; i++) {
            if (counts[i] == 2) {
                repeated = i;
            } else if (counts[i] == 0) {
                missing = i;
            }
        }
        
        return new int[]{repeated, missing};
    }
}
