class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n = digits.length;
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (digits[i] == 0) continue; // hundreds digit can't be 0

            for (int j = 0; j < n; j++) {
                if (j == i) continue;

                for (int k = 0; k < n; k++) {
                    if (k == i || k == j) continue;

                    int num = digits[i] * 100 + digits[j] * 10 + digits[k];

                    if (num % 2 == 0 && !seen.contains(num)) {
                        ans.add(num);
                        seen.add(num);
                    }
                }
            }
        }

        // Convert ArrayList to array and sort
        int[] res = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            res[i] = ans.get(i);
        }

        Arrays.sort(res); // Optional: to return sorted order
        return res;
    }
}
