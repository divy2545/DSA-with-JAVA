class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;

        for(int i=0; i<fruits.length; i++){
            int fruit = fruits[i];
            for(int j=0; j<baskets.length; j++){
                if(baskets[j]!=-1 && baskets[j] >= fruit){
                    baskets[j] = -1;
                    break;
                }
                if(j == baskets.length - 1) ans++;
            }
        }

        return ans;
    }
}