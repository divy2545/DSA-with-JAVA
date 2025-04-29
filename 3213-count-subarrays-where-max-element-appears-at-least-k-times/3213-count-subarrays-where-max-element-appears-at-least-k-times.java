class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;

        int maxNum = Integer.MIN_VALUE;
        for (int num : nums) {
            maxNum = Math.max(maxNum, num);
        }

        int countMax = 0;
        int left = 0, right=0;
        while(right<n){
            if (nums[right] == maxNum) {
                countMax++;
            }

            while (countMax >= k) {
                ans += n - right;
                if (nums[left] == maxNum) {
                    countMax--;
                }
                left++;
            }
            right++;
        }

        return ans;
    }
}
