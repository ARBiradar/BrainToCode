# 3702. Longest Subsequence With Non-Zero Bitwise XOR

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-total_xor != 0-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```total_xor != 0
        }

        // Calculate XOR of all elements
        int totalXor = 0;

        for (int num : nums) {
            totalXor ^= num;
        }

        // If total XOR is non-zero, entire array is the longest 
        subsequence
        if (totalXor != 0) {
            return n;
        }

```

## 🏷️ Tags

`LeetCode` `Coding` `total_xor != 0`

## 📅 Solved On

2026-08-15

---
*Auto-pushed by [CodePush Extension](https://github.com)*
