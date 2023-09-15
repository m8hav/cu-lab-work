package dsa.advancedSortingAlgorithms;

public class QuickSort {
    public static void swapElements(int[] arr, int index1, int index2) {
        if (index1 == index2) return;
//        System.out.printf("swapping index %d, index %d\n", index1, index2);
//        System.out.println(arr[index1] + " " + arr[index2]);
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
//        System.out.println(arr[index1] + " " + arr[index2]);
//        ASAMain.printArraysWithIndexLabels(arr);
    }

    public static void doQuickSort1(int[] arr, int left, int right) {
//        NOT WORKING
//        SIR'S WAY TO PLACING PIVOT ELEMENT AT IT'S CORRECT POSITION

        if (left >= right) return;

        System.out.printf("\ndoQuickSort1() - left: %d, right: %d\n", left, right);

        int li = left + 1, ri = right;

        while (li < ri) {
            while (arr[li] <= arr[left] && li < ri) li++;
            while (arr[ri] > arr[left] && li < ri) ri--;
            swapElements(arr, li, ri);
        }
        int pivotIndex = li - 1;

        swapElements(arr, left, pivotIndex);

        doQuickSort1(arr, left, pivotIndex - 1);
        doQuickSort1(arr, pivotIndex + 1, right);
    }

    public static void doQuickSort2(int[] arr, int left, int right) {
//        VISUALALGO.NET'S WAY OF PLACING PIVOT ELEMENT AT ITS CORRECT POSITION

//        WORKING

        if (left >= right) return;

//        System.out.printf("\ndoQuickSort2() - left: %d, right: %d\n", left, right);

        int storeIndex = left + 1;
        for (int i = left + 1; i <= right; i++)
            if (arr[i] <= arr[left])
                swapElements(arr, storeIndex++, i);

        int pivotIndex = storeIndex - 1;

        swapElements(arr, left, pivotIndex);
        doQuickSort2(arr, left, pivotIndex - 1);
        doQuickSort2(arr, pivotIndex + 1, right);
    }

    public static int placePivotElement(int[] arr, int left, int right) {
        int splittingIndex = left + 1;
//        ^ using this index to put all elements smaller than or equal to first element on the left
        for (int i = left + 1; i <= right; i++)
            if (arr[i] <= arr[left])
                swapElements(arr, splittingIndex++, i);
        swapElements(arr, left, splittingIndex-1);
//        ^ putting pivot element in its correct place
        return splittingIndex-1;
//        ^ returning index of pivot element
    }

    public static void doQuickSort3(int[] arr, int left, int right) {
//        SAME AS doQuickSort2()
//        EXTRACTED PORTION INTO ANOTHER METHOD FOR BETTER UNDERSTANDING

        if (left >= right) return;

//        System.out.printf("\ndoQuickSort3() - left: %d, right: %d\n", left, right);

        int pivotIndex = placePivotElement(arr, left, right);

        doQuickSort3(arr, left, pivotIndex - 1);
        doQuickSort3(arr, pivotIndex + 1, right);
    }

    public static void doQuickSort(int[] arr) {
//        doQuickSort1(arr, 0, arr.length - 1);
//        doQuickSort2(arr, 0, arr.length - 1);
        doQuickSort3(arr, 0, arr.length - 1);
    }
}
