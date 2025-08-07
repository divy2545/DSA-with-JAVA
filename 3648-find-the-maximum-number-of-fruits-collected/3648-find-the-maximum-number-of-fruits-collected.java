class Solution {
    int n;
    int[][] fruits;
    int[][] dp1;
    int[][] dp2;

    public int solveBottomLeft(int i, int j){
        if(i==n-1 && j==n-1) return 0;
        if(j >= i) return 0;
        if(dp1[i][j] != -1) return dp1[i][j];

        int  maxFruits = 0;
        int collectedFruits = fruits[i][j];
        if(i-1 >=0) maxFruits = Math.max(maxFruits, collectedFruits + solveBottomLeft(i-1, j+1));
        if(j+1 < n) maxFruits = Math.max(maxFruits, collectedFruits + solveBottomLeft(i, j+1));
        if(i+1 < n) maxFruits = Math.max(maxFruits, collectedFruits + solveBottomLeft(i+1, j+1));

        return dp1[i][j] = maxFruits;
    }

    public int solveTopRight(int i, int j){
        if(i==n-1 && j==n-1) return 0;
        if(i >= j) return 0;
        if(dp2[i][j] != -1) return dp2[i][j];

        int  maxFruits = 0;
        int collectedFruits = fruits[i][j];
        if(j-1 >=0) maxFruits = Math.max(maxFruits, collectedFruits + solveTopRight(i+1, j-1));
        if(i+1 < n) maxFruits = Math.max(maxFruits, collectedFruits + solveTopRight(i+1, j));
        if(j+1 < n) maxFruits = Math.max(maxFruits, collectedFruits + solveTopRight(i+1, j+1));

        return dp2[i][j] = maxFruits;
    }


    public int maxCollectedFruits(int[][] fruits) {
        this.n = fruits.length;
        this.fruits = fruits;
        this.dp1 = new int[n][n];
        this.dp2 = new int[n][n];
        
        for(int[] row : dp1) Arrays.fill(row, -1);
        for(int[] row : dp2) Arrays.fill(row, -1);

        int totalFruits = 0;

        for(int i=0; i<n; i++){
            totalFruits += fruits[i][i];
        }

        totalFruits += solveBottomLeft(n-1, 0);
        totalFruits += solveTopRight(0, n-1);

        return totalFruits;

    }
}