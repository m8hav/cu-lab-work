package dsa.searching;

public class SearchingAlgorithms {
    public static int doLinearSearch(int[] arr, int key) {
        if (arr == null) return -1;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    public static int doBinarySearch(int[] arr, int key) {
        if (arr == null) return -1;
        int start = 0, end = arr.length - 1, mid;
        while (start <= end) {
            mid = start + (end - start) / 2;
            if (arr[mid] == key) return mid;
            if (arr[mid] < key)
                start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
