class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long ans = 0;

        int left = 0, right = 0;

        while (right < nums.length) {
            if (nums[right] == 0) {
                left = right;
                while (right < nums.length && nums[right] == 0  ) {
                    right++;
                }
                long len = right - left;
                ans += (len * (len + 1)) / 2;
            }

            right++;
        }

        return ans;
    }
}