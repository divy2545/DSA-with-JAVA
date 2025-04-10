class Solution {

    public int helper(int[] nums, int k) {
        int ans = 0;
        int left = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int right = 0; right < nums.length; right++) {
            mp.put(nums[right], mp.getOrDefault(nums[right], 0) + 1);

            while (mp.size() > k) {
                mp.put(nums[left], mp.get(nums[left]) - 1);
                if (mp.get(nums[left]) == 0){
                    mp.remove(nums[left]);
                    }

                left++;
            }

                
                ans += (right - left + 1);
        }

        return ans;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {

        return helper(nums, k) - helper(nums, k - 1);

    }
}