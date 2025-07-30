class Solution {
    public int minimumRecolors(String blocks, int k) {
        int left = 0, right = 0;
        int min = 0;
        int ans = Integer.MAX_VALUE;

        while(right < blocks.length()){
            char ch = blocks.charAt(right);
           
            if(ch == 'W'){
                min++;
                k--;
            }
            else if(ch == 'B'){
                k--;
            }

             if(k==0){
                ans = Math.min(min, ans);
                if(blocks.charAt(left) == 'W'){
                    min--;
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