class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        int product = 1;
        int zero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0) product*=nums[i];
            else zero++;
        }

        for(int i=0; i<nums.length; i++){
            if(zero == 1){
                if(nums[i]!=0) ans[i]=0;
                else ans[i] = product;
            }
            else if(zero >1){
                return ans;
            }
            else{
                ans[i] = product/nums[i];
            }
        }
        return ans;
    }
}