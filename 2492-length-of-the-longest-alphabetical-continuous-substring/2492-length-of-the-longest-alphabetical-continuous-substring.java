class Solution {
    public int longestContinuousSubstring(String s) {
        int ans = 1, cur = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) - s.charAt(i - 1) == 1) {
                cur++;
            } else {
                cur = 1;
            }
            ans = Math.max(ans, cur);
        }

        return ans;
    }
}
