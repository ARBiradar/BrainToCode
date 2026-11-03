class Solution {
    public int minMoves(int[] nums) 
    {
        
         int n = nums.length;
        int mx = Integer.MIN_VALUE;
        int totalSum = 0;
        
        for (int x : nums) {
            mx = Math.max(mx, x);
            totalSum += x;
        }
        
        return mx * n - totalSum;
    }
}