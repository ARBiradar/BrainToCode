# 2965. Find Missing and Repeated Values

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        var n = grid.length * grid.length;
        int currSum = 0, dup = 0;
        var uniq = new HashSet<Integer>();

        for(var row : grid)
            for(var num : row)
                if(!uniq.add(num))
                    dup = num;
                else
                    currSum += num;
        
        var expectedSum = (n * (n + 1)) / 2;
        var missing = expectedSum - currSum;
        return new int[]{dup, missing};
    }
}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```class solution {
    public int[] findmissingandrepeatedvalues(int[][] grid) {
        var n = grid.length * grid.length;
        int currsum = 0, dup = 0;
        var uniq = new hashset<integer>();

        for(var row : grid)
            for(var num : row)
                if(!uniq.add(num))
                    dup = num;
                else
                    currsum += num;
        
        var expectedsum = (n * (n + 1)) / 2;
        var missing = expectedsum - currsum;
        return new int[]{dup, missing};
    }
}
                actualSum += val;
                int val = grid[i][j];
            for (int j = 0; j < n; j++) {
        for (int i = 0; i < n; i++) {
        // Calculate actual sum and square sum
        long actualSqSum = 0;

        long actualSum = 0;

        int size = n * n;
        int n = grid.length;
    public int[] findMissingAndRepeatedValues(int[][] grid) {
class Solution {

```

## 🏷️ Tags

`LeetCode` `Coding` `class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        var n = grid.length * grid.length;
        int currSum = 0, dup = 0;
        var uniq = new HashSet<Integer>();

        for(var row : grid)
            for(var num : row)
                if(!uniq.add(num))
                    dup = num;
                else
                    currSum += num;
        
        var expectedSum = (n * (n + 1)) / 2;
        var missing = expectedSum - currSum;
        return new int[]{dup, missing};
    }
}`

## 📅 Solved On

2026-08-17

---
*Auto-pushed by [CodePush Extension](https://github.com)*
