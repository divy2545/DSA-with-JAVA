class Solution {
    public int[] numberOfPairs(int[] nums) {
        HashMap<Integer,Integer> mp= new HashMap<>();
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        int pairs = 0;
        int leftOvers = 0;

        for(Map.Entry<Integer,Integer> entry: mp.entrySet()){
            pairs += entry.getValue()/2;
            leftOvers += entry.getValue()%2;
        }
        
        return new int[]{pairs, leftOvers};
    }
}