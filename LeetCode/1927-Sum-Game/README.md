# 1927. Sum Game

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-int diff = 0;
    int leftQ = 0;
    int rightQ = 0;

    // First half
    for (int i = 0; i < half; i++) {
        if (num.charAt(i) == '?') {
            leftQ++;
        } else {
            diff += num.charAt(i) - '0';
        }
    }

    // Second half
    for (int i = half; i < n; i++) {
        if (num.charAt(i) == '?') {
            rightQ++;
        } else {
            diff -= num.charAt(i) - '0';
        }
    }

    // Equal number of '?' -> Bob can always balance
    if (leftQ == rightQ) {
        return false;
    }

    // Bob wins only if the difference can be exactly balanced
    return 2 * Math.abs(diff) != 9 * Math.abs(leftQ - rightQ);
}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```int diff = 0;
    int leftq = 0;
    int rightq = 0;

    // first half
    for (int i = 0; i < half; i++) {
        if (num.charat(i) == '?') {
            leftq++;
        } else {
            diff += num.charat(i) - '0';
        }
    }

    // second half
    for (int i = half; i < n; i++) {
        if (num.charat(i) == '?') {
            rightq++;
        } else {
            diff -= num.charat(i) - '0';
        }
    }

    // equal number of '?' -> bob can always balance
    if (leftq == rightq) {
        return false;
    }

    // bob wins only if the difference can be exactly balanced
    return 2 * math.abs(diff) != 9 * math.abs(leftq - rightq);
}
            }
        }
      
        // Alice wins if:
        // 1. Total question marks is odd (Alice gets the last move)
        // 2. The difference in sums cannot be balanced by the question marks
        //    (Bob needs exactly 9 * (rightQuestionMarks - leftQuestionMarks) / 2 
        //     to balance the sums when question marks are evenly distributed)
        int totalQuestionMarks = leftQuestionMarks + rightQuestionMarks;
        int sumDifference = leftSum - rightSum;

```

## 🏷️ Tags

`LeetCode` `Coding` `int diff = 0;
    int leftQ = 0;
    int rightQ = 0;

    // First half
    for (int i = 0; i < half; i++) {
        if (num.charAt(i) == '?') {
            leftQ++;
        } else {
            diff += num.charAt(i) - '0';
        }
    }

    // Second half
    for (int i = half; i < n; i++) {
        if (num.charAt(i) == '?') {
            rightQ++;
        } else {
            diff -= num.charAt(i) - '0';
        }
    }

    // Equal number of '?' -> Bob can always balance
    if (leftQ == rightQ) {
        return false;
    }

    // Bob wins only if the difference can be exactly balanced
    return 2 * Math.abs(diff) != 9 * Math.abs(leftQ - rightQ);
}`

## 📅 Solved On

2026-08-23

---
*Auto-pushed by [CodePush Extension](https://github.com)*
