class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        int min = Integer.MAX_VALUE;
        long ans = 0;

        for(int num: basket1){
            mp.put(num, mp.getOrDefault(num, 0)+1);
            min = Math.min(min, num);
        }
        
        for(int num: basket2){
            mp.put(num, mp.getOrDefault(num, 0)-1);
            min = Math.min(min, num);
        }

        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer,Integer> entry :  mp.entrySet()){
            int value = entry.getValue();

            if(value%2 != 0) return -1;

            for(int i=0; i<Math.abs(value)/2; i++){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        for(int i=0; i<list.size()/2; i++){
            ans += Math.min(list.get(i), min*2);
        }

        return ans;

    }
}