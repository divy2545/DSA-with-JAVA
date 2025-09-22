class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);
        }
        int max = 0;
        for (int freq : mp.values()) {
            max = Math.max(max,freq);
        }
        int ans = 0;
        for (int freq : mp.values()) {
            if(freq == max){
                 ans += freq;
            }
        }
        return ans;
    }
}