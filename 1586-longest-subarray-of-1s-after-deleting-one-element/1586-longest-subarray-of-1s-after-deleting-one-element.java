class Solution {
    public int longestSubarray(int[] nums) {

        int left = 0, right = 0;
        int count = 0;
        int maxlength = 0;

        while (right < nums.length) {
            if (nums[right] == 1) {
                right++;

            }
            else {
                count++;
                while (count > 1) {
                    if (nums[left] == 0) {
                        count--;
                    }
                    left++;
                }
                right++;
            }
            maxlength = Math.max(maxlength, right - left - 1);
        }

        return maxlength;
    }
}


