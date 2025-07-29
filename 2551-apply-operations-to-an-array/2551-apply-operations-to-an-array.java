class Solution {
    public int[] applyOperations(int[] nums) {
        int write = 0;
        
        for (int i = 0; i < nums.length; i++) {
            // Step 1: Merge adjacent duplicates
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }

            // Step 2: Shift non-zero value to the front
            if (nums[i] != 0) {
                nums[write++] = nums[i];
            }
        }

        // Step 3: Fill rest with 0
        while (write < nums.length) {
            nums[write++] = 0;
        }

        return nums;
    }
}
