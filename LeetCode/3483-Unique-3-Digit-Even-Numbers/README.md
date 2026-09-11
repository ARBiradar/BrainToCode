# 3483. Unique 3-Digit Even Numbers

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int totalNumbers(int[] digits) {
3        // Use a HashSet to store unique 3-digit numbers
4        Set<Integer> uniqueNumbers = new HashSet<>();
5        int arrayLength = digits.length;
6      
7        // Iterate through all possible positions for the ones digit (must be even)
8        for (int onesIndex = 0; onesIndex < arrayLength; ++onesIndex) {
9            // Skip if the digit at this position is odd
10            if (digits[onesIndex] % 2 == 1) {
11                continue;
12            }
13          
14            // Iterate through all possible positions for the tens digit
15            for (int tensIndex = 0; tensIndex < arrayLength; ++tensIndex) {
16                // Skip if using the same index as the ones digit
17                if (onesIndex == tensIndex) {
18                    continue;
19                }
20              
21                // Iterate through all possible positions for the hundreds digit
22                for (int hundredsIndex = 0; hundredsIndex < arrayLength; ++hundredsIndex) {
23                    // Skip if:
24                    // 1. The digit is 0 (cannot be in hundreds place)
25                    // 2. The index is already used for ones or tens digit
26                    if (digits[hundredsIndex] == 0 || 
27                        hundredsIndex == onesIndex || 
28                        hundredsIndex == tensIndex) {
29                        continue;
30                    }
31                  
32                    // Form the 3-digit number and add to set
33                    int threeDigitNumber = digits[hundredsIndex] * 100 + 
34                                         digits[tensIndex] * 10 + 
35                                         digits[onesIndex];
36                    uniqueNumbers.add(threeDigitNumber);
37                }
38            }
39        }
40      
41        // Return the count of unique 3-digit numbers formed
42        return uniqueNumbers.size();
43    }
44}
45-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int totalnumbers(int[] digits) {
3        // use a hashset to store unique 3-digit numbers
4        set<integer> uniquenumbers = new hashset<>();
5        int arraylength = digits.length;
6      
7        // iterate through all possible positions for the ones digit (must be even)
8        for (int onesindex = 0; onesindex < arraylength; ++onesindex) {
9            // skip if the digit at this position is odd
10            if (digits[onesindex] % 2 == 1) {
11                continue;
12            }
13          
14            // iterate through all possible positions for the tens digit
15            for (int tensindex = 0; tensindex < arraylength; ++tensindex) {
16                // skip if using the same index as the ones digit
17                if (onesindex == tensindex) {
18                    continue;
19                }
20              
21                // iterate through all possible positions for the hundreds digit
22                for (int hundredsindex = 0; hundredsindex < arraylength; ++hundredsindex) {
23                    // skip if:
24                    // 1. the digit is 0 (cannot be in hundreds place)
25                    // 2. the index is already used for ones or tens digit
26                    if (digits[hundredsindex] == 0 || 
27                        hundredsindex == onesindex || 
28                        hundredsindex == tensindex) {
29                        continue;
30                    }
31                  
32                    // form the 3-digit number and add to set
33                    int threedigitnumber = digits[hundredsindex] * 100 + 
34                                         digits[tensindex] * 10 + 
35                                         digits[onesindex];
36                    uniquenumbers.add(threedigitnumber);
37                }
38            }
39        }
40      
41        // return the count of unique 3-digit numbers formed
42        return uniquenumbers.size();
43    }
44}
45
          
            }
                continue;
            if (digits[onesIndex] % 2 == 1) {
        (must be even)
        for (int onesIndex = 0; onesIndex < arrayLength; ++onesIndex) {
            // Skip if the digit at this position is odd
        // Iterate through all possible positions for the ones digit 
    public int totalNumbers(int[] digits) {
        // Use a HashSet to store unique 3-digit numbers
        Set<Integer> uniqueNumbers = new HashSet<>();
        int arrayLength = digits.length;
      
class Solution {

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int totalNumbers(int[] digits) {
3        // Use a HashSet to store unique 3-digit numbers
4        Set<Integer> uniqueNumbers = new HashSet<>();
5        int arrayLength = digits.length;
6      
7        // Iterate through all possible positions for the ones digit (must be even)
8        for (int onesIndex = 0; onesIndex < arrayLength; ++onesIndex) {
9            // Skip if the digit at this position is odd
10            if (digits[onesIndex] % 2 == 1) {
11                continue;
12            }
13          
14            // Iterate through all possible positions for the tens digit
15            for (int tensIndex = 0; tensIndex < arrayLength; ++tensIndex) {
16                // Skip if using the same index as the ones digit
17                if (onesIndex == tensIndex) {
18                    continue;
19                }
20              
21                // Iterate through all possible positions for the hundreds digit
22                for (int hundredsIndex = 0; hundredsIndex < arrayLength; ++hundredsIndex) {
23                    // Skip if:
24                    // 1. The digit is 0 (cannot be in hundreds place)
25                    // 2. The index is already used for ones or tens digit
26                    if (digits[hundredsIndex] == 0 || 
27                        hundredsIndex == onesIndex || 
28                        hundredsIndex == tensIndex) {
29                        continue;
30                    }
31                  
32                    // Form the 3-digit number and add to set
33                    int threeDigitNumber = digits[hundredsIndex] * 100 + 
34                                         digits[tensIndex] * 10 + 
35                                         digits[onesIndex];
36                    uniqueNumbers.add(threeDigitNumber);
37                }
38            }
39        }
40      
41        // Return the count of unique 3-digit numbers formed
42        return uniqueNumbers.size();
43    }
44}
45`

## 📅 Solved On

2026-09-11

---
*Auto-pushed by [CodePush Extension](https://github.com)*
