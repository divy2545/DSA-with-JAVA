class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int[] ans = new int[k];

        PriorityQueue<int[]> heap = new PriorityQueue<>(
            (a,b) -> a[0] - b[0]
        );

        for(int i=0; i<nums.length; i++){
            heap.offer(new int[]{nums[i], i});
            if(heap.size()>k) heap.poll();
        }

        List<int[]> list = new ArrayList<>(heap);

        list.sort((a,b)->a[1]-b[1]);
         
        for(int i=0; i<k; i++){
            ans[i] = list.get(i)[0];
        }

        return ans;
    }
}