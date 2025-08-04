class Solution {
    public int totalFruit(int[] fruits) {
        int left = 0, maxLen = 0;
        Map<Integer, Integer> countMap = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            countMap.put(fruits[right], countMap.getOrDefault(fruits[right], 0) + 1);

            while (countMap.size() > 2) {
                countMap.put(fruits[left], countMap.get(fruits[left]) - 1);
                if (countMap.get(fruits[left]) == 0) {
                    countMap.remove(fruits[left]);
                }
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
