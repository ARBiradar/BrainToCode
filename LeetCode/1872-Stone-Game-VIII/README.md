# 1872. Stone Game VIII

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    // Memoization array to store computed results for dynamic programming
3    private Integer[] memo;
4    // Prefix sum array to store cumulative sums of stones
5    private int[] prefixSum;
6    // Total number of stones
7    private int n;
8
9    public int stoneGameVIII(int[] stones) {
10        // Initialize the number of stones
11        n = stones.length;
12      
13        // Initialize memoization array for dynamic programming
14        memo = new Integer[n];
15      
16        // Convert stones array to prefix sum array
17        // After this, stones[i] represents sum of all stones from index 0 to i
18        for (int i = 1; i < n; i++) {
19            stones[i] += stones[i - 1];
20        }
21      
22        // Store the prefix sum array for use in recursion
23        prefixSum = stones;
24      
25        // Start the game from index 1 (Alice's first move must take at least 2 stones)
26        return dfs(1);
27    }
28
29    /**
30     * Dynamic programming function to find the maximum score difference
31     * @param currentIndex - the current index where a player can make a move
32     * @return the maximum score difference the current player can achieve
33     */
34    private int dfs(int currentIndex) {
35        // Base case: if we're at the last stone or beyond, 
36        // the player must take all remaining stones
37        if (currentIndex >= n - 1) {
38            return prefixSum[currentIndex];
39        }
40      
41        // Check if we've already computed this state
42        if (memo[currentIndex] == null) {
43            // The current player has two choices:
44            // 1. Skip this position and let the game continue from the next index
45            // 2. Take all stones from 0 to currentIndex and give turn to opponent
46          
47            // Choice 1: Skip current position
48            int skipCurrent = dfs(currentIndex + 1);
49          
50            // Choice 2: Take stones up to current index
51            // Score gained is prefixSum[currentIndex] minus opponent's optimal score
52            int takeCurrent = prefixSum[currentIndex] - dfs(currentIndex + 1);
53          
54            // Store the maximum of both choices
55            memo[currentIndex] = Math.max(skipCurrent, takeCurrent);
56        }
57      
58        return memo[currentIndex];
59    }
60}
61-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    // memoization array to store computed results for dynamic programming
3    private integer[] memo;
4    // prefix sum array to store cumulative sums of stones
5    private int[] prefixsum;
6    // total number of stones
7    private int n;
8
9    public int stonegameviii(int[] stones) {
10        // initialize the number of stones
11        n = stones.length;
12      
13        // initialize memoization array for dynamic programming
14        memo = new integer[n];
15      
16        // convert stones array to prefix sum array
17        // after this, stones[i] represents sum of all stones from index 0 to i
18        for (int i = 1; i < n; i++) {
19            stones[i] += stones[i - 1];
20        }
21      
22        // store the prefix sum array for use in recursion
23        prefixsum = stones;
24      
25        // start the game from index 1 (alice's first move must take at least 2 stones)
26        return dfs(1);
27    }
28
29    /**
30     * dynamic programming function to find the maximum score difference
31     * @param currentindex - the current index where a player can make a move
32     * @return the maximum score difference the current player can achieve
33     */
34    private int dfs(int currentindex) {
35        // base case: if we're at the last stone or beyond, 
36        // the player must take all remaining stones
37        if (currentindex >= n - 1) {
38            return prefixsum[currentindex];
39        }
40      
41        // check if we've already computed this state
42        if (memo[currentindex] == null) {
43            // the current player has two choices:
44            // 1. skip this position and let the game continue from the next index
45            // 2. take all stones from 0 to currentindex and give turn to opponent
46          
47            // choice 1: skip current position
48            int skipcurrent = dfs(currentindex + 1);
49          
50            // choice 2: take stones up to current index
51            // score gained is prefixsum[currentindex] minus opponent's optimal score
52            int takecurrent = prefixsum[currentindex] - dfs(currentindex + 1);
53          
54            // store the maximum of both choices
55            memo[currentindex] = math.max(skipcurrent, takecurrent);
56        }
57      
58        return memo[currentindex];
59    }
60}
61
      
        // Check if we've already computed this state
        if (memo[currentIndex] == null) {
            // The current player has two choices:
            // 1. Skip this position and let the game continue from the next index
            // 2. Take all stones from 0 to currentIndex and give turn to opponent
          
            // Choice 1: Skip current position
            int skipCurrent = dfs(currentIndex + 1);
          
            // Choice 2: Take stones up to current index

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    // Memoization array to store computed results for dynamic programming
3    private Integer[] memo;
4    // Prefix sum array to store cumulative sums of stones
5    private int[] prefixSum;
6    // Total number of stones
7    private int n;
8
9    public int stoneGameVIII(int[] stones) {
10        // Initialize the number of stones
11        n = stones.length;
12      
13        // Initialize memoization array for dynamic programming
14        memo = new Integer[n];
15      
16        // Convert stones array to prefix sum array
17        // After this, stones[i] represents sum of all stones from index 0 to i
18        for (int i = 1; i < n; i++) {
19            stones[i] += stones[i - 1];
20        }
21      
22        // Store the prefix sum array for use in recursion
23        prefixSum = stones;
24      
25        // Start the game from index 1 (Alice's first move must take at least 2 stones)
26        return dfs(1);
27    }
28
29    /**
30     * Dynamic programming function to find the maximum score difference
31     * @param currentIndex - the current index where a player can make a move
32     * @return the maximum score difference the current player can achieve
33     */
34    private int dfs(int currentIndex) {
35        // Base case: if we're at the last stone or beyond, 
36        // the player must take all remaining stones
37        if (currentIndex >= n - 1) {
38            return prefixSum[currentIndex];
39        }
40      
41        // Check if we've already computed this state
42        if (memo[currentIndex] == null) {
43            // The current player has two choices:
44            // 1. Skip this position and let the game continue from the next index
45            // 2. Take all stones from 0 to currentIndex and give turn to opponent
46          
47            // Choice 1: Skip current position
48            int skipCurrent = dfs(currentIndex + 1);
49          
50            // Choice 2: Take stones up to current index
51            // Score gained is prefixSum[currentIndex] minus opponent's optimal score
52            int takeCurrent = prefixSum[currentIndex] - dfs(currentIndex + 1);
53          
54            // Store the maximum of both choices
55            memo[currentIndex] = Math.max(skipCurrent, takeCurrent);
56        }
57      
58        return memo[currentIndex];
59    }
60}
61`

## 📅 Solved On

2026-08-24

---
*Auto-pushed by [CodePush Extension](https://github.com)*
