# 268. Missing Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-blue) ![Difficulty](https://img.shields.io/badge/Difficulty-Easy-orange) ![Language](https://img.shields.io/badge/Language-1 /*class Solution {
2    public int missingNumber(int[] nums) {
3       Arrays.sort(nums);
4        for(int i =0; i<nums.length; i++){
5            if(nums[i] != i){
6                return i;
7            }
8           
9        }
10        return nums.length;        
11    
12        int n = nums.length;
13        int xor = 0;
14        
15        // XOR all numbers from 0 to n
16        for (int i = 0; i <= n; i++) {
17            xor ^= i;
18        }
19        
20        // XOR all elements in nums
21        for (int num : nums) {
22            xor ^= num;
23        }
24        
25        return xor;/*
26        int i =0;
27        while(i<nums.length){
28            int ans = nums[i];
29            if(nums[i]<nums.length && nums[i] != nums[ans]){
30                swap(nums,i,ans);
31            }else i++;
32        }
33        for(int index = 0; index < nums.length; i++){
34        if(nums[index] != index){
35            return index;
36        }
37        }
38        return nums.length;
39    }
40    public static void swap(int[] arr, int i, int j){
41        int temp = arr[i];
42        arr[i] = arr[j];
43        arr[j] = temp;
44    }*/
45class Solution {
46 public int missingNumber(int[] nums) {
47    int n = nums.length;
48        int sum = n * (n+1)/2;
49        int checkSum = 0;
50        for(int i = 0; i< n; i++){
51            checkSum += nums[i];
52        }
53        return sum-checkSum;
54
55    }
56}
57    /*
58    public void swap(int[] arr, int first, int second){
59        int temp = arr[first];
60        arr[first] = arr[second];
61        arr[second] = temp;
62    }
63
64    public int missingNumber(int[] nums) {
65        int i =0;
66        while(i<nums.length){
67            int correctIndex = nums[i];
68            if(nums[i]<nums.length && nums[i]!=nums[correctIndex]){
69                swap(nums,i,correctIndex);
70            }else i++;
71        } 
72        i =0;
73        while(i<nums.length){
74        if(nums[i]!=i){
75            return i;
76        } else i++;
77        }
78        return nums.length;
79    }
80    */
81
82    
83        
84        
85-green)

## 🧩 Problem Summary

See the original problem on LeetCode

## 💻 Solution

```1 /*class solution {
2    public int missingnumber(int[] nums) {
3       arrays.sort(nums);
4        for(int i =0; i<nums.length; i++){
5            if(nums[i] != i){
6                return i;
7            }
8           
9        }
10        return nums.length;        
11    
12        int n = nums.length;
13        int xor = 0;
14        
15        // xor all numbers from 0 to n
16        for (int i = 0; i <= n; i++) {
17            xor ^= i;
18        }
19        
20        // xor all elements in nums
21        for (int num : nums) {
22            xor ^= num;
23        }
24        
25        return xor;/*
26        int i =0;
27        while(i<nums.length){
28            int ans = nums[i];
29            if(nums[i]<nums.length && nums[i] != nums[ans]){
30                swap(nums,i,ans);
31            }else i++;
32        }
33        for(int index = 0; index < nums.length; i++){
34        if(nums[index] != index){
35            return index;
36        }
37        }
38        return nums.length;
39    }
40    public static void swap(int[] arr, int i, int j){
41        int temp = arr[i];
42        arr[i] = arr[j];
43        arr[j] = temp;
44    }*/
45class solution {
46 public int missingnumber(int[] nums) {
47    int n = nums.length;
48        int sum = n * (n+1)/2;
49        int checksum = 0;
50        for(int i = 0; i< n; i++){
51            checksum += nums[i];
52        }
53        return sum-checksum;
54
55    }
56}
57    /*
58    public void swap(int[] arr, int first, int second){
59        int temp = arr[first];
60        arr[first] = arr[second];
61        arr[second] = temp;
62    }
63
64    public int missingnumber(int[] nums) {
65        int i =0;
66        while(i<nums.length){
67            int correctindex = nums[i];
68            if(nums[i]<nums.length && nums[i]!=nums[correctindex]){
69                swap(nums,i,correctindex);
70            }else i++;
71        } 
72        i =0;
73        while(i<nums.length){
74        if(nums[i]!=i){
75            return i;
76        } else i++;
77        }
78        return nums.length;
79    }
80    */
81
82    
83        
84        
85
            checkSum += nums[i];
        }
        return sum-checkSum;

    }
}
        for(int i = 0; i< n; i++){
        int checkSum = 0;
        int sum = n * (n+1)/2;
    int n = nums.length;

```

## 🏷️ Tags

`LeetCode` `Coding` `1 /*class Solution {
2    public int missingNumber(int[] nums) {
3       Arrays.sort(nums);
4        for(int i =0; i<nums.length; i++){
5            if(nums[i] != i){
6                return i;
7            }
8           
9        }
10        return nums.length;        
11    
12        int n = nums.length;
13        int xor = 0;
14        
15        // XOR all numbers from 0 to n
16        for (int i = 0; i <= n; i++) {
17            xor ^= i;
18        }
19        
20        // XOR all elements in nums
21        for (int num : nums) {
22            xor ^= num;
23        }
24        
25        return xor;/*
26        int i =0;
27        while(i<nums.length){
28            int ans = nums[i];
29            if(nums[i]<nums.length && nums[i] != nums[ans]){
30                swap(nums,i,ans);
31            }else i++;
32        }
33        for(int index = 0; index < nums.length; i++){
34        if(nums[index] != index){
35            return index;
36        }
37        }
38        return nums.length;
39    }
40    public static void swap(int[] arr, int i, int j){
41        int temp = arr[i];
42        arr[i] = arr[j];
43        arr[j] = temp;
44    }*/
45class Solution {
46 public int missingNumber(int[] nums) {
47    int n = nums.length;
48        int sum = n * (n+1)/2;
49        int checkSum = 0;
50        for(int i = 0; i< n; i++){
51            checkSum += nums[i];
52        }
53        return sum-checkSum;
54
55    }
56}
57    /*
58    public void swap(int[] arr, int first, int second){
59        int temp = arr[first];
60        arr[first] = arr[second];
61        arr[second] = temp;
62    }
63
64    public int missingNumber(int[] nums) {
65        int i =0;
66        while(i<nums.length){
67            int correctIndex = nums[i];
68            if(nums[i]<nums.length && nums[i]!=nums[correctIndex]){
69                swap(nums,i,correctIndex);
70            }else i++;
71        } 
72        i =0;
73        while(i<nums.length){
74        if(nums[i]!=i){
75            return i;
76        } else i++;
77        }
78        return nums.length;
79    }
80    */
81
82    
83        
84        
85`

## 📅 Solved On

2026-08-20

---
*Auto-pushed by [CodePush Extension](https://github.com)*
