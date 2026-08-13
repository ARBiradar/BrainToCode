/**
 * LeetCode 2213 - Longest Substring of One Repeating Character
 *
 * Same asymptotic complexity as a recursive segment tree: O((n + k) log n).
 * The wins here are all constant-factor / engineering ones:
 *
 *   1. Iterative bottom-up build + iterative point update -> no recursion,
 *      no stack frames, tighter loops.
 *   2. Self-contained merge: each node stores its own leftmost/rightmost
 *      char, so pushUp needs nothing external (no l/r/mid, no shared cs[]
 *      lookups). Makes the merge a pure function of the two children.
 *   3. No-op updates (character doesn't actually change) are skipped
 *      entirely instead of walking log(n) nodes for nothing.
 *   4. Padding leaves (when n isn't a power of two) are treated as an
 *      explicit identity element via len == 0, so the merge logic stays
 *      branch-simple and correct without special-casing tree edges.
 */
class Solution {

    private int size;                  // next power of two >= n
    private int[] len, pre, suf, best;
    private char[] lc, rc;             // boundary chars of each segment
    private char[] cs;                 // current string state

    public int[] longestRepeating(String s, String queryCharacters, int[] queryIndices) {
        int n = s.length();
        cs = s.toCharArray();

        size = 1;
        while (size < n) size <<= 1;

        int cap = size << 1;
        len = new int[cap];
        pre = new int[cap];
        suf = new int[cap];
        best = new int[cap];
        lc = new char[cap];
        rc = new char[cap];

        for (int i = 0; i < n; i++) {
            int node = size + i;
            len[node] = pre[node] = suf[node] = best[node] = 1;
            lc[node] = rc[node] = cs[i];
        }
        // leaves [size + n, 2*size) stay len == 0 -> identity element,
        // no need to touch them at all.

        for (int node = size - 1; node >= 1; node--) {
            pushUp(node);
        }

        int k = queryIndices.length;
        int[] ans = new int[k];
        for (int q = 0; q < k; q++) {
            int i = queryIndices[q];
            char c = queryCharacters.charAt(q);

            if (cs[i] != c) {           // skip genuinely no-op updates
                cs[i] = c;
                int node = size + i;
                lc[node] = rc[node] = c;
                for (node >>= 1; node >= 1; node >>= 1) {
                    pushUp(node);
                }
            }
            ans[q] = best[1];
        }
        return ans;
    }

    private void pushUp(int node) {
        int l = node << 1, r = l | 1;
        int lenL = len[l], lenR = len[r];
        len[node] = lenL + lenR;

        if (lenL == 0) {                       // left child is padding
            pre[node] = pre[r]; suf[node] = suf[r]; best[node] = best[r];
            lc[node] = lc[r];   rc[node] = rc[r];
            return;
        }
        if (lenR == 0) {                       // right child is padding
            pre[node] = pre[l]; suf[node] = suf[l]; best[node] = best[l];
            lc[node] = lc[l];   rc[node] = rc[l];
            return;
        }

        lc[node] = lc[l];
        rc[node] = rc[r];

        boolean merges = rc[l] == lc[r];

        pre[node] = (pre[l] == lenL && merges) ? lenL + pre[r] : pre[l];
        suf[node] = (suf[r] == lenR && merges) ? lenR + suf[l] : suf[r];

        best[node] = Math.max(best[l], best[r]);
        if (merges) {
            best[node] = Math.max(best[node], suf[l] + pre[r]);
        }
    }
}