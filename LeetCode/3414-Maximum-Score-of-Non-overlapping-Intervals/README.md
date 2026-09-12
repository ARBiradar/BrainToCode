# 3414. Maximum Score of Non-overlapping Intervals

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2  public int[] maximumWeight(List<List<Integer>> intervals) {
3    // Convert input to Interval objects
4    List<Interval> indexedIntervals = new ArrayList<>();
5    for (int i = 0; i < intervals.size(); ++i) {
6      List<Integer> interval = intervals.get(i);
7      indexedIntervals.add(new Interval(interval.get(0), interval.get(1), interval.get(2), i));
8    }
9    indexedIntervals.sort(Comparator.comparingInt(Interval::left));
10    T[][] memo = new T[indexedIntervals.size()][5];
11    return dp(indexedIntervals, memo, 0, 4).selected.stream().mapToInt(Integer::intValue).toArray();
12  }
13
14  private record T(long weight, List<Integer> selected) {}
15  private record Interval(int left, int right, int weight, int originalIndex) {}
16
17  private T dp(List<Interval> intervals, T[][] memo, int i, int quota) {
18    if (i == intervals.size() || quota == 0)
19      return new T(0, List.of());
20    if (memo[i][quota] != null)
21      return memo[i][quota];
22
23    T skip = dp(intervals, memo, i + 1, quota);
24
25    Interval interval = intervals.get(i);
26    final int j = findFirstGreater(intervals, i + 1, interval.right);
27    T nextRes = dp(intervals, memo, j, quota - 1);
28
29    List<Integer> newSelected = new ArrayList<>(nextRes.selected);
30    newSelected.add(interval.originalIndex);
31    Collections.sort(newSelected);
32    T pick = new T(interval.weight + nextRes.weight, newSelected);
33    return memo[i][quota] =
34               (pick.weight > skip.weight ||
35                (pick.weight == skip.weight && compareLists(pick.selected, skip.selected) < 0))
36                   ? pick
37                   : skip;
38  }
39
40  // Binary searches the first interval that starts after `rightBoundary`.
41  private int findFirstGreater(List<Interval> intervals, int startFrom, int rightBoundary) {
42    int l = startFrom;
43    int r = intervals.size();
44    while (l < r) {
45      final int m = (l + r) / 2;
46      if (intervals.get(m).left > rightBoundary)
47        r = m;
48      else
49        l = m + 1;
50    }
51    return l;
52  }
53
54  // Compares two lists of integers lexicographically.
55  private int compareLists(List<Integer> list1, List<Integer> list2) {
56    final int minSize = Math.min(list1.size(), list2.size());
57    for (int i = 0; i < minSize; ++i) {
58      final int comparison = Integer.compare(list1.get(i), list2.get(i));
59      if (comparison != 0)
60        return comparison;
61    }
62    return Integer.compare(list1.size(), list2.size());
63  }
64}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2  public int[] maximumweight(list<list<integer>> intervals) {
3    // convert input to interval objects
4    list<interval> indexedintervals = new arraylist<>();
5    for (int i = 0; i < intervals.size(); ++i) {
6      list<integer> interval = intervals.get(i);
7      indexedintervals.add(new interval(interval.get(0), interval.get(1), interval.get(2), i));
8    }
9    indexedintervals.sort(comparator.comparingint(interval::left));
10    t[][] memo = new t[indexedintervals.size()][5];
11    return dp(indexedintervals, memo, 0, 4).selected.stream().maptoint(integer::intvalue).toarray();
12  }
13
14  private record t(long weight, list<integer> selected) {}
15  private record interval(int left, int right, int weight, int originalindex) {}
16
17  private t dp(list<interval> intervals, t[][] memo, int i, int quota) {
18    if (i == intervals.size() || quota == 0)
19      return new t(0, list.of());
20    if (memo[i][quota] != null)
21      return memo[i][quota];
22
23    t skip = dp(intervals, memo, i + 1, quota);
24
25    interval interval = intervals.get(i);
26    final int j = findfirstgreater(intervals, i + 1, interval.right);
27    t nextres = dp(intervals, memo, j, quota - 1);
28
29    list<integer> newselected = new arraylist<>(nextres.selected);
30    newselected.add(interval.originalindex);
31    collections.sort(newselected);
32    t pick = new t(interval.weight + nextres.weight, newselected);
33    return memo[i][quota] =
34               (pick.weight > skip.weight ||
35                (pick.weight == skip.weight && comparelists(pick.selected, skip.selected) < 0))
36                   ? pick
37                   : skip;
38  }
39
40  // binary searches the first interval that starts after `rightboundary`.
41  private int findfirstgreater(list<interval> intervals, int startfrom, int rightboundary) {
42    int l = startfrom;
43    int r = intervals.size();
44    while (l < r) {
45      final int m = (l + r) / 2;
46      if (intervals.get(m).left > rightboundary)
47        r = m;
48      else
49        l = m + 1;
50    }
51    return l;
52  }
53
54  // compares two lists of integers lexicographically.
55  private int comparelists(list<integer> list1, list<integer> list2) {
56    final int minsize = math.min(list1.size(), list2.size());
57    for (int i = 0; i < minsize; ++i) {
58      final int comparison = integer.compare(list1.get(i), list2.get(i));
59      if (comparison != 0)
60        return comparison;
61    }
62    return integer.compare(list1.size(), list2.size());
63  }
64}
    return dp(indexedIntervals, memo, 0, 4).selected.stream().mapToInt
    (Integer::intValue).toArray();
  }
      indexedIntervals.add(new Interval(interval.get(0), interval.get
      (1), interval.get(2), i));
    }
    indexedIntervals.sort(Comparator.comparingInt(Interval::left));
    T[][] memo = new T[indexedIntervals.size()][5];
    for (int i = 0; i < intervals.size(); ++i) {
      List<Integer> interval = intervals.get(i);
    // Convert input to Interval objects
    List<Interval> indexedIntervals = new ArrayList<>();
class Solution {
  public int[] maximumWeight(List<List<Integer>> intervals) {

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2  public int[] maximumWeight(List<List<Integer>> intervals) {
3    // Convert input to Interval objects
4    List<Interval> indexedIntervals = new ArrayList<>();
5    for (int i = 0; i < intervals.size(); ++i) {
6      List<Integer> interval = intervals.get(i);
7      indexedIntervals.add(new Interval(interval.get(0), interval.get(1), interval.get(2), i));
8    }
9    indexedIntervals.sort(Comparator.comparingInt(Interval::left));
10    T[][] memo = new T[indexedIntervals.size()][5];
11    return dp(indexedIntervals, memo, 0, 4).selected.stream().mapToInt(Integer::intValue).toArray();
12  }
13
14  private record T(long weight, List<Integer> selected) {}
15  private record Interval(int left, int right, int weight, int originalIndex) {}
16
17  private T dp(List<Interval> intervals, T[][] memo, int i, int quota) {
18    if (i == intervals.size() || quota == 0)
19      return new T(0, List.of());
20    if (memo[i][quota] != null)
21      return memo[i][quota];
22
23    T skip = dp(intervals, memo, i + 1, quota);
24
25    Interval interval = intervals.get(i);
26    final int j = findFirstGreater(intervals, i + 1, interval.right);
27    T nextRes = dp(intervals, memo, j, quota - 1);
28
29    List<Integer> newSelected = new ArrayList<>(nextRes.selected);
30    newSelected.add(interval.originalIndex);
31    Collections.sort(newSelected);
32    T pick = new T(interval.weight + nextRes.weight, newSelected);
33    return memo[i][quota] =
34               (pick.weight > skip.weight ||
35                (pick.weight == skip.weight && compareLists(pick.selected, skip.selected) < 0))
36                   ? pick
37                   : skip;
38  }
39
40  // Binary searches the first interval that starts after `rightBoundary`.
41  private int findFirstGreater(List<Interval> intervals, int startFrom, int rightBoundary) {
42    int l = startFrom;
43    int r = intervals.size();
44    while (l < r) {
45      final int m = (l + r) / 2;
46      if (intervals.get(m).left > rightBoundary)
47        r = m;
48      else
49        l = m + 1;
50    }
51    return l;
52  }
53
54  // Compares two lists of integers lexicographically.
55  private int compareLists(List<Integer> list1, List<Integer> list2) {
56    final int minSize = Math.min(list1.size(), list2.size());
57    for (int i = 0; i < minSize; ++i) {
58      final int comparison = Integer.compare(list1.get(i), list2.get(i));
59      if (comparison != 0)
60        return comparison;
61    }
62    return Integer.compare(list1.size(), list2.size());
63  }
64}`

## 📅 Solved On

2026-09-12

---
*Auto-pushed by [CodePush Extension](https://github.com)*
