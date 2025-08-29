class Solution {
    public int subsetXORSum(int[] nums) {
        
        return helper(nums, 0, 0);
    }

    private int helper(int[] nums, int idx, int xor){
        if(idx == nums.length) return xor;
        int withEle = helper(nums, idx+1, xor^nums[idx]);
        int withoutEle = helper(nums, idx+1, xor);
        return withEle + withoutEle;
    }
}