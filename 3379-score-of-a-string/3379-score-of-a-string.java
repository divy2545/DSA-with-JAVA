class Solution {
    public int scoreOfString(String s) {
        int ans = 0;
        for(int i=1; i<s.length(); i++){
            ans += Math.abs(Math.abs(s.charAt(i-1)-'a')-Math.abs(s.charAt(i)-'a'));
        }

        return ans;
    }
}