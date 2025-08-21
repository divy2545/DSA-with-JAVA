class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == key) {
                mp.put(nums[i + 1], mp.getOrDefault(nums[i + 1], 0) + 1);
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = -1;

        for (int ele : mp.keySet()) {
            if (mp.get(ele) > max) {
                max = mp.get(ele);
                ans = ele;
            }
        }

        return ans;

    }
}