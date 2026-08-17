# 1563. Stone Game V

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    private int n;                    // Total number of stones
3    private int[] prefixSum;          // Prefix sum array for quick range sum calculation
4    private int[] stoneValues;        // Original stone values array
5    private Integer[][] memo;          // Memoization table for dynamic programming
6  
7    public int stoneGameV(int[] stoneValue) {
8        // Initialize variables
9        n = stoneValue.length;
10        prefixSum = new int[n + 1];
11        stoneValues = stoneValue;
12        memo = new Integer[n][n];
13      
14        // Build prefix sum array for O(1) range sum queries
15        // prefixSum[i] represents sum of elements from index 0 to i-1
16        for (int i = 1; i <= n; i++) {
17            prefixSum[i] = prefixSum[i - 1] + stoneValues[i - 1];
18        }
19      
20        // Start the recursive solution with memoization
21        return dfs(0, n - 1);
22    }
23  
24    private int dfs(int left, int right) {
25        // Base case: if range is invalid or contains only one element
26        if (left >= right) {
27            return 0;
28        }
29      
30        // Check if result is already computed
31        if (memo[left][right] != null) {
32            return memo[left][right];
33        }
34      
35        int maxScore = 0;
36        int leftSum = 0;  // Sum of left partition
37        int rightSum = prefixSum[right + 1] - prefixSum[left];  // Sum of right partition
38      
39        // Try all possible split points
40        for (int splitPoint = left; splitPoint < right; splitPoint++) {
41            // Update partition sums
42            leftSum += stoneValues[splitPoint];
43            rightSum -= stoneValues[splitPoint];
44          
45            if (leftSum < rightSum) {
46                // Left partition has smaller sum, Alice chooses left
47                // Pruning: if current answer is already greater than maximum possible score
48                if (maxScore > leftSum * 2) {
49                    continue;
50                }
51                maxScore = Math.max(maxScore, leftSum + dfs(left, splitPoint));
52            } else if (leftSum > rightSum) {
53                // Right partition has smaller sum, Alice chooses right
54                // Pruning: if current answer is already greater than maximum possible score
55                if (maxScore > rightSum * 2) {
56                    break;
57                }
58                maxScore = Math.max(maxScore, rightSum + dfs(splitPoint + 1, right));
59            } else {
60                // Both partitions have equal sum, Alice can choose either
61                maxScore = Math.max(maxScore, 
62                    Math.max(leftSum + dfs(left, splitPoint), 
63                            rightSum + dfs(splitPoint + 1, right)));
64            }
65        }
66      
67        // Store result in memo table and return
68        memo[left][right] = maxScore;
69        return maxScore;
70    }
71}
72-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    private int n;                    // total number of stones
3    private int[] prefixsum;          // prefix sum array for quick range sum calculation
4    private int[] stonevalues;        // original stone values array
5    private integer[][] memo;          // memoization table for dynamic programming
6  
7    public int stonegamev(int[] stonevalue) {
8        // initialize variables
9        n = stonevalue.length;
10        prefixsum = new int[n + 1];
11        stonevalues = stonevalue;
12        memo = new integer[n][n];
13      
14        // build prefix sum array for o(1) range sum queries
15        // prefixsum[i] represents sum of elements from index 0 to i-1
16        for (int i = 1; i <= n; i++) {
17            prefixsum[i] = prefixsum[i - 1] + stonevalues[i - 1];
18        }
19      
20        // start the recursive solution with memoization
21        return dfs(0, n - 1);
22    }
23  
24    private int dfs(int left, int right) {
25        // base case: if range is invalid or contains only one element
26        if (left >= right) {
27            return 0;
28        }
29      
30        // check if result is already computed
31        if (memo[left][right] != null) {
32            return memo[left][right];
33        }
34      
35        int maxscore = 0;
36        int leftsum = 0;  // sum of left partition
37        int rightsum = prefixsum[right + 1] - prefixsum[left];  // sum of right partition
38      
39        // try all possible split points
40        for (int splitpoint = left; splitpoint < right; splitpoint++) {
41            // update partition sums
42            leftsum += stonevalues[splitpoint];
43            rightsum -= stonevalues[splitpoint];
44          
45            if (leftsum < rightsum) {
46                // left partition has smaller sum, alice chooses left
47                // pruning: if current answer is already greater than maximum possible score
48                if (maxscore > leftsum * 2) {
49                    continue;
50                }
51                maxscore = math.max(maxscore, leftsum + dfs(left, splitpoint));
52            } else if (leftsum > rightsum) {
53                // right partition has smaller sum, alice chooses right
54                // pruning: if current answer is already greater than maximum possible score
55                if (maxscore > rightsum * 2) {
56                    break;
57                }
58                maxscore = math.max(maxscore, rightsum + dfs(splitpoint + 1, right));
59            } else {
60                // both partitions have equal sum, alice can choose either
61                maxscore = math.max(maxscore, 
62                    math.max(leftsum + dfs(left, splitpoint), 
63                            rightsum + dfs(splitpoint + 1, right)));
64            }
65        }
66      
67        // store result in memo table and return
68        memo[left][right] = maxscore;
69        return maxscore;
70    }
71}
72
                either
                maxScore = Math.max(maxScore, 
                    Math.max(leftSum + dfs(left, splitPoint), 
                            rightSum + dfs(splitPoint + 1, right)));
            }
        }
      
        // Store result in memo table and return
        memo[left][right] = maxScore;
        return maxScore;
    }
}


```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    private int n;                    // Total number of stones
3    private int[] prefixSum;          // Prefix sum array for quick range sum calculation
4    private int[] stoneValues;        // Original stone values array
5    private Integer[][] memo;          // Memoization table for dynamic programming
6  
7    public int stoneGameV(int[] stoneValue) {
8        // Initialize variables
9        n = stoneValue.length;
10        prefixSum = new int[n + 1];
11        stoneValues = stoneValue;
12        memo = new Integer[n][n];
13      
14        // Build prefix sum array for O(1) range sum queries
15        // prefixSum[i] represents sum of elements from index 0 to i-1
16        for (int i = 1; i <= n; i++) {
17            prefixSum[i] = prefixSum[i - 1] + stoneValues[i - 1];
18        }
19      
20        // Start the recursive solution with memoization
21        return dfs(0, n - 1);
22    }
23  
24    private int dfs(int left, int right) {
25        // Base case: if range is invalid or contains only one element
26        if (left >= right) {
27            return 0;
28        }
29      
30        // Check if result is already computed
31        if (memo[left][right] != null) {
32            return memo[left][right];
33        }
34      
35        int maxScore = 0;
36        int leftSum = 0;  // Sum of left partition
37        int rightSum = prefixSum[right + 1] - prefixSum[left];  // Sum of right partition
38      
39        // Try all possible split points
40        for (int splitPoint = left; splitPoint < right; splitPoint++) {
41            // Update partition sums
42            leftSum += stoneValues[splitPoint];
43            rightSum -= stoneValues[splitPoint];
44          
45            if (leftSum < rightSum) {
46                // Left partition has smaller sum, Alice chooses left
47                // Pruning: if current answer is already greater than maximum possible score
48                if (maxScore > leftSum * 2) {
49                    continue;
50                }
51                maxScore = Math.max(maxScore, leftSum + dfs(left, splitPoint));
52            } else if (leftSum > rightSum) {
53                // Right partition has smaller sum, Alice chooses right
54                // Pruning: if current answer is already greater than maximum possible score
55                if (maxScore > rightSum * 2) {
56                    break;
57                }
58                maxScore = Math.max(maxScore, rightSum + dfs(splitPoint + 1, right));
59            } else {
60                // Both partitions have equal sum, Alice can choose either
61                maxScore = Math.max(maxScore, 
62                    Math.max(leftSum + dfs(left, splitPoint), 
63                            rightSum + dfs(splitPoint + 1, right)));
64            }
65        }
66      
67        // Store result in memo table and return
68        memo[left][right] = maxScore;
69        return maxScore;
70    }
71}
72`

## 📅 Solved On

2026-08-17

---
*Auto-pushed by [CodePush Extension](https://github.com)*
