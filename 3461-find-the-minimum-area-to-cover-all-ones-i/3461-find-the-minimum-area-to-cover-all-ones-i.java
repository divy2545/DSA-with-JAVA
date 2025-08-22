class Solution {
    public int minimumArea(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int minCol = Integer.MAX_VALUE;
        int maxCol = Integer.MIN_VALUE;

        int minRow = Integer.MAX_VALUE;
        int maxRow = Integer.MIN_VALUE;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
               if(grid[i][j]==1){
                minRow = Math.min(minRow, i);
                minCol = Math.min(minCol, j);
                maxRow = Math.max(maxRow, i);
                maxCol = Math.max(maxCol, j);
               }
            }
        }

        int colLength = maxCol - minCol + 1;
        int rowLength = maxRow - minRow + 1;

        return rowLength * colLength;
    }
}