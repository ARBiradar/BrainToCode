# find the minimum and maximum number of nodes between critical points

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Unknown-orange) ![Language](https://img.shields.io/badge/Language-1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for singly-linked list.
13 * public class ListNode {
14 *     int val;
15 *     ListNode next;
16 *     ListNode() {}
17 *     ListNode(int val) { this.val = val; }
18 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
19 * }
20 */
21class Solution {
22    public int[] nodesBetweenCriticalPoints(ListNode head) {
23        // Initialize result array: [minDistance, maxDistance]
24        // Use a large initial value for minDistance to find minimum
25        int[] result = {Integer.MAX_VALUE, 0};
26      
27        // Track the index of first and last critical points found
28        int firstCriticalIndex = -1;
29        int lastCriticalIndex = -1;
30      
31        // Traverse the linked list starting from index 0
32        // We need at least 3 nodes to check for critical points
33        int currentIndex = 0;
34        while (head.next != null && head.next.next != null) {
35            // Get values of three consecutive nodes
36            int previousValue = head.val;
37            int currentValue = head.next.val;
38            int nextValue = head.next.next.val;
39          
40            // Check if current node is a critical point
41            // A critical point is either a local minimum or local maximum
42            boolean isLocalMinimum = currentValue < previousValue && currentValue < nextValue;
43            boolean isLocalMaximum = currentValue > previousValue && currentValue > nextValue;
44          
45            if (isLocalMinimum || isLocalMaximum) {
46                // If this is the first critical point found
47                if (lastCriticalIndex == -1) {
48                    firstCriticalIndex = currentIndex;
49                    lastCriticalIndex = currentIndex;
50                } else {
51                    // Update minimum distance between consecutive critical points
52                    result[0] = Math.min(result[0], currentIndex - lastCriticalIndex);
53                  
54                    // Update the last critical point index
55                    lastCriticalIndex = currentIndex;
56                  
57                    // Update maximum distance (between first and last critical points)
58                    result[1] = Math.max(result[1], lastCriticalIndex - firstCriticalIndex);
59                }
60            }
61          
62            // Move to the next node
63            head = head.next;
64            currentIndex++;
65        }
66      
67        // If less than 2 critical points were found, return [-1, -1]
68        if (firstCriticalIndex == lastCriticalIndex) {
69            return new int[] {-1, -1};
70        }
71      
72        return result;
73    }
74}
75-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1/**
2 * definition for singly-linked list.
3 * public class listnode {
4 *     int val;
5 *     listnode next;
6 *     listnode() {}
7 *     listnode(int val) { this.val = val; }
8 *     listnode(int val, listnode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * definition for singly-linked list.
13 * public class listnode {
14 *     int val;
15 *     listnode next;
16 *     listnode() {}
17 *     listnode(int val) { this.val = val; }
18 *     listnode(int val, listnode next) { this.val = val; this.next = next; }
19 * }
20 */
21class solution {
22    public int[] nodesbetweencriticalpoints(listnode head) {
23        // initialize result array: [mindistance, maxdistance]
24        // use a large initial value for mindistance to find minimum
25        int[] result = {integer.max_value, 0};
26      
27        // track the index of first and last critical points found
28        int firstcriticalindex = -1;
29        int lastcriticalindex = -1;
30      
31        // traverse the linked list starting from index 0
32        // we need at least 3 nodes to check for critical points
33        int currentindex = 0;
34        while (head.next != null && head.next.next != null) {
35            // get values of three consecutive nodes
36            int previousvalue = head.val;
37            int currentvalue = head.next.val;
38            int nextvalue = head.next.next.val;
39          
40            // check if current node is a critical point
41            // a critical point is either a local minimum or local maximum
42            boolean islocalminimum = currentvalue < previousvalue && currentvalue < nextvalue;
43            boolean islocalmaximum = currentvalue > previousvalue && currentvalue > nextvalue;
44          
45            if (islocalminimum || islocalmaximum) {
46                // if this is the first critical point found
47                if (lastcriticalindex == -1) {
48                    firstcriticalindex = currentindex;
49                    lastcriticalindex = currentindex;
50                } else {
51                    // update minimum distance between consecutive critical points
52                    result[0] = math.min(result[0], currentindex - lastcriticalindex);
53                  
54                    // update the last critical point index
55                    lastcriticalindex = currentindex;
56                  
57                    // update maximum distance (between first and last critical points)
58                    result[1] = math.max(result[1], lastcriticalindex - firstcriticalindex);
59                }
60            }
61          
62            // move to the next node
63            head = head.next;
64            currentindex++;
65        }
66      
67        // if less than 2 critical points were found, return [-1, -1]
68        if (firstcriticalindex == lastcriticalindex) {
69            return new int[] {-1, -1};
70        }
71      
72        return result;
73    }
74}
75
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;

```

## 🏷️ Tags

`LeetCode` `Coding` `1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11/**
12 * Definition for singly-linked list.
13 * public class ListNode {
14 *     int val;
15 *     ListNode next;
16 *     ListNode() {}
17 *     ListNode(int val) { this.val = val; }
18 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
19 * }
20 */
21class Solution {
22    public int[] nodesBetweenCriticalPoints(ListNode head) {
23        // Initialize result array: [minDistance, maxDistance]
24        // Use a large initial value for minDistance to find minimum
25        int[] result = {Integer.MAX_VALUE, 0};
26      
27        // Track the index of first and last critical points found
28        int firstCriticalIndex = -1;
29        int lastCriticalIndex = -1;
30      
31        // Traverse the linked list starting from index 0
32        // We need at least 3 nodes to check for critical points
33        int currentIndex = 0;
34        while (head.next != null && head.next.next != null) {
35            // Get values of three consecutive nodes
36            int previousValue = head.val;
37            int currentValue = head.next.val;
38            int nextValue = head.next.next.val;
39          
40            // Check if current node is a critical point
41            // A critical point is either a local minimum or local maximum
42            boolean isLocalMinimum = currentValue < previousValue && currentValue < nextValue;
43            boolean isLocalMaximum = currentValue > previousValue && currentValue > nextValue;
44          
45            if (isLocalMinimum || isLocalMaximum) {
46                // If this is the first critical point found
47                if (lastCriticalIndex == -1) {
48                    firstCriticalIndex = currentIndex;
49                    lastCriticalIndex = currentIndex;
50                } else {
51                    // Update minimum distance between consecutive critical points
52                    result[0] = Math.min(result[0], currentIndex - lastCriticalIndex);
53                  
54                    // Update the last critical point index
55                    lastCriticalIndex = currentIndex;
56                  
57                    // Update maximum distance (between first and last critical points)
58                    result[1] = Math.max(result[1], lastCriticalIndex - firstCriticalIndex);
59                }
60            }
61          
62            // Move to the next node
63            head = head.next;
64            currentIndex++;
65        }
66      
67        // If less than 2 critical points were found, return [-1, -1]
68        if (firstCriticalIndex == lastCriticalIndex) {
69            return new int[] {-1, -1};
70        }
71      
72        return result;
73    }
74}
75`

## 📅 Solved On

2026-08-31

---
*Auto-pushed by [CodePush Extension](https://github.com)*
