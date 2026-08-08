# 3302. Find the Lexicographically Smallest Valid Sequence

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2  public int[] validSequence(String word1, String word2) {
3    int[] ans = new int[word2.length()];
4    // last[j] := the index i of the last occurrence in word1, where
5    // word1[i] == word2[j]
6    int[] last = new int[word2.length()];
7    Arrays.fill(last, -1);
8
9    int i = word1.length() - 1;
10    int j = word2.length() - 1;
11    while (i >= 0 && j >= 0) {
12      if (word1.charAt(i) == word2.charAt(j))
13        last[j--] = i;
14      --i;
15    }
16
17    boolean canSkip = true;
18    j = 0;
19    for (i = 0; i < word1.length(); ++i) {
20      if (j == word2.length())
21        break;
22      if (word1.charAt(i) == word2.charAt(j)) {
23        ans[j++] = i;
24      } else if (canSkip && (j == word2.length() - 1 || i < last[j + 1])) {
25        canSkip = false;
26        ans[j++] = i;
27      }
28    }
29
30    return j == word2.length() ? ans : new int[0];
31  }
32}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2  public int[] validsequence(string word1, string word2) {
3    int[] ans = new int[word2.length()];
4    // last[j] := the index i of the last occurrence in word1, where
5    // word1[i] == word2[j]
6    int[] last = new int[word2.length()];
7    arrays.fill(last, -1);
8
9    int i = word1.length() - 1;
10    int j = word2.length() - 1;
11    while (i >= 0 && j >= 0) {
12      if (word1.charat(i) == word2.charat(j))
13        last[j--] = i;
14      --i;
15    }
16
17    boolean canskip = true;
18    j = 0;
19    for (i = 0; i < word1.length(); ++i) {
20      if (j == word2.length())
21        break;
22      if (word1.charat(i) == word2.charat(j)) {
23        ans[j++] = i;
24      } else if (canskip && (j == word2.length() - 1 || i < last[j + 1])) {
25        canskip = false;
26        ans[j++] = i;
27      }
28    }
29
30    return j == word2.length() ? ans : new int[0];
31  }
32}
    }

    boolean canSkip = true;
    j = 0;
    for (i = 0; i < word1.length(); ++i) {
      if (j == word2.length())
        break;
      if (word1.charAt(i) == word2.charAt(j)) {
        ans[j++] = i;
      } else if (canSkip && (j == word2.length() - 1 || i < last[j + 
      1])) {
        canSkip = false;
        ans[j++] = i;
      }
    }

    return j == word2.length() ? ans : new int[0];
  }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2  public int[] validSequence(String word1, String word2) {
3    int[] ans = new int[word2.length()];
4    // last[j] := the index i of the last occurrence in word1, where
5    // word1[i] == word2[j]
6    int[] last = new int[word2.length()];
7    Arrays.fill(last, -1);
8
9    int i = word1.length() - 1;
10    int j = word2.length() - 1;
11    while (i >= 0 && j >= 0) {
12      if (word1.charAt(i) == word2.charAt(j))
13        last[j--] = i;
14      --i;
15    }
16
17    boolean canSkip = true;
18    j = 0;
19    for (i = 0; i < word1.length(); ++i) {
20      if (j == word2.length())
21        break;
22      if (word1.charAt(i) == word2.charAt(j)) {
23        ans[j++] = i;
24      } else if (canSkip && (j == word2.length() - 1 || i < last[j + 1])) {
25        canSkip = false;
26        ans[j++] = i;
27      }
28    }
29
30    return j == word2.length() ? ans : new int[0];
31  }
32}`

## 📅 Solved On

2026-08-08

---
*Auto-pushed by [CodePush Extension](https://github.com)*
