class Solution {
    public int percentageLetter(String s, char letter) {
        int cnt = 0;
        for(char ch: s.toCharArray()){
            if(ch == letter) cnt++;
        }

        int res = (int)(cnt*100.0)/s.length();

        return res;
    }
}