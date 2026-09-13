# 835. Image Overlap

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Medium-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2    public int largestOverlap(int[][] A, int[][] B) {
3        int[] aLeftSlide = makeArray(A), aRightSlide = aLeftSlide.clone(), b = makeArray(B);
4        int maxOverlap = maxOverlapUpDownSlide(aLeftSlide, b);
5        for (int i = 0; i < A.length; i++) {
6            for (int j = 0; j < A.length; j++) {
7                aLeftSlide[j] <<= 1;
8                aRightSlide[j] >>= 1;
9            }
10            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide(aLeftSlide, b));
11            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide(aRightSlide, b));
12        }
13        return maxOverlap;
14    }
15    private int[] makeArray(int[][] matrix) {
16        int[] array = new int[matrix.length];
17        for (int i = 0; i < matrix.length; i++) {
18            for (int j = 0; j < matrix[i].length; j++) {
19                if (matrix[i][j] == 1) array[i] |= (1 << j); // set bit
20            }
21        }
22        return array;
23    }
24    private int maxOverlapUpDownSlide(int a[], int[] b) {
25        int maxOverlap = 0;
26        for (int i = 0; i < a.length; i++) {
27            int overlapUp = 0, overlapDown = 0;
28            for (int row = i; row < a.length; row++) {
29                overlapUp += Integer.bitCount(a[row] & b[row - i]);
30                overlapDown += Integer.bitCount(a[row - i] & b[row]);
31            }
32            maxOverlap = Math.max(maxOverlap, Math.max(overlapUp, overlapDown));
33        }
34        return maxOverlap;
35    }
36}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2    public int largestoverlap(int[][] a, int[][] b) {
3        int[] aleftslide = makearray(a), arightslide = aleftslide.clone(), b = makearray(b);
4        int maxoverlap = maxoverlapupdownslide(aleftslide, b);
5        for (int i = 0; i < a.length; i++) {
6            for (int j = 0; j < a.length; j++) {
7                aleftslide[j] <<= 1;
8                arightslide[j] >>= 1;
9            }
10            maxoverlap = math.max(maxoverlap, maxoverlapupdownslide(aleftslide, b));
11            maxoverlap = math.max(maxoverlap, maxoverlapupdownslide(arightslide, b));
12        }
13        return maxoverlap;
14    }
15    private int[] makearray(int[][] matrix) {
16        int[] array = new int[matrix.length];
17        for (int i = 0; i < matrix.length; i++) {
18            for (int j = 0; j < matrix[i].length; j++) {
19                if (matrix[i][j] == 1) array[i] |= (1 << j); // set bit
20            }
21        }
22        return array;
23    }
24    private int maxoverlapupdownslide(int a[], int[] b) {
25        int maxoverlap = 0;
26        for (int i = 0; i < a.length; i++) {
27            int overlapup = 0, overlapdown = 0;
28            for (int row = i; row < a.length; row++) {
29                overlapup += integer.bitcount(a[row] & b[row - i]);
30                overlapdown += integer.bitcount(a[row - i] & b[row]);
31            }
32            maxoverlap = math.max(maxoverlap, math.max(overlapup, overlapdown));
33        }
34        return maxoverlap;
35    }
36}
        (), b = makeArray(B);
        int maxOverlap = maxOverlapUpDownSlide(aLeftSlide, b);
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                aLeftSlide[j] <<= 1;
                aRightSlide[j] >>= 1;
            }
            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide
            (aLeftSlide, b));
            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide
            (aRightSlide, b));
class Solution {
    public int largestOverlap(int[][] A, int[][] B) {
        int[] aLeftSlide = makeArray(A), aRightSlide = aLeftSlide.clone

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2    public int largestOverlap(int[][] A, int[][] B) {
3        int[] aLeftSlide = makeArray(A), aRightSlide = aLeftSlide.clone(), b = makeArray(B);
4        int maxOverlap = maxOverlapUpDownSlide(aLeftSlide, b);
5        for (int i = 0; i < A.length; i++) {
6            for (int j = 0; j < A.length; j++) {
7                aLeftSlide[j] <<= 1;
8                aRightSlide[j] >>= 1;
9            }
10            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide(aLeftSlide, b));
11            maxOverlap = Math.max(maxOverlap, maxOverlapUpDownSlide(aRightSlide, b));
12        }
13        return maxOverlap;
14    }
15    private int[] makeArray(int[][] matrix) {
16        int[] array = new int[matrix.length];
17        for (int i = 0; i < matrix.length; i++) {
18            for (int j = 0; j < matrix[i].length; j++) {
19                if (matrix[i][j] == 1) array[i] |= (1 << j); // set bit
20            }
21        }
22        return array;
23    }
24    private int maxOverlapUpDownSlide(int a[], int[] b) {
25        int maxOverlap = 0;
26        for (int i = 0; i < a.length; i++) {
27            int overlapUp = 0, overlapDown = 0;
28            for (int row = i; row < a.length; row++) {
29                overlapUp += Integer.bitCount(a[row] & b[row - i]);
30                overlapDown += Integer.bitCount(a[row - i] & b[row]);
31            }
32            maxOverlap = Math.max(maxOverlap, Math.max(overlapUp, overlapDown));
33        }
34        return maxOverlap;
35    }
36}`

## 📅 Solved On

2026-09-13

---
*Auto-pushed by [CodePush Extension](https://github.com)*
