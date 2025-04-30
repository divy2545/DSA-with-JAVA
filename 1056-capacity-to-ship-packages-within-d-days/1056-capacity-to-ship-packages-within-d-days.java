class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int n = weights.length;

        int maxEle = Integer.MIN_VALUE;
        int sum = 0;

        for(int num : weights){
            maxEle = Math.max(num, maxEle);
            sum += num;
        }

        int left = maxEle, right = sum;
        int ans = -1;

        while(left <= right){
            int mid = left + (right-left)/2;
            int daysRequired = func(weights, mid);
            if(daysRequired <= days){
                ans = mid;
                right = mid-1; 
            }
            else{
               left = mid+1;
            }
        }

        return ans;
        
    }


    public int func(int[] w, int capacity){
        int days = 1, load = 0;
        for(int i=0; i<w.length; i++){
            if(load+w[i] > capacity){
                days = days + 1;
                load = w[i];
            }
            else{
                load += w[i];
            }
        }

        return days;
    }
}