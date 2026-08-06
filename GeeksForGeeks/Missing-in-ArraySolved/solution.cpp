class Solution {
    int missingNum(int arr[]) {
        // code here
        
        long n2 = arr.length+1  ;
        
        long numSum =  (n2 * (n2+1)/2);
        long missNumSum = 0;
        for(int num: arr){
            missNumSum = missNumSum + num;
        }
        return (int)(numSum - missNumSum);
        
        
       
        
    }
}