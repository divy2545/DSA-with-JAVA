class Solution {
    public int trap(int[] height) {
        int n=height.length;

        int[] suffixMax = new int[n];
        suffixMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            suffixMax[i] = Math.max(suffixMax[i+1], height[i]);
        }

        int total = 0;
        int leftMax=height[0];
        for(int i=0; i<n; i++){
            leftMax = Math.max(leftMax, height[i]);
            int rightMax=suffixMax[i];
            if(height[i]<leftMax && height[i]<rightMax){
                total += Math.min(leftMax, rightMax) - height[i];
            }
        }

        return total;
    }
}