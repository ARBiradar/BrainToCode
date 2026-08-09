# 1. Two Sum

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        Map<Integer, Integer> map = new HashMap<>();
6        
7        for (int i = 0; i < nums.length; i++) {
8            int complement = target - nums[i];
9            
10            // Check if the complement already exists in the map
11            if (map.containsKey(complement)) {
12                return new int[] { map.get(complement), i };
13            }
14            
15            // Otherwise, add the current number and its index to the map
16            map.put(nums[i], i);
17        }
18        
19        // Return an empty array if no solution is found (per constraints, this won't happen)
20        return new int[] {};
21            
22    }
23}
24-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1import java.util.hashmap;
2
3class solution {
4    public int[] twosum(int[] nums, int target) {
5        map<integer, integer> map = new hashmap<>();
6        
7        for (int i = 0; i < nums.length; i++) {
8            int complement = target - nums[i];
9            
10            // check if the complement already exists in the map
11            if (map.containskey(complement)) {
12                return new int[] { map.get(complement), i };
13            }
14            
15            // otherwise, add the current number and its index to the map
16            map.put(nums[i], i);
17        }
18        
19        // return an empty array if no solution is found (per constraints, this won't happen)
20        return new int[] {};
21            
22    }
23}
24
c

```

## 🏷️ Tags

`LeetCode` `Coding` `1import java.util.HashMap;
2
3class Solution {
4    public int[] twoSum(int[] nums, int target) {
5        Map<Integer, Integer> map = new HashMap<>();
6        
7        for (int i = 0; i < nums.length; i++) {
8            int complement = target - nums[i];
9            
10            // Check if the complement already exists in the map
11            if (map.containsKey(complement)) {
12                return new int[] { map.get(complement), i };
13            }
14            
15            // Otherwise, add the current number and its index to the map
16            map.put(nums[i], i);
17        }
18        
19        // Return an empty array if no solution is found (per constraints, this won't happen)
20        return new int[] {};
21            
22    }
23}
24`

## 📅 Solved On

2026-08-09

---
*Auto-pushed by [CodePush Extension](https://github.com)*
