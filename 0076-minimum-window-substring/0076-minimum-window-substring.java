class Solution {
    public String minWindow(String s, String t) {
        int m = s.length(), n = t.length();
        int cnt = 0, sIdx = -1;
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;

        int[] hash = new int[256];
        for(int i=0; i<n; i++){
            hash[t.charAt(i)]++;
        }

        while(right < m){

            if(hash[s.charAt(right)]>0){
                cnt++;
            }
            hash[s.charAt(right)]--;
            while(cnt == n){
                if(right-left+1 < min){
                    min = right-left+1;
                    sIdx = left;
                }
                hash[s.charAt(left)]++;
                if(hash[s.charAt(left)]>0){
                    cnt--;
                }
                left++;
            }

            right++;
        }

        return sIdx == -1? "" : s.substring(sIdx, sIdx+min);
    }
}