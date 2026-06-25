import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int maxLength = 0;
        int j = 0; // left pointer of window

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // If character already seen, move left pointer
            if (mp.containsKey(ch)) {
                j = Math.max(j, mp.get(ch) + 1);
            }

            // Update last seen index of current character
            mp.put(ch, i);

            // Update max length
            maxLength = Math.max(maxLength, i - j + 1);
        }

        return maxLength;
    }
}
