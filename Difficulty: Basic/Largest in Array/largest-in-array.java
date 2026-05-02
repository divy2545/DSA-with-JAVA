class Solution {
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int curr = Integer.MIN_VALUE;
        for( int i = 0; i < arr.length; i++){
            int val = arr[i];
            if (val > curr){
                curr = val;
                largest = val;
            }
        }
        return largest;
        
    }
}
