class Solution {
    private int[] dp;

    public int fib(int n) {
        dp = new int[n + 1];
        // initialize with -1
        for (int i = 0; i <= n; i++) {
            dp[i] = -1;
        }
        return solve(n);
    }

    private int solve(int n) {
        if (n <= 1) return n;
        if (dp[n] != -1) return dp[n];
        return dp[n] = solve(n - 1) + solve(n - 2);
    }
}
