class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, new ArrayList<>(), ans, new boolean[nums.length]);
        return ans;
    }

    private void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> ans, boolean[] used) {
        if (curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr)); // add a copy
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue; // skip already used element

            // choose
            curr.add(nums[i]);
            used[i] = true;

            // explore
            backtrack(nums, curr, ans, used);

            // un-choose (backtrack)
            curr.remove(curr.size() - 1);
            used[i] = false;
        }
    }
}
