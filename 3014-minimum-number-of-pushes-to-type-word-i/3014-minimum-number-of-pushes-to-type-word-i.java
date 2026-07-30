class Solution {
    public int minimumPushes(String word) {
        int num = word.length();
        int sum = 0;
        for(int i = 0; i < num; i++){
            if(i < 8){
                sum += 1;

            }else if(i<16){
                sum += 2;
            }else if(i <24){
                sum += 3;
            }
            else{
                sum += 4;
            }
        }
        return sum;
    }
}