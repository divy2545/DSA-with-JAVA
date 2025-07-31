class Solution {
    public int longestNiceSubarray(int[] nums) {
        int left = 0, right = 1;
        int ans = 1;
        int xorSum = nums[0];
        int currSum = nums[0];
        while(right<nums.length){
             xorSum ^=nums[right];
             currSum += nums[right];

             while(xorSum != currSum){
                 xorSum ^=nums[left];
             currSum -= nums[left];
             left++;
             }

             ans = Math.max(ans, right-left+1);
             right++;

        }

        return ans;
    }
}