# 169. Majority Element

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int majorityElement(int[] nums) {
3         int candidate = 0, count = 0;
4    for (int num : nums) {
5        if (count == 0) candidate = num;
6        count += (num == candidate) ? 1 : -1;
7    }
8  
9    int freq = 0;
10    for (int num : nums) {
11        if (num == candidate) freq++;
12    }
13    return (freq > nums.length/2) ? candidate : -1;
14    }
15}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int majorityelement(int[] nums) {
3         int candidate = 0, count = 0;
4    for (int num : nums) {
5        if (count == 0) candidate = num;
6        count += (num == candidate) ? 1 : -1;
7    }
8  
9    int freq = 0;
10    for (int num : nums) {
11        if (num == candidate) freq++;
12    }
13    return (freq > nums.length/2) ? candidate : -1;
14    }
15}
    }
  
    int freq = 0;
    for (int num : nums) {
        if (num == candidate) freq++;
    }
    return (freq > nums.length/2) ? candidate : -1;
    }
}
        count += (num == candidate) ? 1 : -1;

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int majorityElement(int[] nums) {
3         int candidate = 0, count = 0;
4    for (int num : nums) {
5        if (count == 0) candidate = num;
6        count += (num == candidate) ? 1 : -1;
7    }
8  
9    int freq = 0;
10    for (int num : nums) {
11        if (num == candidate) freq++;
12    }
13    return (freq > nums.length/2) ? candidate : -1;
14    }
15}`

## 📅 Solved On

2026-08-17

---
*Auto-pushed by [CodePush Extension](https://github.com)*
