package dsa.array.kadane;

// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/

// Given an array arr[] of size N. The task is to find the sum of the contiguous subarray within a arr[] with the largest sum.
// Find SUM alone, not positions of contiguous subarray with the largest sum.

public class KadaneAlgo {
    private int N;
    private int arr[];
    private int localMax = 0;
    private int globalMax = 0;

    public KadaneAlgo(int n, int[] arr) {
        N = n;
        this.arr = arr;
    }

    public int getMaximumSumOfSubarray() {
        for (int i = 0; i < N; i++) {
            localMax = Math.max(arr[i], arr[i] + localMax);
            System.out.print(localMax + " ");

            /*

            arr:
            2   -4  3   -1  2

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

    public static void main(String[] args) {
        int arr[] = {2, -4, 3, -1, 2};
        KadaneAlgo obj = new KadaneAlgo(arr.length, arr);

        System.out.println(obj.getMaximumSumOfSubarray());
    }
}
