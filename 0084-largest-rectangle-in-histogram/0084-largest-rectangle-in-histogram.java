class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> st= new Stack<>();
        int[] pse = new int[n];
        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                 st.pop();
            }
            pse[i] = st.isEmpty()? -1 : st.peek();
            st.push(i);
        }

        st.clear();
        
        int[] nse = new int[n];
        for(int i=n-1; i>=0; i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                 st.pop();
            }
            nse[i] = st.isEmpty()? n : st.peek();
            st.push(i);
        }

        int max = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            int area = heights[i] * (nse[i]-pse[i]-1);
            max = Math.max(max, area);
        }

        return max;

    }
}