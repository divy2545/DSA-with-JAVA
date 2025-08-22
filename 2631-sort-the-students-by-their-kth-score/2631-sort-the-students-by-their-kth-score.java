class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        List<int[]> list = new ArrayList<>();

        int m = score.length;
        int n = score[0].length;

        for(int i=0; i<m; i++){
            list.add(new int[]{score[i][k], i});
        }

        list.sort((a,b)->b[0]-a[0]);

        int[][] ans = new int[m][n];

        int i=0;
        for(int[] arr: list){
            for(int col=0; col<n; col++){
                 ans[i][col] = score[arr[1]][col];
            }
            i++;
        }

        return ans;
        
    }
}