class Solution {

    public int Area(int[] heights){
        int n = heights.length;
        Stack<Integer> st= new Stack<>();

        int maxArea = Integer.MIN_VALUE;

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && heights[st.peek()]>heights[i]){
                int ele = heights[st.pop()];
                int nse = i;
                int pse = st.isEmpty()? -1 : st.peek();
                maxArea = Math.max(ele * (nse-pse-1), maxArea); 
            }
            st.push(i);
        }

        while(!st.isEmpty()){
              int ele = heights[st.pop()];
              int nse = n;
              int pse = st.isEmpty()? -1 : st.peek();
              maxArea = Math.max(ele * (nse-pse-1), maxArea); 
        }

        return maxArea;

    }


    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] prefixSum = new int[m][n];
        for(int i=0; i<n; i++){
            int sum=0;
            for(int j=0; j<m; j++){
                int val = matrix[j][i] - '0';
                sum+=val;
                if(val==0) sum=0;
                prefixSum[j][i]=sum;
            }
        }

        int ans =0;
        for(int i=0; i<m; i++){
            ans = Math.max(Area(prefixSum[i]), ans);
        }

        return ans;

    }
    }
