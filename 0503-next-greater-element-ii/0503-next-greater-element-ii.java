class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[n];
        for(int i=((2*n)-2); i>=0; i--){
            while(!st.isEmpty() && nums[i%n] >= st.peek()){
                 st.pop();
            }
           if(i<n){
            if(!st.isEmpty()) ans[i] = st.peek();
            else ans[i] = -1;
           }

           st.push(nums[i%n]);
        }

        return ans;
    }
}