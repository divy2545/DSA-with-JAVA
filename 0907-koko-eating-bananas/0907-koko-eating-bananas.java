class Solution {

    public int calcTotalHours(int[] piles, int hourly){
        int totalHour = 0;
        for(int i=0; i<piles.length; i++){
            totalHour += Math.ceil((double)piles[i]/(double)hourly);
        }
        return totalHour;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int maxEle = Integer.MIN_VALUE;
        for(int num: piles){
            maxEle = Math.max(maxEle, num);
        }

        int low = 1, high = maxEle;
        int ans = Integer.MAX_VALUE;

        while(low <= high){
            int mid = low + (high-low)/2;
            int totalHours = calcTotalHours(piles, mid);
            if(totalHours <= h){
                ans = Math.min(ans, mid);
                high = mid-1;
            }
            else{
                low = mid+1;
            }

        }

        return ans;

    }
}