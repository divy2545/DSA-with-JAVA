class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            mp.put( nums[i],mp.getOrDefault(nums[i], 0)+1);
        }

        int ans = 0;

        for(Map.Entry<Integer, Integer> it : mp.entrySet()){
            if(it.getValue() == 1){
               return it.getKey();
            }
       }


       return -1;
    }
}