# 940. Distinct Subsequences II

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    // Modulo value for preventing integer overflow
3    private static final int MOD = (int) 1e9 + 7;
4
5    /**
6     * Counts the number of distinct non-empty subsequences in string s.
7     * Uses dynamic programming where dp[i] represents the count of distinct
8     * subsequences ending with character ('a' + i).
9     * 
10     * @param s the input string
11     * @return the number of distinct subsequences modulo 10^9 + 7
12     */
13    public int distinctSubseqII(String s) {
14        // dp[i] stores count of distinct subsequences ending with character ('a' + i)
15        int[] dp = new int[26];
16      
17        // Process each character in the string
18        for (int i = 0; i < s.length(); ++i) {
19            // Get the character index (0-25 for 'a'-'z')
20            int charIndex = s.charAt(i) - 'a';
21          
22            // Update count for subsequences ending with current character
23            // New count = sum of all previous subsequences + 1 (for single character)
24            dp[charIndex] = sum(dp) + 1;
25        }
26      
27        // Return total count of all distinct subsequences
28        return sum(dp);
29    }
30
31    /**
32     * Calculates the sum of all elements in the array with modulo operation.
33     * 
34     * @param arr the input array
35     * @return the sum of all elements modulo 10^9 + 7
36     */
37    private int sum(int[] arr) {
38        int total = 0;
39      
40        // Add each element to the total with modulo to prevent overflow
41        for (int value : arr) {
42            total = (total + value) % MOD;
43        }
44      
45        return total;
46    }
47}
48-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    // modulo value for preventing integer overflow
3    private static final int mod = (int) 1e9 + 7;
4
5    /**
6     * counts the number of distinct non-empty subsequences in string s.
7     * uses dynamic programming where dp[i] represents the count of distinct
8     * subsequences ending with character ('a' + i).
9     * 
10     * @param s the input string
11     * @return the number of distinct subsequences modulo 10^9 + 7
12     */
13    public int distinctsubseqii(string s) {
14        // dp[i] stores count of distinct subsequences ending with character ('a' + i)
15        int[] dp = new int[26];
16      
17        // process each character in the string
18        for (int i = 0; i < s.length(); ++i) {
19            // get the character index (0-25 for 'a'-'z')
20            int charindex = s.charat(i) - 'a';
21          
22            // update count for subsequences ending with current character
23            // new count = sum of all previous subsequences + 1 (for single character)
24            dp[charindex] = sum(dp) + 1;
25        }
26      
27        // return total count of all distinct subsequences
28        return sum(dp);
29    }
30
31    /**
32     * calculates the sum of all elements in the array with modulo operation.
33     * 
34     * @param arr the input array
35     * @return the sum of all elements modulo 10^9 + 7
36     */
37    private int sum(int[] arr) {
38        int total = 0;
39      
40        // add each element to the total with modulo to prevent overflow
41        for (int value : arr) {
42            total = (total + value) % mod;
43        }
44      
45        return total;
46    }
47}
48
class Solution {
    // Modulo value for preventing integer overflow
    private static final int MOD = (int) 1e9 + 7;

    /**
     * Counts the number of distinct non-empty subsequences in string s.
     * Uses dynamic programming where dp[i] represents the count of 
     distinct
     * subsequences ending with character ('a' + i).
     * 
     * @param s the input string
     * @return the number of distinct subsequences modulo 10^9 + 7
     */
    public int distinctSubseqII(String s) {

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    // Modulo value for preventing integer overflow
3    private static final int MOD = (int) 1e9 + 7;
4
5    /**
6     * Counts the number of distinct non-empty subsequences in string s.
7     * Uses dynamic programming where dp[i] represents the count of distinct
8     * subsequences ending with character ('a' + i).
9     * 
10     * @param s the input string
11     * @return the number of distinct subsequences modulo 10^9 + 7
12     */
13    public int distinctSubseqII(String s) {
14        // dp[i] stores count of distinct subsequences ending with character ('a' + i)
15        int[] dp = new int[26];
16      
17        // Process each character in the string
18        for (int i = 0; i < s.length(); ++i) {
19            // Get the character index (0-25 for 'a'-'z')
20            int charIndex = s.charAt(i) - 'a';
21          
22            // Update count for subsequences ending with current character
23            // New count = sum of all previous subsequences + 1 (for single character)
24            dp[charIndex] = sum(dp) + 1;
25        }
26      
27        // Return total count of all distinct subsequences
28        return sum(dp);
29    }
30
31    /**
32     * Calculates the sum of all elements in the array with modulo operation.
33     * 
34     * @param arr the input array
35     * @return the sum of all elements modulo 10^9 + 7
36     */
37    private int sum(int[] arr) {
38        int total = 0;
39      
40        // Add each element to the total with modulo to prevent overflow
41        for (int value : arr) {
42            total = (total + value) % MOD;
43        }
44      
45        return total;
46    }
47}
48`

## 📅 Solved On

2026-09-07

---
*Auto-pushed by [CodePush Extension](https://github.com)*
