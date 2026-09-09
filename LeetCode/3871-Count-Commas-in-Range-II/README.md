# 3871. Count Commas in Range II

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public long countCommas(long n) {
3
4        long ans = 0;
5        long start = 1000;
6        long commas = 1;
7
8        while (start <= n) {
9
10            long end = Math.min(n, start * 1000 - 1);
11
12            ans += (end - start + 1) * commas;
13
14            start *= 1000;
15            commas++;
16        }
17
18        return ans;
19    }
20}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public long countcommas(long n) {
3
4        long ans = 0;
5        long start = 1000;
6        long commas = 1;
7
8        while (start <= n) {
9
10            long end = math.min(n, start * 1000 - 1);
11
12            ans += (end - start + 1) * commas;
13
14            start *= 1000;
15            commas++;
16        }
17
18        return ans;
19    }
20}
        while (start <= n) {

            long end = Math.min(n, start * 1000 - 1);

            ans += (end - start + 1) * commas;

            start *= 1000;

        long commas = 1;
        long start = 1000;
        long ans = 0;

    public long countCommas(long n) {
class Solution {

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public long countCommas(long n) {
3
4        long ans = 0;
5        long start = 1000;
6        long commas = 1;
7
8        while (start <= n) {
9
10            long end = Math.min(n, start * 1000 - 1);
11
12            ans += (end - start + 1) * commas;
13
14            start *= 1000;
15            commas++;
16        }
17
18        return ans;
19    }
20}`

## 📅 Solved On

2026-09-09

---
*Auto-pushed by [CodePush Extension](https://github.com)*
