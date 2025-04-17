class Solution {
    public int sumSubarrayMins(int[] arr) {
        int sum = 0;
        int mod = (int) (1e9 + 7);

        Stack<Integer> st = new Stack<>();

        int[] pse = new int[arr.length];
        int[] nse = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st.clear();

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? arr.length : st.peek();
            st.push(i);
        }

        for (int i = 0; i < arr.length; i++) {
            int left = i - pse[i];
            int right = nse[i] - i;
            long contribution = ((long) left * right) % mod;
            contribution = (contribution * arr[i]) % mod;
            sum = (int) ((sum + contribution) % mod);
        }

        return sum;
    }
}