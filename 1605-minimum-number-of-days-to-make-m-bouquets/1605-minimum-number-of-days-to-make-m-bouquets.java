class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;

        int maxEle = Integer.MIN_VALUE;

        for (int num : bloomDay) {
            maxEle = Math.max(maxEle, num);
        }

        int low = 0, high = maxEle;
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
        int adj = 0;
        int bq = 0;
        for (int i = 0; i < bd.length; i++) {
            if (bd[i] <= day) {
                adj++;
                if (adj == k) {
                    bq++;
                    adj = 0;
                }
            } else {
                adj = 0;
            }
        }
        return bq >= m;
    }
}