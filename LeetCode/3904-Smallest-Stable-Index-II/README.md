# 3904. Smallest Stable Index II

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3
4        int n = nums.length;
5
6        // Store minimum from i to n-1
7        int[] suffixMin = new int[n];
8
9        suffixMin[n - 1] = nums[n - 1];
10
11        for (int i = n - 2; i >= 0; i--) {
12            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
13        }
14
15        // Find the first stable index
16        int prefixMax = nums[0];
17
18        for (int i = 0; i < n; i++) {
19
20            prefixMax = Math.max(prefixMax, nums[i]);
21
22            int instability = prefixMax - suffixMin[i];
23
24            if (instability <= k) {
25                return i;
26            }
27        }
28
29        return -1;
30    }
31}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int firststableindex(int[] nums, int k) {
3
4        int n = nums.length;
5
6        // store minimum from i to n-1
7        int[] suffixmin = new int[n];
8
9        suffixmin[n - 1] = nums[n - 1];
10
11        for (int i = n - 2; i >= 0; i--) {
12            suffixmin[i] = math.min(nums[i], suffixmin[i + 1]);
13        }
14
15        // find the first stable index
16        int prefixmax = nums[0];
17
18        for (int i = 0; i < n; i++) {
19
20            prefixmax = math.max(prefixmax, nums[i]);
21
22            int instability = prefixmax - suffixmin[i];
23
24            if (instability <= k) {
25                return i;
26            }
27        }
28
29        return -1;
30    }
31}

            prefixMax = Math.max(prefixMax, nums[i]);

            int instability = prefixMax - suffixMin[i];

            if (instability <= k) {
                return i;
            }
        }

        return -1;
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int firstStableIndex(int[] nums, int k) {
3
4        int n = nums.length;
5
6        // Store minimum from i to n-1
7        int[] suffixMin = new int[n];
8
9        suffixMin[n - 1] = nums[n - 1];
10
11        for (int i = n - 2; i >= 0; i--) {
12            suffixMin[i] = Math.min(nums[i], suffixMin[i + 1]);
13        }
14
15        // Find the first stable index
16        int prefixMax = nums[0];
17
18        for (int i = 0; i < n; i++) {
19
20            prefixMax = Math.max(prefixMax, nums[i]);
21
22            int instability = prefixMax - suffixMin[i];
23
24            if (instability <= k) {
25                return i;
26            }
27        }
28
29        return -1;
30    }
31}`

## 📅 Solved On

2026-09-05

---
*Auto-pushed by [CodePush Extension](https://github.com)*
