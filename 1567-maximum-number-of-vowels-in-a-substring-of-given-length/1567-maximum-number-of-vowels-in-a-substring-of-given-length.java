class Solution {
    public int maxVowels(String s, int k) {
        int left = 0, right = 0;
        int cnt = 0;
        int ans = Integer.MIN_VALUE;

        while(right<s.length()){
            char chr = s.charAt(right);
            if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u'){
                cnt++;
                k--;
            }
            else{
                k--;
            }
            if(k==0){
                ans = Math.max(ans, cnt);
                char chl = s.charAt(left);
                if(chl == 'a' || chl == 'e' || chl == 'i' || chl == 'o' || chl == 'u'){
                cnt--;
                k++;
            }
            else{
                k++;
            }
            
            left++;
            }
            right++;
        }

        return ans;
    }
}