class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] suffMin = new int[n];
        
        // Step 1: Precompute the suffix minimums from right to left
        suffMin[n - 1] = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suffMin[i] = Math.min(nums[i], suffMin[i + 1]);
        }
        
        // Step 2: Track prefix maximums from left to right and find the first stable index
        int prefMax = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            prefMax = Math.max(prefMax, nums[i]);
            
            // Instability score condition: max(nums[0..i]) - min(nums[i..n-1]) <= k
            if (prefMax - suffMin[i] <= k) {
                return i;
            }
        }
        
        return -1;
    }
}
