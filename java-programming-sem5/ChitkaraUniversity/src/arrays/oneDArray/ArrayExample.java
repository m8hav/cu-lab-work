package arrays.oneDArray;

import java.util.Arrays;

// Default value in arrays is default value of the type used.
// However, this only works in one-dimensional arrays

public class ArrayExample {
    public void runProgram() {
//        Array Declaration
        String[] iceCreamPrices = new String[5];
        String[] iceCreamFlavors = {"Mango", "Orange", "Pineapple", "Chocolate", "Milk", "Fruity"};
        for (String val : iceCreamFlavors) System.out.print(val + " ");
        System.out.println();
        Arrays.sort(iceCreamFlavors, 2, 4);
        for (String val : iceCreamFlavors) System.out.print(val + " ");

//      Frequently Used Arrays Class Methods
//        SORT
//        Arrays.sort(array);
//        Arrays.sort(array, fromIndex, toIndex);

//        FILL - only works for one-dimensional arrays
//        Arrays.fill(array, value);
//        Arrays.fill(array, fromIndex, toIndex, value);

//        BINARYSEARCH
//        Arrays.binarySearch(array, key);
//        Arrays.binarySearch(array, fromIndex, toIndex, key);

//        EQUALS
//        Arrays.equals(array1, array2);
//        Arrays.equals(array_1, fromIndex_1, toIndex_1, array_2, fromIndex_2, toIndex_2);

//        RANGECHECK
//        Arrays.rangeCheck() (incomplete)
    }
}
