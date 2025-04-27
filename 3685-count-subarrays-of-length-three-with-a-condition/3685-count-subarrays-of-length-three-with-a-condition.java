class Solution {
    public int countSubarrays(int[] nums) {
        int n = nums.length;
        int count = 0;

        int left = 0;
        int right = left+2;

        while(right<n){
            int sum = nums[left] + nums[right];
            int half;
            
            half = nums[left+1]/2;
        
            if(nums[left+1]%2==0){
            if(sum == half) count++;
            }

            left++;
            right++;
        }

        return count;
    }
}