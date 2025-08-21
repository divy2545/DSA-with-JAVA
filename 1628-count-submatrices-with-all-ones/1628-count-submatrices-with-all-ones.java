class Solution {
    public int oneDArray(int[] arr){
        int cons = 0;
        int cnt = 0;
        for(int num: arr){
            if(num == 0) cons = 0;
            else cons++;
            cnt += cons;
        }
        return cnt;
    }
    public int numSubmat(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int res = 0;

        for(int startRow=0; startRow<m; startRow++){
             int[] arr = new int[n];
             Arrays.fill(arr,1);

             for(int endRow=startRow; endRow<m; endRow++){
                    for(int col=0; col<n; col++){
                        arr[col] = arr[col] & mat[endRow][col];
                    }

                    res += oneDArray(arr);

             }

        }

        return res;
    }
}