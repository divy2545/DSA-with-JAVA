class Solution {
    public String largestGoodInteger(String num) {
        String ans = "";
        int maxVal = -1;

        for (int i = 0; i <= num.length() - 3; i++) {
            char ch = num.charAt(i);
            if (num.charAt(i + 1) == ch && num.charAt(i + 2) == ch) {
                int val = Integer.parseInt("" + ch);
                if (val > maxVal) {
                    maxVal = val;
                    ans = num.substring(i, i + 3);
                }
            }
        }
        return ans;
    }
}
