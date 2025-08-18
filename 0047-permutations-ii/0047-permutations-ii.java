class Solution {
    public static void backTrack(List<List<Integer>> ans, List<Integer> dataStruct, int[] nums,boolean[] visited, int idx){
        if(idx == nums.length){
            ans.add(new ArrayList<>(dataStruct));
            // System.out.println(dataStruct);
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1] && visited[i - 1]) continue;
            if(!visited[i]){
                visited[i] = true;
                dataStruct.add(nums[i]);
                backTrack(ans,dataStruct, nums, visited, idx + 1);
                dataStruct.remove(dataStruct.size() - 1);
                visited[i] = false;
            }
        }
    } 
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        backTrack(ans, new ArrayList<>(), nums, visited, 0);
        return ans;
    }
}