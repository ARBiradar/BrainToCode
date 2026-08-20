# 1386. Cinema Seat Allocation

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-int maxNumberOfFamilies(int n, vector<vector<int>>& A) {
    ranges::sort(A);
    int res = n << 1;
    int s = A.size(), m = 0;
    for (int i = 0; i < s; i++) {
        m |= (1 << A[i][1]);
        if (i == s - 1 || A[i][0] != A[i + 1][0]) {
            int c = !(m & 0x3C) + !(m & 0x3C0);
            c += !c * !(m & 0xF0);
            res -= 2 - c;
            m = 0;
        }
    }
    return res;
}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```int maxnumberoffamilies(int n, vector<vector<int>>& a) {
    ranges::sort(a);
    int res = n << 1;
    int s = a.size(), m = 0;
    for (int i = 0; i < s; i++) {
        m |= (1 << a[i][1]);
        if (i == s - 1 || a[i][0] != a[i + 1][0]) {
            int c = !(m & 0x3c) + !(m & 0x3c0);
            c += !c * !(m & 0xf0);
            res -= 2 - c;
            m = 0;
        }
    }
    return res;
}
                    // Mark these seats as occupied to avoid double 
                    counting
                    reservedSeatsBitmask |= groupMask;
                    totalFamilies++;
                }
            }
        }
      
        return totalFamilies;
    }
}

                if ((reservedSeatsBitmask & groupMask) == 0) {

```

## 🏷️ Tags

`LeetCode` `Coding` `int maxNumberOfFamilies(int n, vector<vector<int>>& A) {
    ranges::sort(A);
    int res = n << 1;
    int s = A.size(), m = 0;
    for (int i = 0; i < s; i++) {
        m |= (1 << A[i][1]);
        if (i == s - 1 || A[i][0] != A[i + 1][0]) {
            int c = !(m & 0x3C) + !(m & 0x3C0);
            c += !c * !(m & 0xF0);
            res -= 2 - c;
            m = 0;
        }
    }
    return res;
}`

## 📅 Solved On

2026-08-19

---
*Auto-pushed by [CodePush Extension](https://github.com)*
