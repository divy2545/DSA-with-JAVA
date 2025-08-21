class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer, Integer> mp = new HashMap<>();

        for(int i=0; i<nums.length-1; i++){
            if(nums[i]==key){
                mp.put(nums[i+1], mp.getOrDefault(nums[i+1], 0)+1);
            }
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());

        list.sort((a,b)->b.getValue()-a.getValue());

        return list.get(0).getKey();
    }
}