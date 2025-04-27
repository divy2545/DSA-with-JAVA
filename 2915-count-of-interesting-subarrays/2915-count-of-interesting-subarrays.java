class Solution {
    public long countInterestingSubarrays(List<Integer> nums, int m, int k) {
        int n = nums.size();
        int[] prefixSum = new int[n];

        for(int i=0; i<n; i++){
             if(nums.get(i)%m == k) prefixSum[i] = 1;
             else prefixSum[i] = 0;
        }

        HashMap<Integer, Long> mp = new HashMap<>();
        int sum = 0;
        long result = 0;

        mp.put(0,1L);

        for(int i=0; i<n; i++){
           sum+=prefixSum[i];

           int r1 = sum % m;
           int r2 = (r1 - k +m) % m;

           if(mp.containsKey(r2)){
            result += mp.get(r2);
           }

           mp.put(r1, mp.getOrDefault(r1, 0L)+1);
        }
       
        return result;
    }
}