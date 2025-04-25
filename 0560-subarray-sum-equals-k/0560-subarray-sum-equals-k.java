class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int ans  = 0;
        
        int prefixSum = 0;
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            prefixSum += nums[i];
            if(prefixSum == k) ans++;
            int val = prefixSum - k;
            if(mp.containsKey(val)){
                ans += mp.get(val);
            }
            mp.put(prefixSum, mp.getOrDefault(prefixSum, 0)+1);

        }

        return ans;
    }
}