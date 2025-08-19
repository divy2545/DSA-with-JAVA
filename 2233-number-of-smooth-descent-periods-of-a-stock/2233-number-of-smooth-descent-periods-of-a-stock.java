class Solution {
    public long getDescentPeriods(int[] prices) {
        long ans = prices.length;

        for(int i=0; i<prices.length-1; i++){
            if(prices[i]-1 == prices[i+1]){
                int left = i;
                i++;
                while( i+1< prices.length && prices[i]-1 == prices[i+1]){
                    i++;
                }
                long len = i - left;
                ans += (len * (len+1))/2;
            }
        }

        return ans;
    }
}