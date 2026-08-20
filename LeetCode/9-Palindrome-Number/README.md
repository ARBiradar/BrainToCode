# 9. Palindrome Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1/*
2class Solution {
3    public boolean isPalindrome(int x) {
4        
5        if(x < 0)
6        {
7            return false;
8        }
9        String str = ""+x;
10        String reversedStr = new StringBuilder(str).reverse().toString();
11        if(str.equals(reversedStr))
12        {
13            return true;
14        }
15        return false;
16       
17        if (x < 0 || (x % 10 == 0 && x != 0)) {
18            return false;
19        }
20        int revertedNumber = 0;
21        while (x > revertedNumber) {
22            revertedNumber = revertedNumber * 10 + x % 10;
23            x /= 10;
24        }
25        return x == revertedNumber || x == revertedNumber / 10;
26    }
27
28
29
30    }
31     */
32
33     class Solution {    public boolean isPalindrome(int x) {                if (x < 0 || (x % 10 == 0 && x != 0)) {            return false;        }        int revertedNumber = 0;        while (x > revertedNumber) {            revertedNumber = revertedNumber * 10 + x % 10;            x /= 10;        }        return x == revertedNumber || x == revertedNumber / 10;    }    }
34-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1/*
2class solution {
3    public boolean ispalindrome(int x) {
4        
5        if(x < 0)
6        {
7            return false;
8        }
9        string str = ""+x;
10        string reversedstr = new stringbuilder(str).reverse().tostring();
11        if(str.equals(reversedstr))
12        {
13            return true;
14        }
15        return false;
16       
17        if (x < 0 || (x % 10 == 0 && x != 0)) {
18            return false;
19        }
20        int revertednumber = 0;
21        while (x > revertednumber) {
22            revertednumber = revertednumber * 10 + x % 10;
23            x /= 10;
24        }
25        return x == revertednumber || x == revertednumber / 10;
26    }
27
28
29
30    }
31     */
32
33     class solution {    public boolean ispalindrome(int x) {                if (x < 0 || (x % 10 == 0 && x != 0)) {            return false;        }        int revertednumber = 0;        while (x > revertednumber) {            revertednumber = revertednumber * 10 + x % 10;            x /= 10;        }        return x == revertednumber || x == revertednumber / 10;    }    }
34
    }



    }
     */

     class Solution {    public boolean isPalindrome(int x) {                if (x < 0 || (x % 
     10 == 0 && x != 0)) {            return false;        }        int revertedNumber = 
     0;        while (x > revertedNumber) {            revertedNumber = revertedNumber * 10 + 
     x % 10;            x /= 10;        }        return x == revertedNumber || x == 
     revertedNumber / 10;    }    }


```

## 🏷️ Tags

`LeetCode` `Coding` `1/*
2class Solution {
3    public boolean isPalindrome(int x) {
4        
5        if(x < 0)
6        {
7            return false;
8        }
9        String str = ""+x;
10        String reversedStr = new StringBuilder(str).reverse().toString();
11        if(str.equals(reversedStr))
12        {
13            return true;
14        }
15        return false;
16       
17        if (x < 0 || (x % 10 == 0 && x != 0)) {
18            return false;
19        }
20        int revertedNumber = 0;
21        while (x > revertedNumber) {
22            revertedNumber = revertedNumber * 10 + x % 10;
23            x /= 10;
24        }
25        return x == revertedNumber || x == revertedNumber / 10;
26    }
27
28
29
30    }
31     */
32
33     class Solution {    public boolean isPalindrome(int x) {                if (x < 0 || (x % 10 == 0 && x != 0)) {            return false;        }        int revertedNumber = 0;        while (x > revertedNumber) {            revertedNumber = revertedNumber * 10 + x % 10;            x /= 10;        }        return x == revertedNumber || x == revertedNumber / 10;    }    }
34`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
