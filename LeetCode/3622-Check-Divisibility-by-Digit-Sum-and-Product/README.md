# 3622. Check Divisibility by Digit Sum and Product

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1
2class Solution {
3    
4    public boolean checkDivisibility(int n) {
5        int digitSum = 0;     
6        int digitProduct = 1;  
7        int number = n;        
8      
9      
10        while (number != 0) {
11            int currentDigit = number % 10;  
12            number /= 10;                     
13          
14            digitSum += currentDigit;        
15            digitProduct *= currentDigit;     
16        }
17      
18       
19        return n % (digitSum + digitProduct) == 0;
20    }
21}
22-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1
2class solution {
3    
4    public boolean checkdivisibility(int n) {
5        int digitsum = 0;     
6        int digitproduct = 1;  
7        int number = n;        
8      
9      
10        while (number != 0) {
11            int currentdigit = number % 10;  
12            number /= 10;                     
13          
14            digitsum += currentdigit;        
15            digitproduct *= currentdigit;     
16        }
17      
18       
19        return n % (digitsum + digitproduct) == 0;
20    }
21}
22
        while (number != 0) {
            int currentDigit = number % 10;  
            number /= 10;                     
          
            digitSum += currentDigit;        
            digitProduct *= currentDigit;     
        }
      
        int number = n;        
      
      
        int digitProduct = 1;  
    public boolean checkDivisibility(int n) {
        int digitSum = 0;     
class Solution {
    


```

## 🏷️ Tags

`LeetCode` `Coding` `1
2class Solution {
3    
4    public boolean checkDivisibility(int n) {
5        int digitSum = 0;     
6        int digitProduct = 1;  
7        int number = n;        
8      
9      
10        while (number != 0) {
11            int currentDigit = number % 10;  
12            number /= 10;                     
13          
14            digitSum += currentDigit;        
15            digitProduct *= currentDigit;     
16        }
17      
18       
19        return n % (digitSum + digitProduct) == 0;
20    }
21}
22`

## 📅 Solved On

2026-08-22

---
*Auto-pushed by [CodePush Extension](https://github.com)*
