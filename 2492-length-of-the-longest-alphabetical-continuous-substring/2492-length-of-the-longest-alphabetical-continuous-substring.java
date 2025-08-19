class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 0;
        int len = s.length();

        int[] arr = new int[len];

        for(int i=0; i<len; i++){
            arr[i] = (int)(s.charAt(i) - 'a');
        }

        for(int i=0; i<len; i++){
            int left = i;
            while(i+1 < len && arr[i]+1 == arr[i+1]){
                i++;
            }
            ans = Math.max(ans, i-left+1);
        }

        return ans;
    }
}