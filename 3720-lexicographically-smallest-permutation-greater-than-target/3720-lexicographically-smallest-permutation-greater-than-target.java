class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int n = s.length();
        int[] freq = new int[26];

        // Count characters of s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder ans = new StringBuilder();

        // Try to match target character by character
        for (int i = 0; i < n; i++) {
            int curr = target.charAt(i) - 'a';

            if (freq[curr] > 0) {
                ans.append(target.charAt(i));
                freq[curr]--;
            } else {
                // Cannot match target[i].
                // Find smallest available character > target[i]
                int greater = findGreater(freq, curr);

                if (greater != -1) {
                    ans.append((char) ('a' + greater));
                    freq[greater]--;

                    appendRemaining(ans, freq);
                    return ans.toString();
                }

                // Need to backtrack
                break;
            }
        }

        /*
         * If ans == target or matching failed,
         * backtrack from right to left.
         */
        while (ans.length() > 0) {
            int last = ans.charAt(ans.length() - 1) - 'a';

            // Put removed character back
            freq[last]++;
            ans.deleteCharAt(ans.length() - 1);

            // Find smallest character greater than this character
            int greater = findGreater(freq, last);

            if (greater != -1) {
                ans.append((char) ('a' + greater));
                freq[greater]--;

                appendRemaining(ans, freq);
                return ans.toString();
            }
        }

        return "";
    }

    // Find the smallest available character greater than x
    private int findGreater(int[] freq, int x) {
        for (int i = x + 1; i < 26; i++) {
            if (freq[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    // Append remaining characters in sorted order
    private void appendRemaining(StringBuilder ans, int[] freq) {
        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                ans.append((char) ('a' + i));
                freq[i]--;
            }
        }
    }
}