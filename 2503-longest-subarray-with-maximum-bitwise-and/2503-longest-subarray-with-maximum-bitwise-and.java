class Solution {
    public int longestSubarray(int[] nums) {
        

        int max = Integer.MIN_VALUE;
        int cnt = 0;
        int ans = 0;

        for(int i=0; i<nums.length; i++){
            max = Math.max(nums[i], max);
        }

        for (int num : nums) {
            if (num == max) {
                cnt++;
                ans = Math.max(ans, cnt);
            } else {
                cnt = 0; // reset streak
            }
        }
        
        return ans;
    }
}