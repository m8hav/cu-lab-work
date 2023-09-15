package dsa.searchingAlgorithms;

import java.util.Arrays;

public class SearchingAlgorithmsMain {
    public static void main(String[] args) {
        int [] arr = {5, 4, 2, 7, 3, 9, 1};
        int key = 3;

        System.out.println("Original array:\n" + Arrays.toString(arr));

        System.out.println("Linear Search Result - searching " + key + ": " + SearchingAlgorithms.doLinearSearch(arr, key));

//        arr = Arrays.stream(arr).sorted().toArray();
        Arrays.sort(arr);
        System.out.println("Sorted array:\n" + Arrays.toString(arr));

        System.out.println("Binary Search Result - searching " + key + ": " + SearchingAlgorithms.doBinarySearch(arr, key));

    }
}
