class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int num : nums) {
            mp.put(num, mp.getOrDefault(num, 0) + 1);
        }

        // PriorityQueue with custom comparator
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.getValue().equals(b.getValue())) {
                    return b.getKey() - a.getKey(); // value descending if freq equal
                }
                return a.getValue() - b.getValue(); // freq ascending
            }
        );

        // Add all entries to the heap
        pq.addAll(mp.entrySet());

        int[] ans = new int[nums.length];
        int k = 0;

        // Poll from heap and expand
        while (!pq.isEmpty()) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            for (int i = 0; i < entry.getValue(); i++) {
                ans[k++] = entry.getKey();
            }
        }

        return ans;
    }
}
