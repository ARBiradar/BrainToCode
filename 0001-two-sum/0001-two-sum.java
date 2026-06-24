import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans =  {-1};
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            int partner = target - nums[i];
            if(!map.containsKey(partner)){
                 map.put(nums[i],i);
            }
            else{ 
                ans = new int[]{map.get(partner), i};
                return ans;
            }
           
        }
        return ans; // not necessary per constraints, but good practice
    }
}
