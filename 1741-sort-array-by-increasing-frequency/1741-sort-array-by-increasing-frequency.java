class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        int[] ans = new int[nums.length];

        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(mp.entrySet());
        list.sort((a, b) -> {
            if (a.getValue() == b.getValue()) {
                return b.getKey() - a.getKey();
            }
            return a.getValue() - b.getValue();
        });

        int k = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).getValue(); j++) {
                ans[k++] = list.get(i).getKey();
            }
        }

        return ans;
    }
}