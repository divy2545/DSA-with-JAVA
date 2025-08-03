class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int n = fruits.length;
        int left = 0, right = 0;
        int maxFruits = 0;
        int curSum = 0;

        while(right<n){

            int pos = fruits[right][0];
            curSum += fruits[right][1];

            while(left <= right && !isReachable(fruits[left][0], pos, startPos, k)){
                curSum -= fruits[left][1];
                left++;
            }

            maxFruits = Math.max(curSum, maxFruits);
            right++;

        }

        return maxFruits;
    }

    public boolean isReachable(int left, int right, int start, int k){
        int toLeftThenRight = Math.abs(start-left) + (right - left);
        int toRightThenLeft = Math.abs(start-right) + (right - left);
        return Math.min(toLeftThenRight, toRightThenLeft) <=k;
    }


}