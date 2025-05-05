class Solution {
    public int minNumberOfFrogs(String croakOfFrogs) {
        int c = 0, r = 0, o = 0, a = 0, k = 0;
        int activefrogs = 0;
        int ans = 0;

        for (char ch : croakOfFrogs.toCharArray()) {
            switch (ch) {
                case 'c':
                    c++;
                    activefrogs++;
                    break;
                case 'r':
                    r++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'a':
                    a++;
                    break;
                case 'k':
                    k++;
                    activefrogs--;
                    break;
            }
            ans = Math.max(activefrogs, ans);

            if (c < r || r < o || o < a || a < k)
                return -1;
        }

        return activefrogs == 0 ? ans : -1;

    }
}