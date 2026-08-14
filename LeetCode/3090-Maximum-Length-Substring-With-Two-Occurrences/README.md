# 3090. Maximum Length Substring With Two Occurrences

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-"bcbbbcba"
"aaaa"
"ab"
"aa"
"abcabc"
"aabbcc"
"abababab"
"zzzzzzzzzz"
"abcdefghij"
"aabbccddeeffaabbccddee"
"xxyyxxyyxx"
"qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```"bcbbbcba"
"aaaa"
"ab"
"aa"
"abcabc"
"aabbcc"
"abababab"
"zzzzzzzzzz"
"abcdefghij"
"aabbccddeeffaabbccddee"
"xxyyxxyyxx"
"qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"
            // Get the index of current character (0-25 
            for a-z)
            int currentCharIndex = s.charAt(right) - 'a';
          
            // Increment frequency of current character
            charFrequency[currentCharIndex]++;
          
            // If any character appears more than 2 
            times, shrink window from left
            while (charFrequency[currentCharIndex] > 2) {
                int leftCharIndex = s.charAt(left) - 'a';
                charFrequency[leftCharIndex]--;
                left++;

```

## 🏷️ Tags

`LeetCode` `Coding` `"bcbbbcba"
"aaaa"
"ab"
"aa"
"abcabc"
"aabbcc"
"abababab"
"zzzzzzzzzz"
"abcdefghij"
"aabbccddeeffaabbccddee"
"xxyyxxyyxx"
"qwertyuiopasdfghjklzxcvbnmqwertyuiopasdfghjklzxcvbnm"`

## 📅 Solved On

2026-08-14

---
*Auto-pushed by [CodePush Extension](https://github.com)*
