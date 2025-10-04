class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] arr1 = Arrays.copyOfRange(nums, 0, n-1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        int[] dp1 = new int[n-1];
        int[] dp2 = new int[n-1];
         Arrays.fill(dp1, -1);
        Arrays.fill(dp2, -1);

        int first = helper(arr1, dp1, arr1.length-1);
        int second = helper(arr2, dp2, arr2.length-1);
        return Math.max(first,second);

    }
    public int helper(int[] nums, int[] dp, int idx){
        if(idx == 0) return nums[0];
        if(idx < 0) return 0;
        if(dp[idx] != -1) return dp[idx];

        int pick = nums[idx] + helper(nums, dp, idx-2);
        int notPick = 0 + helper(nums, dp, idx-1);

        dp[idx] = Math.max(pick, notPick);

        return Math.max(pick, notPick);

    }
}