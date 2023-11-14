package _java.arrays.oneDArray;

import java.util.Arrays;

// Default value in arrays is default value of the type used.
// However, this only works in one-dimensional arrays

public class ArrayExample {
    public void runProgram() {
        int[] arr = {1, 2, 3, 4, 5};

        // Array Declaration
        String[] iceCreamPrices = new String[5];
        String[] iceCreamFlavors = {"Mango", "Orange", "Pineapple", "Chocolate", "Milk", "Fruity"};
        System.out.println("Unsorted: ");
        for (String val : iceCreamFlavors) System.out.print(val + " ");
        System.out.println();
        System.out.println("Partially Sorted: ");
        Arrays.sort(iceCreamFlavors, 2, 4);
        for (String val : iceCreamFlavors) System.out.print(val + " ");

//      Frequently Used Arrays Class Methods
//        - All of these only work for one-dimensional arrays

//        SORT
//        Arrays.sort(array);
//        Arrays.sort(array, fromIndex, toIndex);

//        FILL
//        Arrays.fill(array, value);
//        Arrays.fill(array, fromIndex, toIndex, value);

//        BINARYSEARCH
//        Arrays.binarySearch(array, key);
//        Arrays.binarySearch(array, fromIndex, toIndex, key);

//        EQUALS
//        Arrays.equals(array_1, array_2);
//        Arrays.equals(array_1, fromIndex_1, toIndex_1, array_2, fromIndex_2, toIndex_2);

//        RANGECHECK
//        Arrays.rangeCheck() (incomplete)
    }
}
