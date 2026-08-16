# 2029. Stone Game IX

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-class Solution {
public:
    bool stoneGameIX(vector<int>& stones) {
        int freq[3] = {0};
        for (const int num: stones)
            ++freq[num % 3];

        int f1 = freq[1], f2 = freq[2];
        // if there is at least one type 1 stone
        if (f1) {
            // remove one of the type 1 stones
            int cnt = 1;
            --f1;
            // remove pairs of type 1/2 stones
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            // if there are any type 1 stones left, remove one
            if (f1) {
                --f1;
                cnt = 0;
            }
            // in the end, if there are any type 1/2 stones left
            // and we remove odd number of type 0/1/2 stones,
            // there are no stones for Bob to remove in the next step,
            // so Alice wins
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }

        f1 = freq[1], f2 = freq[2];
        if (f2) {
            int cnt = 1;
            --f2;
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            if (f2) {
                --f2;
                cnt = 0;
            }
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }
        return false;
    }
};-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```class solution {
public:
    bool stonegameix(vector<int>& stones) {
        int freq[3] = {0};
        for (const int num: stones)
            ++freq[num % 3];

        int f1 = freq[1], f2 = freq[2];
        // if there is at least one type 1 stone
        if (f1) {
            // remove one of the type 1 stones
            int cnt = 1;
            --f1;
            // remove pairs of type 1/2 stones
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            // if there are any type 1 stones left, remove one
            if (f1) {
                --f1;
                cnt = 0;
            }
            // in the end, if there are any type 1/2 stones left
            // and we remove odd number of type 0/1/2 stones,
            // there are no stones for bob to remove in the next step,
            // so alice wins
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }

        f1 = freq[1], f2 = freq[2];
        if (f2) {
            int cnt = 1;
            --f2;
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            if (f2) {
                --f2;
                cnt = 0;
            }
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }
        return false;
    }
};
class Solution {
    public boolean stoneGameIX(int[] stones) {
        int[] count = new int[3];

        for (final int stone : stones)
        ++count[stone % 3];

        if (count[0] % 2 == 0)
        return Math.min(count[1], count[2]) > 0;
        return Math.abs(count[1] - count[2]) > 2;
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `class Solution {
public:
    bool stoneGameIX(vector<int>& stones) {
        int freq[3] = {0};
        for (const int num: stones)
            ++freq[num % 3];

        int f1 = freq[1], f2 = freq[2];
        // if there is at least one type 1 stone
        if (f1) {
            // remove one of the type 1 stones
            int cnt = 1;
            --f1;
            // remove pairs of type 1/2 stones
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            // if there are any type 1 stones left, remove one
            if (f1) {
                --f1;
                cnt = 0;
            }
            // in the end, if there are any type 1/2 stones left
            // and we remove odd number of type 0/1/2 stones,
            // there are no stones for Bob to remove in the next step,
            // so Alice wins
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }

        f1 = freq[1], f2 = freq[2];
        if (f2) {
            int cnt = 1;
            --f2;
            int minf = min(f1, f2);
            f1 -= minf, f2 -= minf;
            if (f2) {
                --f2;
                cnt = 0;
            }
            if (f1 + f2 && (cnt + freq[0]) % 2)
                return true;
        }
        return false;
    }
};`

## 📅 Solved On

2026-08-16

---
*Auto-pushed by [CodePush Extension](https://github.com)*
