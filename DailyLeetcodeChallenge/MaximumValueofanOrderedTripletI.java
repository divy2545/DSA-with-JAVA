package DailyLeetcodeChallenge;

// bruteforce- TC : O(N^3)

public class MaximumValueofanOrderedTripletI {
        public long maximumTripletValue(int[] nums) {
            int n = nums.length;
            long max = 0;
    
            for (int i = 0; i < n - 2; i++) {
                for (int j = i + 1; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        long cal = (long) (nums[i] - nums[j]) * nums[k];
                        max = Math.max(max, cal); 
                    }
                }
            }
            return max;
    }
}





// optimized approach - TC : O(N)


class Solution {
    public long maximumTripletValue(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] postfix = new int[n];

        prefix[0] = nums[0];
        for(int i=1; i<n; i++){
            prefix[i] = Math.max(nums[i], prefix[i-1]);
        }

        postfix[n-1] = nums[n-1];
        for(int i=n-2; i>=0; i--){
            postfix[i] = Math.max(nums[i], postfix[i+1]);
        }

        long max = 0;
        for(int i=1; i<n-1; i++){
            long cal = ((long)prefix[i-1] - nums[i]) * postfix[i+1];
            max = Math.max(cal, max);
        }

        return max;
        
    
    }
}
