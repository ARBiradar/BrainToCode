import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] numbers, int target) {
       /** HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            
            if (map.containsKey(complement)) {
                // Return indices +1 because the problem requires 1-indexed result
                return new int[] { map.get(complement) + 1, i + 1 };
            }
            
            // Store the current number with its index
            map.put(numbers[i], i);
        }
        
        // Problem guarantees exactly one solution, so this line is never reached
        return new int[] {};**/

        
        int left =0;int right = numbers.length-1;
        int[] ans = new int[2];
        while(left<right){
            int sum = numbers[left] + numbers[right];
            if(target == sum){
                ans[0] = left+1;
                ans[1] = right +1 ;
                return ans;
            }else if(sum<target){ 
                left++;
            }
            else {
                right--;
            }
        }
        return ans;
    }
}
