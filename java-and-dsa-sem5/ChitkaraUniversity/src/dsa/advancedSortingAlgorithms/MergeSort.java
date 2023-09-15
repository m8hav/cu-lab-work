package dsa.advancedSortingAlgorithms;

public class MergeSort {

    public static void mergeTwoSortedPartitions1(int[] arr, int left, int right) {
        int mid = left + (right - left) / 2;

        int leftLen = mid - left + 1;
        int rightLen = right - mid;

        int[] leftHalf = new int[leftLen];
        int[] rightHalf = new int[rightLen];

        int i, j;

        for (i = 0; i < leftLen; i++)
            leftHalf[i] = arr[i + left];
        for (i = 0; i < rightLen; i++)
            rightHalf[i] = arr[i + mid + 1];

        i = 0;
        j = 0;

        while (i < leftLen && j < rightLen) {
            if (leftHalf[i] < rightHalf[j])
                arr[left++] = leftHalf[i++];
            else arr[left++] = rightHalf[j++];
        }

        while (i < leftLen)
            arr[left++] = leftHalf[i++];
        while (j < rightLen)
            arr[left++] = rightHalf[j++];
    }

    public static void mergeTwoSortedPartitions2(int[] arr, int left, int right) {
//        THIS IS NOT COMPLETE
        System.out.println("merging two sorted partitions using 2 pointer approach (from suryam's code).");
    }

    public static void doMergeSort(int[] arr, int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        doMergeSort(arr, left, mid);
        doMergeSort(arr, mid + 1, right);

        mergeTwoSortedPartitions1(arr, left, right);
    }

    public static void doMergeSort(int[] arr) {
        doMergeSort(arr, 0, arr.length - 1);
    }
}
