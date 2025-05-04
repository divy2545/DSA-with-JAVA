class Solution {
    public boolean canJump(int[] nums) {
        int maxIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(i > maxIdx) return false;
            maxIdx = Math.max(maxIdx, nums[i]+i);
            if(maxIdx == nums.length-1) break;
        }

        return true;
        
    }
}