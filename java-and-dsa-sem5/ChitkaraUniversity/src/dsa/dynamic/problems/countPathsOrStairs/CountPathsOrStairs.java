package dsa.dynamic.problems.countPathsOrStairs;

/*
You need to find the number of distinct ways to climb a staircase of N steps with 1, 2 or 3 steps.
 */
public class CountPathsOrStairs {
    // with Recursion
    public int countPathsRecursion(int n) {
        // base cases
        // when reached 0
        if (n == 0) return 1;
        // when reached -1, -2, ... i.e. step not usable
        if (n < 0) return 0;

        // rules
        int pattern1 = countPathsRecursion(n - 1);   // for 1 step
        int pattern2 = countPathsRecursion(n - 2);   // for 2 steps
        int pattern3 = countPathsRecursion(n - 3);   // for 3 steps

        return pattern1 + pattern2 + pattern3;
    }

    // with Memoization
    public int countPathsMemoization(int n, int[] memo) {
        if (n == 0) return 1;
        if (n < 0) return 0;

        if (memo[n] > 0) return memo[n];

        // rules
        int pattern1 = countPathsMemoization(n - 1, memo);   // for 1 step
        int pattern2 = countPathsMemoization(n - 2, memo);   // for 2 steps
        int pattern3 = countPathsMemoization(n - 3, memo);   // for 3 steps

        memo[n] = pattern1 + pattern2 + pattern3;

        return memo[n];
    }

    // with Tabulation
    public int countPathsTabulation(int n) {
        int[] table = new int[n + 1];

        table[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 0) table[i] = table[i - 1];
            else if (i == 2) table[i] = table[i - 1] + table[i - 2];
            else table[i] = table[i - 1] + table[i - 2] + table[i - 3];
        }

        for (int i = 0; i <= n; i++) System.out.println(table[i] + " ");

        return table[n];
    }

    public static void main(String[] args) {

    }
}
