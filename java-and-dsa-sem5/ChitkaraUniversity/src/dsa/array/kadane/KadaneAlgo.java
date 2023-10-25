package dsa.array.kadane;

// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

// Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.
// Find SUM alone, not positions of contiguous subarray with the largest sum.

import javafx.util.Pair;

import java.util.ArrayList;

public class KadaneAlgo {
    private int N;
    private int arr[];
    private int localMax = 0;
    private int globalMax = 0;

    public KadaneAlgo(int n, int[] arr) {
        N = n;
        this.arr = arr;
    }

    // sir's implementation
    public int getMaximumSumOfSubarray() {
        for (int i = 0; i < N; i++) {
            localMax = Math.max(arr[i], arr[i] + localMax);
            System.out.print(localMax + " ");

            /*

            arr:
            2  -4  3  -1  2

            x = max(2, (2 + 0)) = 2
            x = max(-4, ((-4) + 2)) = -2
            x = max(3, (3 + (-2)) = 3
            x = max(-1, ((-1) + 3) = 4
            x = max(2, (2 + (2)) = 4

            ans = 4

            */

            if (localMax > globalMax)
                globalMax = localMax;
        }

        System.out.println();
        return globalMax;
    }

    // my implementation
    public static Pair<Integer, Pair<Integer, Integer>> maxSumSubarray(int[] arr) {
        if (arr.length == 0) return new Pair<>(0, new Pair<>(0, 0));

        int maxSum = arr[0];
        int maxSubArrStart = 0;
        int maxSubArrEnd = -1;

        // -2, -3, 4, -1, -2, 1, 5, -3

        // START AND END INDEX CODE DOESN'T WORK YET

        int sum = 0;
        int subArrStart = 0;
        int subArrEnd = -1;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum > maxSum) {
                maxSum = sum;
                maxSubArrEnd = i;
            }

            if (sum < 0) {
                sum = 0;
                subArrStart = i + 1;
                subArrEnd = i;
            }
        }

        return new Pair<>(maxSum, new Pair<>(maxSubArrStart, maxSubArrEnd));
    }

    public static void main(String[] args) {
        int arr[] = {2, -4, 3, -1, 2};
        KadaneAlgo obj = new KadaneAlgo(arr.length, arr);

//        System.out.println(obj.getMaximumSumOfSubarray());

        System.out.println(maxSumSubarray(arr));
        System.out.println(maxSumSubarray(new int[]{-2, -3, 4, -1, -2, 1, 5, -3}));
    }
}
