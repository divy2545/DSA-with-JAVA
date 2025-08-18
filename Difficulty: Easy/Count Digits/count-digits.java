// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        String s = Integer.toString(n);
        int ans = 0;
        for(char ch: s.toCharArray()){
            int num = ch - '0';
            if(num != 0){
            if(n%num == 0) ans++;
            }
        }
        
        return ans;
        
    }
}