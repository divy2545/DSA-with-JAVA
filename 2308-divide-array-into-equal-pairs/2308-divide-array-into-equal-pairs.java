class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int num: nums){
            mp.put(num, mp.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : mp.entrySet()){
            if(entry.getValue()%2!=0) return false;
        }

        return true;
    }
}