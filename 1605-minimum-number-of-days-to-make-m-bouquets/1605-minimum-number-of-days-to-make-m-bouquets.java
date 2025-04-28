class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        int maxEle = Integer.MIN_VALUE;
        int minEle = Integer.MAX_VALUE;

        for (int num : bloomDay) {
            maxEle = Math.max(maxEle, num);
            minEle = Math.min(minEle, num);
        }

        int low = minEle, high = maxEle;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (makeBouquets(bloomDay, m, k, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return ans;
    }

    public boolean makeBouquets(int[] bd, int m, int k, int day) {
        int consecutive_count = 0;
        int bqCount = 0;
        for (int i = 0; i < bd.length; i++) {
            if (bd[i] <= day) {
                consecutive_count++;
                if (consecutive_count == k) {
                    bqCount++;
                    consecutive_count = 0;
                }
            } else {
                consecutive_count = 0;
            }
        }
        return bqCount >= m;
    }
}