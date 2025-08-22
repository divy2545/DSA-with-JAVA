class Solution {
    public int mostFrequentEven(int[] nums) {
        HashMap<Integer,Integer> mp = new HashMap<>();
        for(int num: nums){
            if(num%2==0){
                mp.put(num, mp.getOrDefault(num, 0)+1);
            }
        }

        int ans = -1;
        int max = Integer.MIN_VALUE;

        for(int num: mp.keySet()){
            if(mp.get(num) > max){
                max = mp.get(num);
                ans = num;
            }
            else if(mp.get(num) == max){
                if(ans > num) ans = num;
            }
        }

        return ans;

    }
}