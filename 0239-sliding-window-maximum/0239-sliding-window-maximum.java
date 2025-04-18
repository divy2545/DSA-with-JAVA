class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int a = 0;
        

        for (int i = 0; i < nums.length; i++) {

            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]){
                dq.removeLast();
            }

            dq.addLast(i);

            if(i >= k-1){
                ans[a++] = nums[dq.peekFirst()];
            }

        }
       
        return ans;

    }
}