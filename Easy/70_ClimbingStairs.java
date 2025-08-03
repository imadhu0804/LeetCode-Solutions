public class Solution {
    public static int climbStairs(int n) {
        if (n <= 2) return n;

        int oneStepBefore = 2;
        int twoStepsBefore = 1;
        int result = 0;

        for (int i = 3; i <= n; i++) {
            result = oneStepBefore + twoStepsBefore;
            twoStepsBefore = oneStepBefore;
            oneStepBefore = result;
        }

        return result;
    }
}
