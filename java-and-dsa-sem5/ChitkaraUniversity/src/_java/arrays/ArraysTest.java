package _java.arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int arr[] = new int[5];
        // ^ C style array declaration
        arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        // ^ Java style array declaration
        // these work

        // arr = new int[];
        // arr = new int[5]{1, 2, 3, 4, 5};
        // int arr2[] = new int[]arr;
        // ^ these don't work

        // You either put the size of array in square brackets and end
        // or you define the array and put no size in square brackets
        // or you ignore new int[] and implicitly make array {1, 2, 3, 4, 5}

        // You can't leave it without size and definition both
        // and you can't put both together either

        for (int i : arr) System.out.print(i + " ");
        System.out.println("\n");
    }
}
