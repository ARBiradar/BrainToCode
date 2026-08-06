import java.util.Collections;
class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> al = new ArrayList<>();
        int max = 0;
        for(int i = arr.length -1; i>=0; i--){
            if(arr[i] > max ){
                al.add(arr[i]);
                max = arr[i];
            }
        }
        al.sort( (a, b) -> { return -1 * a.compareTo(b); } );
        
        return al;
    }
    
    
}
