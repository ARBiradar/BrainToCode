# 3903. Smallest Stable Index I

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-[1,3,2,4,0]
2
[10,5,15,0,20]
10
[5,5,5,5,5,5]
0
[0,1,0,1,0,1]
1
[1,0,1,0,1,0]
1
[9,8,7,6,5,4,3,2,1,0]
9
[0,1,2,3,4,5,6,7,8,9]
0
[100,100,100,0,0,0]
100-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```[1,3,2,4,0]
2
[10,5,15,0,20]
10
[5,5,5,5,5,5]
0
[0,1,0,1,0,1]
1
[1,0,1,0,1,0]
1
[9,8,7,6,5,4,3,2,1,0]
9
[0,1,2,3,4,5,6,7,8,9]
0
[100,100,100,0,0,0]
100
            n-1]) <= k
            if (prefMax - suffMin[i] <= k) {
                return i;
            }
        }
        
        return -1;
    }
}


```

## 🏷️ Tags

`LeetCode` `Coding` `[1,3,2,4,0]
2
[10,5,15,0,20]
10
[5,5,5,5,5,5]
0
[0,1,0,1,0,1]
1
[1,0,1,0,1,0]
1
[9,8,7,6,5,4,3,2,1,0]
9
[0,1,2,3,4,5,6,7,8,9]
0
[100,100,100,0,0,0]
100`

## 📅 Solved On

2026-09-04

---
*Auto-pushed by [CodePush Extension](https://github.com)*
