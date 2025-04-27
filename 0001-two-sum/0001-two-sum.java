class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> mp = new HashMap<>();

        int[] ans = new int[2];

        for(int i=0; i<n; i++){
            int diff = target - nums[i];

            if(mp.containsKey(diff)){
                ans[0] = mp.get(diff);
                ans[1] = i;
                break;
            }

            mp.put(nums[i], i);
        }

        return ans;

    }
}