# 3720. Lexicographically Smallest Permutation Greater Than Target

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int n = s.length();
4        int[] freq = new int[26];
5
6        // Count characters of s
7        for (char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        StringBuilder ans = new StringBuilder();
12
13        // Try to match target character by character
14        for (int i = 0; i < n; i++) {
15            int curr = target.charAt(i) - 'a';
16
17            if (freq[curr] > 0) {
18                ans.append(target.charAt(i));
19                freq[curr]--;
20            } else {
21                // Cannot match target[i].
22                // Find smallest available character > target[i]
23                int greater = findGreater(freq, curr);
24
25                if (greater != -1) {
26                    ans.append((char) ('a' + greater));
27                    freq[greater]--;
28
29                    appendRemaining(ans, freq);
30                    return ans.toString();
31                }
32
33                // Need to backtrack
34                break;
35            }
36        }
37
38        /*
39         * If ans == target or matching failed,
40         * backtrack from right to left.
41         */
42        while (ans.length() > 0) {
43            int last = ans.charAt(ans.length() - 1) - 'a';
44
45            // Put removed character back
46            freq[last]++;
47            ans.deleteCharAt(ans.length() - 1);
48
49            // Find smallest character greater than this character
50            int greater = findGreater(freq, last);
51
52            if (greater != -1) {
53                ans.append((char) ('a' + greater));
54                freq[greater]--;
55
56                appendRemaining(ans, freq);
57                return ans.toString();
58            }
59        }
60
61        return "";
62    }
63
64    // Find the smallest available character greater than x
65    private int findGreater(int[] freq, int x) {
66        for (int i = x + 1; i < 26; i++) {
67            if (freq[i] > 0) {
68                return i;
69            }
70        }
71        return -1;
72    }
73
74    // Append remaining characters in sorted order
75    private void appendRemaining(StringBuilder ans, int[] freq) {
76        for (int i = 0; i < 26; i++) {
77            while (freq[i] > 0) {
78                ans.append((char) ('a' + i));
79                freq[i]--;
80            }
81        }
82    }
83}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public string lexgreaterpermutation(string s, string target) {
3        int n = s.length();
4        int[] freq = new int[26];
5
6        // count characters of s
7        for (char c : s.tochararray()) {
8            freq[c - 'a']++;
9        }
10
11        stringbuilder ans = new stringbuilder();
12
13        // try to match target character by character
14        for (int i = 0; i < n; i++) {
15            int curr = target.charat(i) - 'a';
16
17            if (freq[curr] > 0) {
18                ans.append(target.charat(i));
19                freq[curr]--;
20            } else {
21                // cannot match target[i].
22                // find smallest available character > target[i]
23                int greater = findgreater(freq, curr);
24
25                if (greater != -1) {
26                    ans.append((char) ('a' + greater));
27                    freq[greater]--;
28
29                    appendremaining(ans, freq);
30                    return ans.tostring();
31                }
32
33                // need to backtrack
34                break;
35            }
36        }
37
38        /*
39         * if ans == target or matching failed,
40         * backtrack from right to left.
41         */
42        while (ans.length() > 0) {
43            int last = ans.charat(ans.length() - 1) - 'a';
44
45            // put removed character back
46            freq[last]++;
47            ans.deletecharat(ans.length() - 1);
48
49            // find smallest character greater than this character
50            int greater = findgreater(freq, last);
51
52            if (greater != -1) {
53                ans.append((char) ('a' + greater));
54                freq[greater]--;
55
56                appendremaining(ans, freq);
57                return ans.tostring();
58            }
59        }
60
61        return "";
62    }
63
64    // find the smallest available character greater than x
65    private int findgreater(int[] freq, int x) {
66        for (int i = x + 1; i < 26; i++) {
67            if (freq[i] > 0) {
68                return i;
69            }
70        }
71        return -1;
72    }
73
74    // append remaining characters in sorted order
75    private void appendremaining(stringbuilder ans, int[] freq) {
76        for (int i = 0; i < 26; i++) {
77            while (freq[i] > 0) {
78                ans.append((char) ('a' + i));
79                freq[i]--;
80            }
81        }
82    }
83}
    private void appendRemaining(StringBuilder ans, int[] freq) {
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.append((char) ('a' + i));
                freq[i]--;
            }
        }
    }
}

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public String lexGreaterPermutation(String s, String target) {
3        int n = s.length();
4        int[] freq = new int[26];
5
6        // Count characters of s
7        for (char c : s.toCharArray()) {
8            freq[c - 'a']++;
9        }
10
11        StringBuilder ans = new StringBuilder();
12
13        // Try to match target character by character
14        for (int i = 0; i < n; i++) {
15            int curr = target.charAt(i) - 'a';
16
17            if (freq[curr] > 0) {
18                ans.append(target.charAt(i));
19                freq[curr]--;
20            } else {
21                // Cannot match target[i].
22                // Find smallest available character > target[i]
23                int greater = findGreater(freq, curr);
24
25                if (greater != -1) {
26                    ans.append((char) ('a' + greater));
27                    freq[greater]--;
28
29                    appendRemaining(ans, freq);
30                    return ans.toString();
31                }
32
33                // Need to backtrack
34                break;
35            }
36        }
37
38        /*
39         * If ans == target or matching failed,
40         * backtrack from right to left.
41         */
42        while (ans.length() > 0) {
43            int last = ans.charAt(ans.length() - 1) - 'a';
44
45            // Put removed character back
46            freq[last]++;
47            ans.deleteCharAt(ans.length() - 1);
48
49            // Find smallest character greater than this character
50            int greater = findGreater(freq, last);
51
52            if (greater != -1) {
53                ans.append((char) ('a' + greater));
54                freq[greater]--;
55
56                appendRemaining(ans, freq);
57                return ans.toString();
58            }
59        }
60
61        return "";
62    }
63
64    // Find the smallest available character greater than x
65    private int findGreater(int[] freq, int x) {
66        for (int i = x + 1; i < 26; i++) {
67            if (freq[i] > 0) {
68                return i;
69            }
70        }
71        return -1;
72    }
73
74    // Append remaining characters in sorted order
75    private void appendRemaining(StringBuilder ans, int[] freq) {
76        for (int i = 0; i < 26; i++) {
77            while (freq[i] > 0) {
78                ans.append((char) ('a' + i));
79                freq[i]--;
80            }
81        }
82    }
83}`

## 📅 Solved On

2026-08-27

---
*Auto-pushed by [CodePush Extension](https://github.com)*
