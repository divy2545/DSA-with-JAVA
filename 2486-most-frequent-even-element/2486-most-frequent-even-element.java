class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num: nums){
            if(num%2==0){
                mp.put(num, mp.getOrDefault(num, 0)+1);
            }
        }

        if(mp.isEmpty()) return -1;

        int ans = -1;
        int maxFreq = Integer.MIN_VALUE;

        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            int num = entry.getKey();
            int freq = entry.getValue();

            if (freq > maxFreq || (freq == maxFreq && num < ans)) {
                maxFreq = freq;
                ans = num;
            }
        }

        return ans;

    }
}