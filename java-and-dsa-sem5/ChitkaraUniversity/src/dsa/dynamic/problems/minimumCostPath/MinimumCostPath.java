package dsa.dynamic.problems.minimumCostPath;

import java.util.Arrays;

/*
NOT WORKING YET
 */

public class MinimumCostPath {

    private final int[][] costGrid;
    private final int rows;
    private final int cols;

    public MinimumCostPath(int rows, int cols, int[][] costGrid) {
        this.rows = rows;
        this.cols = cols;
        this.costGrid = costGrid;
    }

    // with Recursion - Greedy Approach
    public int minCostRecursion(int m, int n) {
        if (m == 0 && n == 0) return costGrid[0][0];
        if (m < 0 || n < 0) return Integer.MAX_VALUE;
        return costGrid[m][n] + Math.min(minCostRecursion(m - 1, n), minCostRecursion(m, n - 1));
    }

    // with Memoization
    public int minCostMemoization(int m, int n, int[][] dp) {
        if (m == 0 && n == 0) return costGrid[m][n];
        if (m < 0 || n < 0) return Integer.MAX_VALUE;

        if (dp[m][n] != -1) return dp[m][n];

        dp[m][n] = costGrid[m][n] + Math.min(minCostMemoization(m - 1, n, dp), minCostMemoization(m, n - 1, dp));
        return dp[m][n];
    }

    // with Tabulation
    public int minCostTabulation(int m, int n, int[][] dp) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[i][j] = costGrid[i][j];
                if (i == 0 && j > 0) dp[i][j] += dp[i][j - 1];
                else if (i > 0 && j == 0) dp[i][j] += dp[i - 1][j];
                else if (i > 0 && j > 0) dp[i][j] += Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] costGrid1 = new int[][] {
                {2, 1, 3, 4, 2, 8},
                {4, 2, 7, 1, 2, 9},
                {5, 2, 4, 6, 8, 0},
                {4, 2, 0, 2, 3, 7},
                {1, 1, 7, 5, 2, 2},
        };
        int[][] costGrid2 = new int[][] {
                {   2,  7,  7,  4,  2,  8   },
                {   1,  8,  3,  9,  2,  9   },
                {   2,  8,  3,  9,  8,  0   },
                {   2,  8,  3,  9,  3,  7   },
                {   1,  1,  4,  50, 2,  2   },
        };

        int[][] dp = new int[costGrid1.length][costGrid1[0].length];
        for (int i = 0; i < costGrid1.length; i++) {
            dp[i] = new int[costGrid1[0].length];
            Arrays.fill(dp[i], -1);
        }

        MinimumCostPath obj = new MinimumCostPath(costGrid1.length, costGrid1[0].length, costGrid1);
        System.out.println(obj. minCostTabulation(5, 0, dp));
    }
}
