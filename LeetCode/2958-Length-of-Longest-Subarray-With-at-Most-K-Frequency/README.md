# 2958. Length of Longest Subarray With at Most K Frequency

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-from collections import defaultdict

class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        max_length = 0
        frequency = defaultdict(int)
        start = 0
        
        for end, num in enumerate(nums):
            frequency[num] += 1
            
            # If the frequency of any element exceeds k, adjust the window
            while frequency[num] > k:
                frequency[nums[start]] -= 1
                start += 1
            
            # Update the maximum length of the subarray
            max_length = max(max_length, end - start + 1)
        
        return max_length-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```from collections import defaultdict

class solution:
    def maxsubarraylength(self, nums: list[int], k: int) -> int:
        max_length = 0
        frequency = defaultdict(int)
        start = 0
        
        for end, num in enumerate(nums):
            frequency[num] += 1
            
            # if the frequency of any element exceeds k, adjust the window
            while frequency[num] > k:
                frequency[nums[start]] -= 1
                start += 1
            
            # update the maximum length of the subarray
            max_length = max(max_length, end - start + 1)
        
        return max_length
    public int maxSubarrayLength(int[] nums, int k) {
         int ans = 0;
    Map<Integer, Integer> count = new HashMap<>();

    for (int l = 0, r = 0; r < nums.length; ++r) {
      count.merge(nums[r], 1, Integer::sum);
      while (count.get(nums[r]) == k + 1)
        count.merge(nums[l++], -1, Integer::sum);
      ans = Math.max(ans, r - l + 1);
    }

    return ans;
    }

```

## 🏷️ Tags

`LeetCode` `Coding` `from collections import defaultdict

class Solution:
    def maxSubarrayLength(self, nums: List[int], k: int) -> int:
        max_length = 0
        frequency = defaultdict(int)
        start = 0
        
        for end, num in enumerate(nums):
            frequency[num] += 1
            
            # If the frequency of any element exceeds k, adjust the window
            while frequency[num] > k:
                frequency[nums[start]] -= 1
                start += 1
            
            # Update the maximum length of the subarray
            max_length = max(max_length, end - start + 1)
        
        return max_length`

## 📅 Solved On

2026-08-12

---
*Auto-pushed by [CodePush Extension](https://github.com)*
