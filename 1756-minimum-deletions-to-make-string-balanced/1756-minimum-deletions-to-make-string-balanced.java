class Solution {
    public int minimumDeletions(String s) {
        // int countA = 0;
        // int countB = 0;
        // int del = 0;

        // for(int i=0;i<s.length();i++){
        //     if(countb<0){
                // s
        //     }
        // }
        
        
        int ans = 0, cnt = 0;
        
        for(char ch : s.toCharArray()){
            if(ch=='b'){
                cnt++;
            }
            else if(cnt!=0){
                cnt--;
                ans++;
            }
        }
        
        return ans;
        

    }
}