package dsa.dynamic.problems.matrixChainOrdering;

public class MatrixChainOrdering {
    public int matrixChainMultiplication(int[] DIMENSIONS) {

        int n = DIMENSIONS.length - 1;

        int[][] m = new int[n][n];

        // Step 1 - Fill 0s in table diagonally
        for (int i = 0; i < n; i++);

        for (int chainLen = 2; chainLen <= n; chainLen++) {
            for (int i = 0; i < n - chainLen; i++) {
                int j = i + (chainLen - 1);
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    // FORMULA
                    int cost = m[i][k] + m[k + 1][j] + (DIMENSIONS[i] * DIMENSIONS[k + 1] * DIMENSIONS[j + 1]);
                    if (cost < m[i][j]) {
                        m[i][j] = cost;
                    }
                }
            }
        }

        return m[0][n - 1];
    }

    public static void main(String[] args) {
        int[] DIMENSIONS1 = {4, 2, 3, 5};
        int[] DIMENSIONS2 = {};
        int[] DIMENSIONS3 = {};
    }
}
