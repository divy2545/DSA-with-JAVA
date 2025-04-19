class Solution {
    public long subArrayRanges(int[] nums) {
       
    int n = nums.length;
    long ans = 0;
        
        Stack<Integer> st = new Stack<Integer>();
        int[] pse = new int[n];
        for(int i=0; i<n; i++){
          while(!st.isEmpty() && nums[st.peek()]>nums[i]){
            st.pop();
          }
          pse[i] = st.isEmpty()? -1 : st.peek();
          st.push(i);
        }

       st.clear();

        int[] nse = new int[n];
        for(int i=n-1; i>=0; i--){
          while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
            st.pop();
          }
          nse[i] = st.isEmpty()? n : st.peek();
          st.push(i);
        }
        st.clear();
        
        long minSum = 0;
        for(int i=0; i<n; i++){
            int left = i - pse[i];
            int right = nse[i] - i;
            minSum += (long)left*right*nums[i];
        }



          int[] pge = new int[n];
        for(int i=0; i<n; i++){
          while(!st.isEmpty() && nums[st.peek()]<nums[i]){
            st.pop();
          }
          pge[i] = st.isEmpty()? -1 : st.peek();
          st.push(i);
        }

       st.clear();

        int[] nge = new int[n];
        for(int i=n-1; i>=0; i--){
          while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
            st.pop();
          }
          nge[i] = st.isEmpty()? n : st.peek();
          st.push(i);
        }
        
        long maxSum = 0;
        for(int i=0; i<n; i++){
            int left = i - pge[i];
            int right = nge[i] - i;
            maxSum += (long)left*right*nums[i];
        }



        return (maxSum - minSum);
    }
}