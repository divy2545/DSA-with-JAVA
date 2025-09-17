class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, -1);
        return helper(nums, dp, nums.length-1);
    }

    public int helper(int[] nums, int[] dp ,int idx){
        if(idx == 0) return nums[idx];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper(nums, dp, idx-2);
        int notPick = 0 + helper(nums, dp, idx-1);
        dp[idx] = Math.max(pick, notPick);
        return Math.max(pick, notPick);
    }
}