# 3345. Smallest Divisible Digit Product I

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-class Solution {
public:
    int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 9; ++i) {
            int product = 1; 
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0) return i;
        }
        return -1; // unreachable.
    }
};-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```class solution {
public:
    int smallestnumber(int n, int t) {
        for (int i = n; i <= n + 9; ++i) {
            int product = 1; 
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0) return i;
        }
        return -1; // unreachable.
    }
};
class Solution {
  public int smallestNumber(int n, int t) {
    for (int num = n; num < n + 10; ++num)
      if (getDigitProd(num) % t == 0)
        return num;
    throw new IllegalArgumentException();
  }

  private int getDigitProd(int num) {
    int digitProd = 1;
    while (num > 0) {
      digitProd *= num % 10;
      num /= 10;
    }
    return digitProd;
  }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `class Solution {
public:
    int smallestNumber(int n, int t) {
        for (int i = n; i <= n + 9; ++i) {
            int product = 1; 
            for (int v = i; v > 0; v /= 10)
                product *= v % 10;
            if (product % t == 0) return i;
        }
        return -1; // unreachable.
    }
};`

## 📅 Solved On

2026-08-06

---
*Auto-pushed by [CodePush Extension](https://github.com)*
