# 27. Remove Element

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int count = 0;
4        for(int i = 0; i< nums.length; i++){
5            if(nums[i] != val){
6                nums[count] = nums[i];
7                count++;
8            }
9        }
10        return count;
11        
12    }
13}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int removeelement(int[] nums, int val) {
3        int count = 0;
4        for(int i = 0; i< nums.length; i++){
5            if(nums[i] != val){
6                nums[count] = nums[i];
7                count++;
8            }
9        }
10        return count;
11        
12    }
13}
        int count = 0;
        for(int i = 0; i< nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
        
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int removeElement(int[] nums, int val) {
3        int count = 0;
4        for(int i = 0; i< nums.length; i++){
5            if(nums[i] != val){
6                nums[count] = nums[i];
7                count++;
8            }
9        }
10        return count;
11        
12    }
13}`

## 📅 Solved On

2026-08-15

---
*Auto-pushed by [CodePush Extension](https://github.com)*
