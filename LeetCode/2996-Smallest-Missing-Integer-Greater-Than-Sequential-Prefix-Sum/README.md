# 2996. Smallest Missing Integer Greater Than Sequential Prefix Sum

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-A prefix is a contiguous subArray starting at index 0-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```a prefix is a contiguous subarray starting at index 0
    for (int i = 1; i < nums.length; ++i) {
      if (nums[i] != nums[i - 1] + 1)
        break;
      ans += nums[i];
    }

    while (numsSet.contains(ans))
      ++ans;

    return ans;
  }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `A prefix is a contiguous subArray starting at index 0`

## 📅 Solved On

2026-08-11

---
*Auto-pushed by [CodePush Extension](https://github.com)*
