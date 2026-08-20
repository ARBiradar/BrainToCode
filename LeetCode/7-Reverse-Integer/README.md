# 7. Reverse Integer

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int reverse(int x) {
3        int revDigit = 0;
4        int temp = x;
5        if(x < 0)
6        {
7            x *= -1; 
8        }
9        while(x != 0)
10        {
11            int digit = x % 10;
12              if (revDigit > Integer.MAX_VALUE / 10 || 
13                (revDigit == Integer.MAX_VALUE / 10 && digit > 7)) {
14                return 0;
15            }
16            if (revDigit < Integer.MIN_VALUE / 10 || 
17                (revDigit == Integer.MIN_VALUE / 10 && digit < -8)) {
18                return 0;
19            }
20            
21            revDigit = (revDigit * 10) + digit;
22            x=x/10;
23
24        }
25        if(temp <= 0){
26            return revDigit*-1;
27        }
28        return revDigit;
29    }
30}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int reverse(int x) {
3        int revdigit = 0;
4        int temp = x;
5        if(x < 0)
6        {
7            x *= -1; 
8        }
9        while(x != 0)
10        {
11            int digit = x % 10;
12              if (revdigit > integer.max_value / 10 || 
13                (revdigit == integer.max_value / 10 && digit > 7)) {
14                return 0;
15            }
16            if (revdigit < integer.min_value / 10 || 
17                (revdigit == integer.min_value / 10 && digit < -8)) {
18                return 0;
19            }
20            
21            revdigit = (revdigit * 10) + digit;
22            x=x/10;
23
24        }
25        if(temp <= 0){
26            return revdigit*-1;
27        }
28        return revdigit;
29    }
30}
              if (revDigit > Integer.MAX_VALUE / 10 || 
                (revDigit == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }
            int digit = x % 10;
        {
            if (revDigit < Integer.MIN_VALUE / 10 || 
                (revDigit == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int reverse(int x) {
3        int revDigit = 0;
4        int temp = x;
5        if(x < 0)
6        {
7            x *= -1; 
8        }
9        while(x != 0)
10        {
11            int digit = x % 10;
12              if (revDigit > Integer.MAX_VALUE / 10 || 
13                (revDigit == Integer.MAX_VALUE / 10 && digit > 7)) {
14                return 0;
15            }
16            if (revDigit < Integer.MIN_VALUE / 10 || 
17                (revDigit == Integer.MIN_VALUE / 10 && digit < -8)) {
18                return 0;
19            }
20            
21            revDigit = (revDigit * 10) + digit;
22            x=x/10;
23
24        }
25        if(temp <= 0){
26            return revDigit*-1;
27        }
28        return revDigit;
29    }
30}`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
