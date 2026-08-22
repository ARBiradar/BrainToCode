# 3622. Check Divisibility by Digit Sum and Product

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1
2class Solution {
3    /**
4     * Checks if a number is divisible by the sum of (digit sum + digit product)
5     * @param n the number to check
6     * @return true if n is divisible by (sum of digits + product of digits), false otherwise
7     */
8    public boolean checkDivisibility(int n) {
9        int digitSum = 0;      // Sum of all digits
10        int digitProduct = 1;  // Product of all digits
11        int number = n;        // Copy of n for digit extraction
12      
13        // Extract each digit and calculate sum and product
14        while (number != 0) {
15            int currentDigit = number % 10;  // Get the last digit
16            number /= 10;                     // Remove the last digit
17          
18            digitSum += currentDigit;        // Add digit to sum
19            digitProduct *= currentDigit;    // Multiply digit to product
20        }
21      
22        // Check if n is divisible by (digitSum + digitProduct)
23        return n % (digitSum + digitProduct) == 0;
24    }
25}
26-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1
2class solution {
3    /**
4     * checks if a number is divisible by the sum of (digit sum + digit product)
5     * @param n the number to check
6     * @return true if n is divisible by (sum of digits + product of digits), false otherwise
7     */
8    public boolean checkdivisibility(int n) {
9        int digitsum = 0;      // sum of all digits
10        int digitproduct = 1;  // product of all digits
11        int number = n;        // copy of n for digit extraction
12      
13        // extract each digit and calculate sum and product
14        while (number != 0) {
15            int currentdigit = number % 10;  // get the last digit
16            number /= 10;                     // remove the last digit
17          
18            digitsum += currentdigit;        // add digit to sum
19            digitproduct *= currentdigit;    // multiply digit to product
20        }
21      
22        // check if n is divisible by (digitsum + digitproduct)
23        return n % (digitsum + digitproduct) == 0;
24    }
25}
26
        while (number != 0) {
            int currentDigit = number % 10;  // Get the last digit
            number /= 10;                     // Remove the last digit
          
      
        // Extract each digit and calculate sum and product
        int digitProduct = 1;  // Product of all digits
        int number = n;        // Copy of n for digit extraction
        int digitSum = 0;      // Sum of all digits
    public boolean checkDivisibility(int n) {
     */
     * @return true if n is divisible by (sum of digits + product of digits), false otherwise
     * @param n the number to check
     * Checks if a number is divisible by the sum of (digit sum + digit product)
    /**
class Solution {


```

## 🏷️ Tags

`LeetCode` `Coding` `1
2class Solution {
3    /**
4     * Checks if a number is divisible by the sum of (digit sum + digit product)
5     * @param n the number to check
6     * @return true if n is divisible by (sum of digits + product of digits), false otherwise
7     */
8    public boolean checkDivisibility(int n) {
9        int digitSum = 0;      // Sum of all digits
10        int digitProduct = 1;  // Product of all digits
11        int number = n;        // Copy of n for digit extraction
12      
13        // Extract each digit and calculate sum and product
14        while (number != 0) {
15            int currentDigit = number % 10;  // Get the last digit
16            number /= 10;                     // Remove the last digit
17          
18            digitSum += currentDigit;        // Add digit to sum
19            digitProduct *= currentDigit;    // Multiply digit to product
20        }
21      
22        // Check if n is divisible by (digitSum + digitProduct)
23        return n % (digitSum + digitProduct) == 0;
24    }
25}
26`

## 📅 Solved On

2026-08-22

---
*Auto-pushed by [CodePush Extension](https://github.com)*
