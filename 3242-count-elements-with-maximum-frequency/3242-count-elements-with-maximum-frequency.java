class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int max = 0;
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
            if(mp.get(nums[i]) > max) max = mp.get(nums[i]);
        }
        int ans = 0;
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if(entry.getValue() == max){
                 ans += entry.getValue();
            }
        }
        return ans;
    }
}