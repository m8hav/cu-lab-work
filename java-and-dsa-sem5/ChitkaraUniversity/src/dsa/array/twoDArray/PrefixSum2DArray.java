package dsa.array.twoDArray;

import java.util.Arrays;

public class PrefixSum2DArray {
    private int rows, cols;
    private int arr[][];

    private int prefixSumArr[][];

    public PrefixSum2DArray(int rows, int cols, int[][] arr) {
        this.rows = rows;
        this.cols = cols;
        this.arr = arr;
        this.prefixSumArr = new int[rows][cols];
    }

    public void makePrefixSumArr() {
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++) {
                if (i == 0 && j == 0)
                    prefixSumArr[i][j] = arr[i][j];
                else if (i == 0)
                    prefixSumArr[i][j] = arr[i][j] + prefixSumArr[i][j - 1];
                else if (j == 0)
                    prefixSumArr[i][j] = arr[i][j] + prefixSumArr[i - 1][j];
            }
        for (int i = 1; i < rows; i++)
            for (int j = 1; j < cols; j++)
                prefixSumArr[i][j] =
                                arr[i][j] +
                                prefixSumArr[i][j-1] +
                                prefixSumArr[i-1][j] -
                                prefixSumArr[i-1][j-1];
    }

    public void show2DArray(int[][] twoDArr) {
        for (int[] arr : twoDArr)
            System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    public int[][] getArr() {
        return arr;
    }

    public int[][] getPrefixSumArr() {
        return prefixSumArr;
    }



    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {2, 3, 4, 5, 6},
                {4, 2, 7, 1, 3}
        };

        PrefixSum2DArray obj = new PrefixSum2DArray(4, 5, arr);

        System.out.println("Original array:");
        obj.show2DArray(obj.getArr());

        System.out.println("Original prefix sum array:");
        obj.show2DArray(obj.getPrefixSumArr());

        obj.makePrefixSumArr();
        System.out.println("Made prefix sum array.\n");

        System.out.println("Final prefix sum array:");
        obj.show2DArray(obj.getPrefixSumArr());
        System.out.println();
    }
}
