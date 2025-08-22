class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int[] freq = new int[26];
        for(char ch: allowed.toCharArray()){
            freq[ch-'a']++;
        }

        int ans = 0;
        for(int i=0; i<words.length; i++){
            boolean flag = true;
            for(int j=0; j<words[i].length(); j++){
            if(freq[words[i].charAt(j)-'a']==0) flag = false;
            }
            if(flag == true) ans++;
        }

        return ans;
    }
}