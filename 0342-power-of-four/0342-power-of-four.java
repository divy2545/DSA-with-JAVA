class Solution {
    private boolean helper(int num){
        if(num == 1) return true;
        if(num == 0 || num%4 != 0) return false;

        return helper(num/4);
    }
    public boolean isPowerOfFour(int n) {
        if(n <= 0) return false;

        return helper(n);
    }
}