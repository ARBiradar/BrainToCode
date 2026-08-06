# Missing in ArraySolved

![Platform](https://img.shields.io/badge/Platform-GeeksForGeeks-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Unknown-orange) ![Language](https://img.shields.io/badge/Language-cpp-green)

## 🧩 Problem Summary

You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). This array represents a permutation of the integers from 1 to n with one element missing. Your task is to identify and return the missing element.
Examples:
Input: arr[] = [1, 2, 3, 5]
Output: 4
Explanation: All the numbers from 1 to 5 are present except 4.
Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
Output: 6
Explanation: All the numbers from 1 to 8 are present except 6.
Input: arr[] = [1]
Output: 2
Explanation: Only 1 is present so the missing element is 2.
Constraints:1 ≤ arr.size() ≤ 1061 ≤ arr[i] ≤ arr.size() + 1

## 💻 Solution

```cpp
class Solution {
    int missingNum(int arr[]) {
        // code here
        
        long n2 = arr.length+1  ;
        
        long numSum =  (n2 * (n2+1)/2);
        long missNumSum = 0;
        for(int num: arr){
            missNumSum = missNumSum + num;
        }
        return (int)(numSum - missNumSum);
        
        
       
        
    }
}
```

## 🏷️ Tags

`GeeksForGeeks` `Coding` `cpp`

## 📅 Solved On

2026-08-06

---
*Auto-pushed by [CodePush Extension](https://github.com)*
