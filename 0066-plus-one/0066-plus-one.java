class Solution {
    public int[] plusOne(int[] digits) {
          for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry, done
            }
            digits[i] = 0; // set to 0 and continue carry
        }
        
        // If all digits were 9, we need a new array
        int[] result = new int[digits.length + 1];
        result[0] = 1; // e.g. 999 + 1 = 1000
        return result;
    }
        
    }
