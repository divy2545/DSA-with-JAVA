class Solution {
    public int maxArea(int[] height) {
       int vol = 0;
       int left = 0, right = height.length-1;
       while(left<right){
        vol = Math.max(vol, (right-left)*Math.min(height[left],height[right]));
        if(height[left] < height[right]) left++;
        else right--;
       }

       return vol; 
    }
}