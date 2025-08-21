class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        HashMap<Integer,Integer> mp = new HashMap<>();

        for(int num: nums){
            mp.put(num, mp.getOrDefault(num,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        int i=0;
        for(Map.Entry<Integer, Integer> entry : list){
            if(i < k){
                ans[i++] = entry.getKey();
            }
        }

        return ans;

    }
}