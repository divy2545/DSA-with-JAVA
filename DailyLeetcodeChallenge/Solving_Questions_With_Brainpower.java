package DailyLeetcodeChallenge;

import java.util.Arrays;

public class Solving_Questions_With_Brainpower {

    public long findMaxPoints(int[][] questions, int idx, long[] mem) {
        if (idx >= questions.length)
            return 0;
        if (mem[idx] != -1)
            return mem[idx];

        long exclude = findMaxPoints(questions, idx + 1, mem);
        long include = questions[idx][0] + findMaxPoints(questions, idx + questions[idx][1] + 1, mem);
        mem[idx] = Math.max(exclude, include);
        return mem[idx];
    }

    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] mem = new long[n];
        Arrays.fill(mem, -1);
        return findMaxPoints(questions, 0, mem);
    }
}


// time complexity - O(N)
// space complexity - O(N+N) 