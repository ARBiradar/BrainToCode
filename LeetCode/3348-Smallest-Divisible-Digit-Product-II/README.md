# 3348. Smallest Divisible Digit Product II

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Hard-orange) ![Language](https://img.shields.io/badge/Language-1class Solution {
2  public String smallestNumber(String num, long t) {
3    Pair<Map<Integer, Integer>, Boolean> primeCountResult = getPrimeCount(t);
4    Map<Integer, Integer> primeCount = primeCountResult.getKey();
5    boolean isDivisible = primeCountResult.getValue();
6    if (!isDivisible)
7      return "-1";
8
9    Map<Integer, Integer> factorCount = getFactorCount(primeCount);
10    if (sumValues(factorCount) > num.length())
11      return construct(factorCount);
12
13    Map<Integer, Integer> primeCountPrefix = getPrimeCount(num);
14    int firstZeroIndex = num.indexOf('0');
15    if (firstZeroIndex == -1) {
16      firstZeroIndex = num.length();
17      if (isSubset(primeCount, primeCountPrefix))
18        return num;
19    }
20
21    for (int i = num.length() - 1; i >= 0; --i) {
22      final int d = num.charAt(i) - '0';
23      // Remove the current digit's factors from primeCountPrefix.
24      primeCountPrefix = subtract(primeCountPrefix, FACTOR_COUNTS.get(d));
25      final int spaceAfterThisDigit = num.length() - 1 - i;
26      if (i > firstZeroIndex)
27        continue;
28      for (int biggerDigit = d + 1; biggerDigit < 10; ++biggerDigit) {
29        // Compute the required factors after replacing with a larger digit.
30        Map<Integer, Integer> factorsAfterReplacement = getFactorCount(
31            subtract(subtract(primeCount, primeCountPrefix), FACTOR_COUNTS.get(biggerDigit)));
32        // Check if the replacement is possible within the available space.
33        if (sumValues(factorsAfterReplacement) <= spaceAfterThisDigit) {
34          // Fill extra space with '1', if any, and construct the result.
35          final int fillOnes = spaceAfterThisDigit - sumValues(factorsAfterReplacement);
36          return num.substring(0, i) + // Keep the prefix unchanged.
37              biggerDigit +            // Replace the current digit.
38              "1".repeat(fillOnes) + // Fill remaining space with '1'.
39              construct(factorsAfterReplacement);
40        }
41      }
42    }
43
44    // No solution of the same length exists, so we need to extend the number
45    // by prepending '1's and adding the required factors.
46    Map<Integer, Integer> factorsAfterExtension = getFactorCount(primeCount);
47    return "1".repeat(num.length() + 1 - sumValues(factorsAfterExtension)) +
48        construct(factorsAfterExtension);
49  }
50
51  private static final Map<Integer, Map<Integer, Integer>> FACTOR_COUNTS = Map.of(
52      0, Map.of(), 1, Map.of(), 2, Map.of(2, 1), 3, Map.of(3, 1), 4, Map.of(2, 2), 5, Map.of(5, 1),
53      6, Map.of(2, 1, 3, 1), 7, Map.of(7, 1), 8, Map.of(2, 3), 9, Map.of(3, 2));
54
55  // Returns the prime count of t and if t is divisible by 2, 3, 5, 7.
56  private Pair<Map<Integer, Integer>, Boolean> getPrimeCount(long t) {
57    Map<Integer, Integer> count = new HashMap<>(Map.of(2, 0, 3, 0, 5, 0, 7, 0));
58    for (int prime : new int[] {2, 3, 5, 7}) {
59      while (t % prime == 0) {
60        t /= prime;
61        count.put(prime, count.get(prime) + 1);
62      }
63    }
64    return new Pair<>(count, t == 1);
65  }
66
67  // Returns the prime count of `num`.
68  private Map<Integer, Integer> getPrimeCount(String num) {
69    Map<Integer, Integer> count = new HashMap<>(Map.of(2, 0, 3, 0, 5, 0, 7, 0));
70    for (final char c : num.toCharArray()) {
71      Map<Integer, Integer> digitFactors = FACTOR_COUNTS.get(c - '0');
72      for (Map.Entry<Integer, Integer> entry : digitFactors.entrySet()) {
73        final int prime = entry.getKey();
74        final int freq = entry.getValue();
75        count.merge(prime, freq, Integer::sum);
76      }
77    }
78    return count;
79  }
80
81  private Map<Integer, Integer> getFactorCount(Map<Integer, Integer> count) {
82    // 2^3 = 8
83    final int count8 = count.get(2) / 3;
84    final int remaining2 = count.get(2) % 3;
85    // 3^2 = 9
86    final int count9 = count.get(3) / 2;
87    int count3 = count.get(3) % 2;
88    // 2^2 = 4
89    int count4 = remaining2 / 2;
90    int count2 = remaining2 % 2;
91    // Combine 2 and 3 to 6 if both are present
92    int count6 = 0;
93    if (count2 == 1 && count3 == 1) {
94      count2 = 0;
95      count3 = 0;
96      count6 = 1;
97    }
98    // Combine 3 and 4 to 2 and 6 if both are present
99    if (count3 == 1 && count4 == 1) {
100      count2 = 1;
101      count6 = 1;
102      count3 = 0;
103      count4 = 0;
104    }
105    return Map.of(2, count2, 3, count3, 4, count4, 5, count.get(5), 6, count6, 7, count.get(7), 8,
106                  count8, 9, count9);
107  }
108
109  private String construct(Map<Integer, Integer> factors) {
110    StringBuilder sb = new StringBuilder();
111    for (int digit = 2; digit < 10; ++digit)
112      sb.append(String.valueOf(digit).repeat(factors.get(digit)));
113    return sb.toString();
114  }
115
116  // Returns true if a is a subset of b.
117  private boolean isSubset(Map<Integer, Integer> a, Map<Integer, Integer> b) {
118    for (Map.Entry<Integer, Integer> entry : a.entrySet())
119      if (b.get(entry.getKey()) < entry.getValue())
120        return false;
121    return true;
122  }
123
124  // Returns a - b.
125  private Map<Integer, Integer> subtract(Map<Integer, Integer> a, Map<Integer, Integer> b) {
126    Map<Integer, Integer> res = new HashMap<>(a);
127    for (Map.Entry<Integer, Integer> entry : b.entrySet()) {
128      final int key = entry.getKey();
129      final int value = entry.getValue();
130      res.put(key, Math.max(0, res.get(key) - value));
131    }
132    return res;
133  }
134
135  // Returns the sum of the values in `count`.
136  private int sumValues(Map<Integer, Integer> count) {
137    return count.values().stream().mapToInt(Integer::intValue).sum();
138  }
139}-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1class solution {
2  public string smallestnumber(string num, long t) {
3    pair<map<integer, integer>, boolean> primecountresult = getprimecount(t);
4    map<integer, integer> primecount = primecountresult.getkey();
5    boolean isdivisible = primecountresult.getvalue();
6    if (!isdivisible)
7      return "-1";
8
9    map<integer, integer> factorcount = getfactorcount(primecount);
10    if (sumvalues(factorcount) > num.length())
11      return construct(factorcount);
12
13    map<integer, integer> primecountprefix = getprimecount(num);
14    int firstzeroindex = num.indexof('0');
15    if (firstzeroindex == -1) {
16      firstzeroindex = num.length();
17      if (issubset(primecount, primecountprefix))
18        return num;
19    }
20
21    for (int i = num.length() - 1; i >= 0; --i) {
22      final int d = num.charat(i) - '0';
23      // remove the current digit's factors from primecountprefix.
24      primecountprefix = subtract(primecountprefix, factor_counts.get(d));
25      final int spaceafterthisdigit = num.length() - 1 - i;
26      if (i > firstzeroindex)
27        continue;
28      for (int biggerdigit = d + 1; biggerdigit < 10; ++biggerdigit) {
29        // compute the required factors after replacing with a larger digit.
30        map<integer, integer> factorsafterreplacement = getfactorcount(
31            subtract(subtract(primecount, primecountprefix), factor_counts.get(biggerdigit)));
32        // check if the replacement is possible within the available space.
33        if (sumvalues(factorsafterreplacement) <= spaceafterthisdigit) {
34          // fill extra space with '1', if any, and construct the result.
35          final int fillones = spaceafterthisdigit - sumvalues(factorsafterreplacement);
36          return num.substring(0, i) + // keep the prefix unchanged.
37              biggerdigit +            // replace the current digit.
38              "1".repeat(fillones) + // fill remaining space with '1'.
39              construct(factorsafterreplacement);
40        }
41      }
42    }
43
44    // no solution of the same length exists, so we need to extend the number
45    // by prepending '1's and adding the required factors.
46    map<integer, integer> factorsafterextension = getfactorcount(primecount);
47    return "1".repeat(num.length() + 1 - sumvalues(factorsafterextension)) +
48        construct(factorsafterextension);
49  }
50
51  private static final map<integer, map<integer, integer>> factor_counts = map.of(
52      0, map.of(), 1, map.of(), 2, map.of(2, 1), 3, map.of(3, 1), 4, map.of(2, 2), 5, map.of(5, 1),
53      6, map.of(2, 1, 3, 1), 7, map.of(7, 1), 8, map.of(2, 3), 9, map.of(3, 2));
54
55  // returns the prime count of t and if t is divisible by 2, 3, 5, 7.
56  private pair<map<integer, integer>, boolean> getprimecount(long t) {
57    map<integer, integer> count = new hashmap<>(map.of(2, 0, 3, 0, 5, 0, 7, 0));
58    for (int prime : new int[] {2, 3, 5, 7}) {
59      while (t % prime == 0) {
60        t /= prime;
61        count.put(prime, count.get(prime) + 1);
62      }
63    }
64    return new pair<>(count, t == 1);
65  }
66
67  // returns the prime count of `num`.
68  private map<integer, integer> getprimecount(string num) {
69    map<integer, integer> count = new hashmap<>(map.of(2, 0, 3, 0, 5, 0, 7, 0));
70    for (final char c : num.tochararray()) {
71      map<integer, integer> digitfactors = factor_counts.get(c - '0');
72      for (map.entry<integer, integer> entry : digitfactors.entryset()) {
73        final int prime = entry.getkey();
74        final int freq = entry.getvalue();
75        count.merge(prime, freq, integer::sum);
76      }
77    }
78    return count;
79  }
80
81  private map<integer, integer> getfactorcount(map<integer, integer> count) {
82    // 2^3 = 8
83    final int count8 = count.get(2) / 3;
84    final int remaining2 = count.get(2) % 3;
85    // 3^2 = 9
86    final int count9 = count.get(3) / 2;
87    int count3 = count.get(3) % 2;
88    // 2^2 = 4
89    int count4 = remaining2 / 2;
90    int count2 = remaining2 % 2;
91    // combine 2 and 3 to 6 if both are present
92    int count6 = 0;
93    if (count2 == 1 && count3 == 1) {
94      count2 = 0;
95      count3 = 0;
96      count6 = 1;
97    }
98    // combine 3 and 4 to 2 and 6 if both are present
99    if (count3 == 1 && count4 == 1) {
100      count2 = 1;
101      count6 = 1;
102      count3 = 0;
103      count4 = 0;
104    }
105    return map.of(2, count2, 3, count3, 4, count4, 5, count.get(5), 6, count6, 7, count.get(7), 8,
106                  count8, 9, count9);
107  }
108
109  private string construct(map<integer, integer> factors) {
110    stringbuilder sb = new stringbuilder();
111    for (int digit = 2; digit < 10; ++digit)
112      sb.append(string.valueof(digit).repeat(factors.get(digit)));
113    return sb.tostring();
114  }
115
116  // returns true if a is a subset of b.
117  private boolean issubset(map<integer, integer> a, map<integer, integer> b) {
118    for (map.entry<integer, integer> entry : a.entryset())
119      if (b.get(entry.getkey()) < entry.getvalue())
120        return false;
121    return true;
122  }
123
124  // returns a - b.
125  private map<integer, integer> subtract(map<integer, integer> a, map<integer, integer> b) {
126    map<integer, integer> res = new hashmap<>(a);
127    for (map.entry<integer, integer> entry : b.entryset()) {
128      final int key = entry.getkey();
129      final int value = entry.getvalue();
130      res.put(key, math.max(0, res.get(key) - value));
131    }
132    return res;
133  }
134
135  // returns the sum of the values in `count`.
136  private int sumvalues(map<integer, integer> count) {
137    return count.values().stream().maptoint(integer::intvalue).sum();
138  }
139}
    if (count3 == 1 && count4 == 1) {
      count2 = 1;
      count6 = 1;
      count3 = 0;
    int count2 = remaining2 % 2;
    // Combine 2 and 3 to 6 if both are present
    int count6 = 0;
    if (count2 == 1 && count3 == 1) {
      count2 = 0;
      count3 = 0;
      count6 = 1;
    }
    // Combine 3 and 4 to 2 and 6 if both are present
    int count4 = remaining2 / 2;
    // 2^2 = 4
    int count3 = count.get(3) % 2;
    final int count9 = count.get(3) / 2;
    // 3^2 = 9
    final int remaining2 = count.get(2) % 3;
    final int count8 = count.get(2) / 3;
    // 2^3 = 8

```

## 🏷️ Tags

`LeetCode` `Coding` `1class Solution {
2  public String smallestNumber(String num, long t) {
3    Pair<Map<Integer, Integer>, Boolean> primeCountResult = getPrimeCount(t);
4    Map<Integer, Integer> primeCount = primeCountResult.getKey();
5    boolean isDivisible = primeCountResult.getValue();
6    if (!isDivisible)
7      return "-1";
8
9    Map<Integer, Integer> factorCount = getFactorCount(primeCount);
10    if (sumValues(factorCount) > num.length())
11      return construct(factorCount);
12
13    Map<Integer, Integer> primeCountPrefix = getPrimeCount(num);
14    int firstZeroIndex = num.indexOf('0');
15    if (firstZeroIndex == -1) {
16      firstZeroIndex = num.length();
17      if (isSubset(primeCount, primeCountPrefix))
18        return num;
19    }
20
21    for (int i = num.length() - 1; i >= 0; --i) {
22      final int d = num.charAt(i) - '0';
23      // Remove the current digit's factors from primeCountPrefix.
24      primeCountPrefix = subtract(primeCountPrefix, FACTOR_COUNTS.get(d));
25      final int spaceAfterThisDigit = num.length() - 1 - i;
26      if (i > firstZeroIndex)
27        continue;
28      for (int biggerDigit = d + 1; biggerDigit < 10; ++biggerDigit) {
29        // Compute the required factors after replacing with a larger digit.
30        Map<Integer, Integer> factorsAfterReplacement = getFactorCount(
31            subtract(subtract(primeCount, primeCountPrefix), FACTOR_COUNTS.get(biggerDigit)));
32        // Check if the replacement is possible within the available space.
33        if (sumValues(factorsAfterReplacement) <= spaceAfterThisDigit) {
34          // Fill extra space with '1', if any, and construct the result.
35          final int fillOnes = spaceAfterThisDigit - sumValues(factorsAfterReplacement);
36          return num.substring(0, i) + // Keep the prefix unchanged.
37              biggerDigit +            // Replace the current digit.
38              "1".repeat(fillOnes) + // Fill remaining space with '1'.
39              construct(factorsAfterReplacement);
40        }
41      }
42    }
43
44    // No solution of the same length exists, so we need to extend the number
45    // by prepending '1's and adding the required factors.
46    Map<Integer, Integer> factorsAfterExtension = getFactorCount(primeCount);
47    return "1".repeat(num.length() + 1 - sumValues(factorsAfterExtension)) +
48        construct(factorsAfterExtension);
49  }
50
51  private static final Map<Integer, Map<Integer, Integer>> FACTOR_COUNTS = Map.of(
52      0, Map.of(), 1, Map.of(), 2, Map.of(2, 1), 3, Map.of(3, 1), 4, Map.of(2, 2), 5, Map.of(5, 1),
53      6, Map.of(2, 1, 3, 1), 7, Map.of(7, 1), 8, Map.of(2, 3), 9, Map.of(3, 2));
54
55  // Returns the prime count of t and if t is divisible by 2, 3, 5, 7.
56  private Pair<Map<Integer, Integer>, Boolean> getPrimeCount(long t) {
57    Map<Integer, Integer> count = new HashMap<>(Map.of(2, 0, 3, 0, 5, 0, 7, 0));
58    for (int prime : new int[] {2, 3, 5, 7}) {
59      while (t % prime == 0) {
60        t /= prime;
61        count.put(prime, count.get(prime) + 1);
62      }
63    }
64    return new Pair<>(count, t == 1);
65  }
66
67  // Returns the prime count of `num`.
68  private Map<Integer, Integer> getPrimeCount(String num) {
69    Map<Integer, Integer> count = new HashMap<>(Map.of(2, 0, 3, 0, 5, 0, 7, 0));
70    for (final char c : num.toCharArray()) {
71      Map<Integer, Integer> digitFactors = FACTOR_COUNTS.get(c - '0');
72      for (Map.Entry<Integer, Integer> entry : digitFactors.entrySet()) {
73        final int prime = entry.getKey();
74        final int freq = entry.getValue();
75        count.merge(prime, freq, Integer::sum);
76      }
77    }
78    return count;
79  }
80
81  private Map<Integer, Integer> getFactorCount(Map<Integer, Integer> count) {
82    // 2^3 = 8
83    final int count8 = count.get(2) / 3;
84    final int remaining2 = count.get(2) % 3;
85    // 3^2 = 9
86    final int count9 = count.get(3) / 2;
87    int count3 = count.get(3) % 2;
88    // 2^2 = 4
89    int count4 = remaining2 / 2;
90    int count2 = remaining2 % 2;
91    // Combine 2 and 3 to 6 if both are present
92    int count6 = 0;
93    if (count2 == 1 && count3 == 1) {
94      count2 = 0;
95      count3 = 0;
96      count6 = 1;
97    }
98    // Combine 3 and 4 to 2 and 6 if both are present
99    if (count3 == 1 && count4 == 1) {
100      count2 = 1;
101      count6 = 1;
102      count3 = 0;
103      count4 = 0;
104    }
105    return Map.of(2, count2, 3, count3, 4, count4, 5, count.get(5), 6, count6, 7, count.get(7), 8,
106                  count8, 9, count9);
107  }
108
109  private String construct(Map<Integer, Integer> factors) {
110    StringBuilder sb = new StringBuilder();
111    for (int digit = 2; digit < 10; ++digit)
112      sb.append(String.valueOf(digit).repeat(factors.get(digit)));
113    return sb.toString();
114  }
115
116  // Returns true if a is a subset of b.
117  private boolean isSubset(Map<Integer, Integer> a, Map<Integer, Integer> b) {
118    for (Map.Entry<Integer, Integer> entry : a.entrySet())
119      if (b.get(entry.getKey()) < entry.getValue())
120        return false;
121    return true;
122  }
123
124  // Returns a - b.
125  private Map<Integer, Integer> subtract(Map<Integer, Integer> a, Map<Integer, Integer> b) {
126    Map<Integer, Integer> res = new HashMap<>(a);
127    for (Map.Entry<Integer, Integer> entry : b.entrySet()) {
128      final int key = entry.getKey();
129      final int value = entry.getValue();
130      res.put(key, Math.max(0, res.get(key) - value));
131    }
132    return res;
133  }
134
135  // Returns the sum of the values in `count`.
136  private int sumValues(Map<Integer, Integer> count) {
137    return count.values().stream().mapToInt(Integer::intValue).sum();
138  }
139}`

## 📅 Solved On

2026-08-08

---
*Auto-pushed by [CodePush Extension](https://github.com)*
