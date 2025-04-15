class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        Stack<Integer> st = new Stack<>();

        for(int num: nums2){
            while(!st.isEmpty() && num > st.peek()){
                   mp.put(st.pop(), num);
            }
            st.push(num);
        }
        

        for(int i=0; i<nums1.length; i++){
            if(mp.containsKey(nums1[i])){
                nums1[i] = mp.get(nums1[i]);
            }
            else{
                nums1[i] = -1;
            }
        }
      
      return nums1;
    }
}