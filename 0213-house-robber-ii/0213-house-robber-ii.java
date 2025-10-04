class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        if (n == 2) return Math.max(nums[0], nums[1]);
        int[] arr1 = Arrays.copyOfRange(nums, 0, n-1);
        int[] arr2 = Arrays.copyOfRange(nums, 1, n);
        int[] dp1 = new int[n+1];
        int[] dp2 = new int[n+1];

        int first = helper(arr1, dp1, arr1.length-1);
        int second = helper(arr2, dp2, arr2.length-1);
        return Math.max(first,second);

    }
    public int helper(int[] nums, int[] dp, int idx){
        int n = nums.length;
        if(n==1) return nums[0];
        
        dp[0] = 0;
        dp[1] = nums[0];

        for(int i=2; i<=n; i++){
            int steal = nums[i-1] + dp[i-2];
            int skip = dp[i-1];
            dp[i] = Math.max(steal, skip);
        }

        return dp[n];
    }
}