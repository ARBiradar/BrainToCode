# 3116. Kth Smallest Amount With Single Denomination Combination

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-def findKthSmallest(self, A: List[int], k: int) -> int:
    # A.sort() + Filter Redundant Denominations (reduces 2^n overhead)
    def check(m):
        tot = 0
        for x in range(1, len(A) + 1):
            for c in combinations(A, x):
                tot += m // lcm(*c) * pow(-1, x + 1)
        return tot >= k
    return bisect_left(range(k * A[0] + 1), True, lo=1, key=check)-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```def findkthsmallest(self, a: list[int], k: int) -> int:
    # a.sort() + filter redundant denominations (reduces 2^n overhead)
    def check(m):
        tot = 0
        for x in range(1, len(a) + 1):
            for c in combinations(a, x):
                tot += m // lcm(*c) * pow(-1, x + 1)
        return tot >= k
    return bisect_left(range(k * a[0] + 1), true, lo=1, key=check)
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newCoins.add(x);
            }
        }
        coins = newCoins
            .stream()
            .mapToInt(i -> i)
            .toArray();

        int n = coins.length;
        int m = 1 << n;
        int[] bitCount = new int[m];
        long[] lcm = new long[m];
        long l = k;

```

## 🏷️ Tags

`LeetCode` `Coding` `def findKthSmallest(self, A: List[int], k: int) -> int:
    # A.sort() + Filter Redundant Denominations (reduces 2^n overhead)
    def check(m):
        tot = 0
        for x in range(1, len(A) + 1):
            for c in combinations(A, x):
                tot += m // lcm(*c) * pow(-1, x + 1)
        return tot >= k
    return bisect_left(range(k * A[0] + 1), True, lo=1, key=check)`

## 📅 Solved On

2026-08-21

---
*Auto-pushed by [CodePush Extension](https://github.com)*
