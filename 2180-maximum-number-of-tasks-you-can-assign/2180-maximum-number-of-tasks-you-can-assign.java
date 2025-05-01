class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int strength) {
        int n = tasks.length;

        Arrays.sort(tasks);
        Arrays.sort(workers);

        int left = 0, right = Math.min(tasks.length, workers.length);
        int ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(tasks, workers, mid, pills, strength)) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public boolean check(int[] tasks, int[] workers, int k, int pills, int strength) {
        int m = workers.length;
        int p = pills;
        Deque<Integer> available = new ArrayDeque<>();
        int j = m - 1;

        for (int i = k - 1; i >= 0; i--) {
            while (j >= m - k && workers[j] + strength >= tasks[i]) {
                available.addFirst(workers[j--]);
            }
            if (available.isEmpty())
                return false;
            if (available.peekLast() >= tasks[i]) {
                available.pollLast();
            } else {
                if (p == 0)
                    return false;
                p--;
                available.pollFirst();
            }
        }
        return true;
    }

}