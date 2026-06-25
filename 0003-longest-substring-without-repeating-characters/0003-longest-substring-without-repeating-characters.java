class Solution {
    public int lengthOfLongestSubstring(String s) {

    int n = s.length();
        int maxLength = 0;
        
        // Array to store the last seen index of each character.
        // 128 covers all standard ASCII characters (letters, numbers, symbols).
        int[] lastSeen = new int[128];
        
        // Initialize the array with -1 to indicate the character hasn't been seen yet
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }
        
        int left = 0; // Left boundary of our sliding window
        
        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            
            // If we've seen this character before AND it falls inside our current window...
            if (lastSeen[currentChar] >= left) {
                // Shrink the window by jumping 'left' right past the old occurrence
                left = lastSeen[currentChar] + 1;
            }
            
            // Update/Record the character's newest position
            lastSeen[currentChar] = right;
            
            // Calculate current window size and track the maximum
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}