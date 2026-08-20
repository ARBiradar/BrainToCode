# 9. Palindrome Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x < 0)
4        {
5            return false;
6        }
7        String str = ""+x;
8        String reversedStr = new StringBuilder(str).reverse().toString();
9        if(str.equals(reversedStr))
10        {
11            return true;
12        }
13        return false;
14
15
16    }
17}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public boolean ispalindrome(int x) {
3        if(x < 0)
4        {
5            return false;
6        }
7        string str = ""+x;
8        string reversedstr = new stringbuilder(str).reverse().tostring();
9        if(str.equals(reversedstr))
10        {
11            return true;
12        }
13        return false;
14
15
16    }
17}
            return false;
        }
        String str = ""+x;


        String reversedStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reversedStr))
        {
            return true;
        }
    }
        return false;
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x < 0)
4        {
5            return false;
6        }
7        String str = ""+x;
8        String reversedStr = new StringBuilder(str).reverse().toString();
9        if(str.equals(reversedStr))
10        {
11            return true;
12        }
13        return false;
14
15
16    }
17}`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
