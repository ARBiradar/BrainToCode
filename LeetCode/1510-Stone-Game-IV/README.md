# 1510. Stone Game IV

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public boolean winnerSquareGame(int n) {
3        
4         boolean[] f = new boolean[n + 1];
5        for (int i = 1; i <= n; ++i) {
6            for (int j = 1; j <= i / j; ++j) {
7                if (!f[i - j * j]) {
8                    f[i] = true;
9                    break;
10                }
11            }
12        }
13        return f[n];
14    }
15}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public boolean winnersquaregame(int n) {
3        
4         boolean[] f = new boolean[n + 1];
5        for (int i = 1; i <= n; ++i) {
6            for (int j = 1; j <= i / j; ++j) {
7                if (!f[i - j * j]) {
8                    f[i] = true;
9                    break;
10                }
11            }
12        }
13        return f[n];
14    }
15}
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i / j; ++j) {
                if (!f[i - j * j]) {
                    f[i] = true;
                    break;
         boolean[] f = new boolean[n + 1];
    public boolean winnerSquareGame(int n) {
        
class Solution {

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public boolean winnerSquareGame(int n) {
3        
4         boolean[] f = new boolean[n + 1];
5        for (int i = 1; i <= n; ++i) {
6            for (int j = 1; j <= i / j; ++j) {
7                if (!f[i - j * j]) {
8                    f[i] = true;
9                    break;
10                }
11            }
12        }
13        return f[n];
14    }
15}`

## 📅 Solved On

2026-08-10

---
*Auto-pushed by [CodePush Extension](https://github.com)*
