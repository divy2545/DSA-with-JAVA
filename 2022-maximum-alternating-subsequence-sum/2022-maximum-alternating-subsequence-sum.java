class Solution {
    public long solve(int idx, int[] nums, int flag, long[][] dp){
        if(idx >= nums.length) return 0;
        if(dp[idx][flag] != -1) return dp[idx][flag];
        long notTake = solve(idx+1, nums, flag, dp);

        long val = nums[idx];
        if(flag == 0){
            val = -val;
        }

        long take = solve(idx+1, nums, 1-flag, dp) + val;
        return dp[idx][flag] = Math.max(notTake, take);
    }
    public long maxAlternatingSum(int[] nums) {
        int flag = 1;
        int idx = 0;
        long[][] dp = new long[nums.length+1][2];

        for(int i=0; i<=nums.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return solve(0, nums, flag, dp);
    }
}