package practice.revertWithContainer;

import dsa.sorting.basic.BasicSorting;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/*
 * SHOW DATA IN DESCENDING ORDER USING A CONTAINER
 */

public class RevertWithContainer {

    public static Scanner input;

    private int size;
    private int[] arr;
    private final Stack<Integer> stack = new Stack<>();

    static {
        input = new Scanner(System.in);
    }

    public RevertWithContainer() {
        System.out.print("Enter size of array: ");
        this.size = input.nextInt();
    }

    public RevertWithContainer(int sizeOfArray) {
        this.size = sizeOfArray;
    }

    public void createArray() {
        arr = new int[size];

        System.out.print("Enter elements of array with spaces between them.\n>>> ");
        for (int i = 0; i < size; i++)
            arr[i] = input.nextInt();
    }

    public void doSort() {
        arr = BasicSorting.doIntegerSelectionSort(arr);
    }

    public void displayArray() {
        System.out.println(Arrays.toString(arr));
    }

    public int[] getArr() {
        return arr;
    }

    public void reverseUsingContainer() {
        for (int val : arr)
            stack.push(val);
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
    }

    public void setSize(int sizeOfArray) {
        this.size = sizeOfArray;
    }
}
