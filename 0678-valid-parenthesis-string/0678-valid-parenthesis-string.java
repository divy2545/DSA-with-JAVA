class Solution {
    public boolean checkValidString(String s) {
        int low = 0, high = 0;
        
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                low++;
                high++;
            } else if (ch == ')') {
                if (low > 0) low--;
                high--;
            } else if (ch == '*') {
                // '*' can be '(', ')' or empty
                if (low > 0) low--;
                high++;
            }

            if (high < 0) return false; // too many closing brackets
        }

        return low == 0;
    }
}
