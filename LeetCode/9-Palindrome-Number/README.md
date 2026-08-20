# 9. Palindrome Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public boolean isPalindrome(int x) {
3        /*
4        if(x < 0)
5        {
6            return false;
7        }
8        String str = ""+x;
9        String reversedStr = new StringBuilder(str).reverse().toString();
10        if(str.equals(reversedStr))
11        {
12            return true;
13        }
14        return false;
15        */
16        if (x < 0 || (x % 10 == 0 && x != 0)) {
17            return false;
18        }
19        int revertedNumber = 0;
20        while (x > revertedNumber) {
21            revertedNumber = revertedNumber * 10 + x % 10;
22            x /= 10;
23        }
24        return x == revertedNumber || x == revertedNumber / 10;
25    }
26
27
28
29    }
30-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public boolean ispalindrome(int x) {
3        /*
4        if(x < 0)
5        {
6            return false;
7        }
8        string str = ""+x;
9        string reversedstr = new stringbuilder(str).reverse().tostring();
10        if(str.equals(reversedstr))
11        {
12            return true;
13        }
14        return false;
15        */
16        if (x < 0 || (x % 10 == 0 && x != 0)) {
17            return false;
18        }
19        int revertednumber = 0;
20        while (x > revertednumber) {
21            revertednumber = revertednumber * 10 + x % 10;
22            x /= 10;
23        }
24        return x == revertednumber || x == revertednumber / 10;
25    }
26
27
28
29    }
30
        }
        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }
        return x == revertedNumber || x == revertedNumber / 10;
    }



            return false;
        */
        if (x < 0 || (x % 10 == 0 && x != 0)) {
        return false;
    }


```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public boolean isPalindrome(int x) {
3        /*
4        if(x < 0)
5        {
6            return false;
7        }
8        String str = ""+x;
9        String reversedStr = new StringBuilder(str).reverse().toString();
10        if(str.equals(reversedStr))
11        {
12            return true;
13        }
14        return false;
15        */
16        if (x < 0 || (x % 10 == 0 && x != 0)) {
17            return false;
18        }
19        int revertedNumber = 0;
20        while (x > revertedNumber) {
21            revertedNumber = revertedNumber * 10 + x % 10;
22            x /= 10;
23        }
24        return x == revertedNumber || x == revertedNumber / 10;
25    }
26
27
28
29    }
30`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
