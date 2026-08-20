# 7. Reverse Integer

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int reverse(int x) {
3        /*
4        int revDigit = 0;
5        int temp = x;
6        if(x < 0)
7        {
8            x *= -1; 
9        }
10        while(x != 0)
11        {
12            int digit = x % 10;
13              if (revDigit > Integer.MAX_VALUE / 10 || 
14                (revDigit == Integer.MAX_VALUE / 10 && digit > 7)) {
15                return 0;
16            }
17            if (revDigit < Integer.MIN_VALUE / 10 || 
18                (revDigit == Integer.MIN_VALUE / 10 && digit < -8)) {
19                return 0;
20            }
21            
22            revDigit = (revDigit * 10) + digit;
23            x=x/10;
24
25        }
26        if(temp <= 0){
27            return revDigit*-1;
28        }
29        return revDigit;
30        */
31
32        long reversed = 0;
33
34        while (x != 0) {
35            reversed = reversed * 10 + (x % 10);
36            x /= 10;
37        }
38
39    //it checks the integer overflow
40        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
41            return 0;
42        }
43
44        return (int) reversed;
45  
46    }
47}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int reverse(int x) {
3        /*
4        int revdigit = 0;
5        int temp = x;
6        if(x < 0)
7        {
8            x *= -1; 
9        }
10        while(x != 0)
11        {
12            int digit = x % 10;
13              if (revdigit > integer.max_value / 10 || 
14                (revdigit == integer.max_value / 10 && digit > 7)) {
15                return 0;
16            }
17            if (revdigit < integer.min_value / 10 || 
18                (revdigit == integer.min_value / 10 && digit < -8)) {
19                return 0;
20            }
21            
22            revdigit = (revdigit * 10) + digit;
23            x=x/10;
24
25        }
26        if(temp <= 0){
27            return revdigit*-1;
28        }
29        return revdigit;
30        */
31
32        long reversed = 0;
33
34        while (x != 0) {
35            reversed = reversed * 10 + (x % 10);
36            x /= 10;
37        }
38
39    //it checks the integer overflow
40        if (reversed > integer.max_value || reversed < integer.min_value) {
41            return 0;
42        }
43
44        return (int) reversed;
45  
46    }
47}

        return (int) reversed;
  
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int reverse(int x) {
3        /*
4        int revDigit = 0;
5        int temp = x;
6        if(x < 0)
7        {
8            x *= -1; 
9        }
10        while(x != 0)
11        {
12            int digit = x % 10;
13              if (revDigit > Integer.MAX_VALUE / 10 || 
14                (revDigit == Integer.MAX_VALUE / 10 && digit > 7)) {
15                return 0;
16            }
17            if (revDigit < Integer.MIN_VALUE / 10 || 
18                (revDigit == Integer.MIN_VALUE / 10 && digit < -8)) {
19                return 0;
20            }
21            
22            revDigit = (revDigit * 10) + digit;
23            x=x/10;
24
25        }
26        if(temp <= 0){
27            return revDigit*-1;
28        }
29        return revDigit;
30        */
31
32        long reversed = 0;
33
34        while (x != 0) {
35            reversed = reversed * 10 + (x % 10);
36            x /= 10;
37        }
38
39    //it checks the integer overflow
40        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
41            return 0;
42        }
43
44        return (int) reversed;
45  
46    }
47}`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
