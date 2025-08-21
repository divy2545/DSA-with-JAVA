class Solution {
    public int[] numberOfPairs(int[] nums) {
        int pairs = 0, len = nums.length, leftovers = len;
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            if (s.contains(n)){
                pairs++;
                leftovers -= 2;
                s.remove(n);
            } else s.add(n);
        }
        return new int[]{pairs,leftovers};
    }
}