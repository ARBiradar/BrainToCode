import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans =  {-1,-1};
       for(int i =0; i< nums.length; i++){

        ans[0] = i;
        for(int j = i+1; j< nums.length; j++){
            if(target == nums[i] + nums[j] ){
                ans[1] = j;
                return ans;
            }
        }
       }
       return ans;
    }
}
