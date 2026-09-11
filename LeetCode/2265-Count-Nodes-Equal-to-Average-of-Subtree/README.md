# 2265. Count Nodes Equal to Average of Subtree

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-For the node with value 5: The average of its subtree is 
(5 + 6) / 2 = 11 / 2 = 5.-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```for the node with value 5: the average of its subtree is 
(5 + 6) / 2 = 11 / 2 = 5.
        int subtreeNodeCount = leftSubtree[1] + rightSubtree[1] + 1;
      
        // Check if average of subtree equals current node's value
        // Using integer division as per problem requirements
        if (subtreeSum / subtreeNodeCount == root.val) {
            nodeCount++;
        }
      
        // Return sum and count for parent node's calculation
        return new int[]{subtreeSum, subtreeNodeCount};
    }
}


```

## 🏷️ Tags

`LeetCode` `Coding` `For the node with value 5: The average of its subtree is 
(5 + 6) / 2 = 11 / 2 = 5.`

## 📅 Solved On

2026-09-11

---
*Auto-pushed by [CodePush Extension](https://github.com)*
