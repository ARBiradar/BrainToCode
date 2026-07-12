class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          int i = m - 1; // Pointer for the end of the actual elements in nums1
    int j = n - 1; // Pointer for the end of nums2
    int k = m + n - 1; // Pointer for the end of the merged array

    while (i >= 0 && j >= 0) {
        if (nums1[i] > nums2[j]) {
            nums1[k] = nums1[i];
            i--;
        } else {
            nums1[k] = nums2[j];
            j--;
        }
        k--;
    }

    // Copy any remaining elements from nums2 into nums1
    while (j >= 0) {
        nums1[k] = nums2[j];
        j--;
        k--;
    }
    }
    
}