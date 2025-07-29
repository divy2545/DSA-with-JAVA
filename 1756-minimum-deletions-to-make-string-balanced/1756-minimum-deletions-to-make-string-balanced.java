class Solution {
    public int minimumDeletions(String s) {
        int countB = 0;
        int del = 0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                countB++;
            }
            else if(s.charAt(i)=='a' && countB > 0){
               del++;
               countB--;
            }
            
        }
        return del;
    }
}
