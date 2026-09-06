# 115. Distinct Subsequences

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    /**
3     * Count the number of distinct subsequences of s that equal t.
4     * Uses dynamic programming to build up the solution.
5     * 
6     * @param s The source string to find subsequences in
7     * @param t The target string to match
8     * @return The number of distinct subsequences of s that equal t
9     */
10    public int numDistinct(String s, String t) {
11        int sourceLength = s.length();
12        int targetLength = t.length();
13      
14        // dp[i][j] represents the number of distinct subsequences 
15        // of s[0...i-1] that equal t[0...j-1]
16        int[][] dp = new int[sourceLength + 1][targetLength + 1];
17      
18        // Initialize base case: empty target string can be formed 
19        // in exactly one way from any source string (by selecting nothing)
20        for (int i = 0; i <= sourceLength; i++) {
21            dp[i][0] = 1;
22        }
23      
24        // Fill the dp table
25        for (int i = 1; i <= sourceLength; i++) {
26            for (int j = 1; j <= targetLength; j++) {
27                // Case 1: Don't use the current character from source string
28                // The count remains the same as without this character
29                dp[i][j] = dp[i - 1][j];
30              
31                // Case 2: If characters match, we can also use the current character
32                // Add the count of subsequences formed by matching both characters
33                if (s.charAt(i - 1) == t.charAt(j - 1)) {
34                    dp[i][j] += dp[i - 1][j - 1];
35                }
36            }
37        }
38      
39        // Return the final result: number of subsequences of entire s that equal entire t
40        return dp[sourceLength][targetLength];
41    }
42}
43-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    /**
3     * count the number of distinct subsequences of s that equal t.
4     * uses dynamic programming to build up the solution.
5     * 
6     * @param s the source string to find subsequences in
7     * @param t the target string to match
8     * @return the number of distinct subsequences of s that equal t
9     */
10    public int numdistinct(string s, string t) {
11        int sourcelength = s.length();
12        int targetlength = t.length();
13      
14        // dp[i][j] represents the number of distinct subsequences 
15        // of s[0...i-1] that equal t[0...j-1]
16        int[][] dp = new int[sourcelength + 1][targetlength + 1];
17      
18        // initialize base case: empty target string can be formed 
19        // in exactly one way from any source string (by selecting nothing)
20        for (int i = 0; i <= sourcelength; i++) {
21            dp[i][0] = 1;
22        }
23      
24        // fill the dp table
25        for (int i = 1; i <= sourcelength; i++) {
26            for (int j = 1; j <= targetlength; j++) {
27                // case 1: don't use the current character from source string
28                // the count remains the same as without this character
29                dp[i][j] = dp[i - 1][j];
30              
31                // case 2: if characters match, we can also use the current character
32                // add the count of subsequences formed by matching both characters
33                if (s.charat(i - 1) == t.charat(j - 1)) {
34                    dp[i][j] += dp[i - 1][j - 1];
35                }
36            }
37        }
38      
39        // return the final result: number of subsequences of entire s that equal entire t
40        return dp[sourcelength][targetlength];
41    }
42}
43
                characters
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] += dp[i - 1][j - 1];
                }
            }
        }
      
        // Return the final result: number of subsequences of entire s 
        that equal entire t
        return dp[sourceLength][targetLength];
    }
}


```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    /**
3     * Count the number of distinct subsequences of s that equal t.
4     * Uses dynamic programming to build up the solution.
5     * 
6     * @param s The source string to find subsequences in
7     * @param t The target string to match
8     * @return The number of distinct subsequences of s that equal t
9     */
10    public int numDistinct(String s, String t) {
11        int sourceLength = s.length();
12        int targetLength = t.length();
13      
14        // dp[i][j] represents the number of distinct subsequences 
15        // of s[0...i-1] that equal t[0...j-1]
16        int[][] dp = new int[sourceLength + 1][targetLength + 1];
17      
18        // Initialize base case: empty target string can be formed 
19        // in exactly one way from any source string (by selecting nothing)
20        for (int i = 0; i <= sourceLength; i++) {
21            dp[i][0] = 1;
22        }
23      
24        // Fill the dp table
25        for (int i = 1; i <= sourceLength; i++) {
26            for (int j = 1; j <= targetLength; j++) {
27                // Case 1: Don't use the current character from source string
28                // The count remains the same as without this character
29                dp[i][j] = dp[i - 1][j];
30              
31                // Case 2: If characters match, we can also use the current character
32                // Add the count of subsequences formed by matching both characters
33                if (s.charAt(i - 1) == t.charAt(j - 1)) {
34                    dp[i][j] += dp[i - 1][j - 1];
35                }
36            }
37        }
38      
39        // Return the final result: number of subsequences of entire s that equal entire t
40        return dp[sourceLength][targetLength];
41    }
42}
43`

## 📅 Solved On

2026-09-06

---
*Auto-pushed by [CodePush Extension](https://github.com)*
