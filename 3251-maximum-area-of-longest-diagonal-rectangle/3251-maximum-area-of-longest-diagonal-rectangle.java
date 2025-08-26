class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        
        int ans = 1;
        int cnt = Integer.MIN_VALUE;
        for(int i=0; i<dimensions.length; i++){
            int length = dimensions[i][0];
            int breadth = dimensions[i][1];
            int area = length * breadth;
            int diagonalLen = (length*length) + (breadth * breadth);
            if(diagonalLen > cnt ){
                cnt = diagonalLen;
                ans = length * breadth;
            }
            if(diagonalLen == cnt){
                ans = Math.max(area, ans);
            }

        }

        return ans;
    }
}