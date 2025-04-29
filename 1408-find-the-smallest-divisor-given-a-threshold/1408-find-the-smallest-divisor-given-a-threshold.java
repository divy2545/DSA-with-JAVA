class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
       int n = nums.length;

       int maxVal = Integer.MIN_VALUE;
       for(int num: nums){
            maxVal = Math.max(maxVal,num);
       }

       int left = 1, right = maxVal;
       int ans = Integer.MAX_VALUE;

       while(left<=right){
        int mid = left + (right-left)/2;

          if(DivisorResultLessThanThreshold(nums, threshold, mid)){
           ans = Math.min(ans, mid);
           right = mid-1;
          }
          else{
            left = mid + 1;
          }
       }

       return ans;
        
    }

    public boolean DivisorResultLessThanThreshold(int[] nums, int threshold, int divisor){
        int sum = 0;

        for(int i=0; i<nums.length; i++){
           sum += (nums[i] + divisor -1)/divisor; // optimised way to calculate ceiling of a value

           if(sum>threshold) return false;
        }
        
        return sum <= threshold;
    }
}