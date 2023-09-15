package dsa.basicSortingAlgorithms;

import java.util.Arrays;

public class BSAMain {

    public static void main(String[] args) {
        int[] arr = new int[] {9, 8, 8, 2, 4, 7, 6, 5, 4, 2, 3, 1, 4};
        System.out.println("Original Array:\n" + Arrays.toString(arr));

        int[] bubbleSortedArr = BasicSortingAlgorithms.doIntegerBubbleSort(arr);
        System.out.println("Bubble Sort Result:\n" + Arrays.toString(bubbleSortedArr));

//        int[] templateBubbleSortedArr = BasicSortingAlgorithms.doTemplateBubbleSort(arr);
//        System.out.println("Template Bubble Sort Result:\n" + Arrays.toString(templateBubbleSortedArr));

        int[] selectionSortedArr = BasicSortingAlgorithms.doIntegerSelectionSort(arr);
        System.out.println("Selection Sort Result:\n" + Arrays.toString(selectionSortedArr));

        int[] insertionSortedArr = BasicSortingAlgorithms.doIntegerInsertionSort(arr);
        System.out.println("Insertion Sort Result:\n" + Arrays.toString(insertionSortedArr));
    }
}
