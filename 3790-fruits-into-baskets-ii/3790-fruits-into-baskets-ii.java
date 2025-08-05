class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int ans = 0;

        for(int i=0; i<fruits.length; i++){
            int fruit = fruits[i];
            for(int j=0; j<baskets.length; j++){
                if(baskets[j] >= fruit){
                    baskets[j] = 0;
                    ans++;
                    break;
                }

            }
        }

        return baskets.length - ans;
    }
}