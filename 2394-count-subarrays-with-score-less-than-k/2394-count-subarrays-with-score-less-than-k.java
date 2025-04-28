class Solution {
    public long countSubarrays(int[] nums, long k) {
        int n = nums.length;
        long ans = 0;

        int left = 0, right = 0;
        long sum = 0;

        while(right<n){
            sum += nums[right];
            long score = sum * (right-left+1);
            while(left<=right && score>=k){
                sum-=nums[left];
                left++;
                score = sum * (right-left+1);
            }

            ans += (right-left+1);
            right++;
        }
        
        return ans;
    }
}