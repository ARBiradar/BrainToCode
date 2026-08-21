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

  }
    return l;

    }
        l = m + 1;
      else
        r = m;
      if (numDenominationsNoGreaterThan(sizeToLcms, m) >= k)
      final long m = (l + r) / 2;
    while (l < r) {

    long r = (long) k * Arrays.stream(coins).min().getAsInt();
    long l = 0;
    List<Long>[] sizeToLcms = getSizeToLcms(coins);
  public long findKthSmallest(int[] coins, int k) {
class Solution {

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
