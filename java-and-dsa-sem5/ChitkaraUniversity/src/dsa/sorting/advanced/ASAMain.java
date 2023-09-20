package dsa.sorting.advanced;

import java.util.Random;

public class ASAMain {
    public static int[] generateRandomIntegerArray(int size, int bound) {
        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
            arr[i] = rand.nextInt(bound);

        return arr;
    }

    public static void printArraysWithIndexLabels(int[]... arrays) {
        for (int[] arr : arrays) {
            for (int val : arr)
                System.out.printf("%-4s", val);
            System.out.println();
            for (int i = 0; i < arr.length; i++)
                System.out.printf("%-4s", i);
            System.out.println("\n");
//            System.out.println(Arrays.toString(arr));
        }
    }
    public static void main(String[] args) {

        int[] arr1 = generateRandomIntegerArray(10, 20);
        int[] arr2 = generateRandomIntegerArray(10, 20);
        System.out.println("Original Arrays:");
        printArraysWithIndexLabels(arr1, arr2);

        QuickSort.doQuickSort(arr1);
        MergeSort.doMergeSort(arr2);

        System.out.println("Quick Sort and Merge Sort Results:");
        printArraysWithIndexLabels(arr1, arr2);
    }
}
