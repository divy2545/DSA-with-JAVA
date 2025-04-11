class Solution {
    public String minWindow(String s, String t) {
       int[] hash = new int[256];
       int m = s.length();
       int n = t.length();
       for(int i=0; i<n; i++){
        hash[t.charAt(i)]++;
       }

       int minLen = Integer.MAX_VALUE;
       int startIdx = -1;
       int left = 0, right =0;
       int cnt = 0;

       while(right < m){
          char ch = s.charAt(right);

          if(hash[ch]>0){
             cnt++;
          }
          hash[ch]--;

          while( cnt == n){
            if(right-left+1 < minLen){
                minLen = right-left+1;
                startIdx = left; 
            }
            char leftChar = s.charAt(left);
            hash[leftChar]++;

            if(hash[leftChar]>0) cnt--;

            left++;
          }

          right++;
       }

       return startIdx == -1 ? "" : s.substring(startIdx, startIdx+minLen); 

    }
}