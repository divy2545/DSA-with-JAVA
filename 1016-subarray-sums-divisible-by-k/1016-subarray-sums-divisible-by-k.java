class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        int prefixSum = 0;

        for(int i=0; i<n; i++){
           prefixSum += nums[i];

           int val = prefixSum%k;

           if(val<0) val +=k;

           if(val == 0) ans++;

           if(mp.containsKey(val)){
            ans += mp.get(val);
           }
           mp.put(val, mp.getOrDefault(val, 0)+1);
        }

        return ans;
    }
}