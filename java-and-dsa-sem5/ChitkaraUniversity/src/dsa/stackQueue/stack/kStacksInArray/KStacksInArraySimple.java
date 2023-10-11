package dsa.stackQueue.stack.kStacksInArray;

import java.util.Arrays;
import java.util.EmptyStackException;

public class KStacksInArraySimple {
//    custom number of stacks and length of array, instead of just 2 in TwoStacksInArray

//    divides stack into parts of equal length
//    leads to inefficient use of space if one stack needs fewer elements and another needs more

    private final int stackCount;
    private final int[] arr;
    private final int[] stackBasesArr;
    private final int[] topsArr;

    public KStacksInArraySimple(int numberOfStacks, int capacityOfArray) {
        if (numberOfStacks == 0)
            throw new IllegalArgumentException("Stack count has to be more than 0!");
        if (numberOfStacks > capacityOfArray)
            throw new IllegalArgumentException("Capacity of array has to be greater than or equal to the number of stacks!");
        this.stackCount = numberOfStacks;
        arr = new int[capacityOfArray];
        topsArr = new int[numberOfStacks];
        stackBasesArr = new int[numberOfStacks];

        for (int i = 0; i < numberOfStacks; i++) {
            topsArr[i] = (capacityOfArray / numberOfStacks) * i;
            stackBasesArr[i] = (capacityOfArray / numberOfStacks) * i;
        }
    }

    public boolean push(int stackNumber, int element) {
        if (stackNumber > stackCount)
            throw new IllegalArgumentException("stackNumber has to be between 1 and total stack count!");
        int stackIndex = stackNumber - 1;
//        checking last stack isn't full
        if (topsArr[stackIndex] == arr.length)
            return false;
//        making sure stack isn't last one before comparing it's top to next stack's base
        if (stackNumber != stackCount && topsArr[stackIndex] == stackBasesArr[stackIndex + 1])
            return false;
        arr[topsArr[stackIndex]++] = element;
//        System.out.println("pushed element " + element + " in stack " + stackNumber + ".");
        return true;
    }

    public int pop(int stackNumber) {
        if (isEmpty(stackNumber))
            throw new EmptyStackException();
        return arr[topsArr[stackNumber - 1]-- - 1];
    }

    public int peek(int stackNumber) {
        if (isEmpty(stackNumber))
            throw new EmptyStackException();
        return arr[topsArr[stackNumber - 1] - 1];
    }

    public int getStackCount() {
        return stackCount;
    }

    public void clearStack(int stackNumber) {
        topsArr[stackNumber - 1] = stackBasesArr[stackNumber - 1];
    }

    public void clearAllStacks() {
        System.arraycopy(stackBasesArr, 0, topsArr, 0, stackCount);
    }

    public boolean isEmpty(int stackNumber) {
        if (stackNumber > stackCount)
            throw new IllegalArgumentException("stackNumber has to be between 1 and total stack count!");
        return topsArr[stackNumber - 1] == stackBasesArr[stackNumber - 1];
    }

    public void showArray() {
        System.out.println("Array: " + Arrays.toString(arr));
    }

    public void showStackTops() {
        System.out.println("Stack Tops: " + Arrays.toString(topsArr));
    }

    public void showStackBases() {
        System.out.println("Stack Bases: " + Arrays.toString(stackBasesArr));
    }

    public void showAllInternalInfo() {
        showArray();
        showStackTops();
        showStackBases();
    }

    public static void main(String[] args) {
        KStacksInArraySimple obj = new KStacksInArraySimple(5, 12);
        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Number of stacks: " + obj.getStackCount() + "\n");

        System.out.println("Pushing element into each stack.\n");
        obj.push(1, 15);
        obj.push(2, 16);
        obj.push(3, 17);
        obj.push(4, 18);
        obj.push(5, 19);

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Popping 1 element from each stack:");
        for (int i = 1; i <= 5; i++)
            System.out.print(obj.pop(i) + " ");
        System.out.println("\n");

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Pushing element into each stack.\n");
        obj.push(1, 25);
        obj.push(2, 26);
        obj.push(3, 27);
        obj.push(4, 28);
        obj.push(5, 29);

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Peeking element from each stack:");
        for (int i = 1; i <= 5; i++)
            System.out.print(obj.peek(i) + " ");
        System.out.println("\n");

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Pushing element into each stack.\n");
        obj.push(1, 35);
        obj.push(2, 36);
        obj.push(3, 37);
        obj.push(4, 38);
        obj.push(5, 39);

        obj.showAllInternalInfo();
        System.out.println();

        obj.clearStack(2);
        obj.clearStack(4);
        System.out.println("Cleared stacks 2 and 4.\n");

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Pushing element into each stack.\n");
        obj.push(1, 45);
        obj.push(2, 46);
        obj.push(3, 47);
        obj.push(4, 48);
        obj.push(5, 49);

        obj.showAllInternalInfo();
        System.out.println();

        obj.clearAllStacks();
        System.out.println("Cleared all stacks.\n");

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Pushing element into each stack.\n");
        obj.push(1, 55);
        obj.push(2, 56);
        obj.push(3, 57);
        obj.push(4, 58);
        obj.push(5, 59);

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Popping 1 element from each stack:");
        for (int i = 1; i <= 5; i++)
            System.out.print(obj.pop(i) + " ");
        System.out.println("\n");

        obj.showAllInternalInfo();
        System.out.println();

        System.out.println("Popping 1 element from each stack while stacks are empty:");
        for (int i = 1; i <= 5; i++)
            System.out.print(obj.pop(i) + " ");
        System.out.println("\n");

        obj.showAllInternalInfo();
        System.out.println();
    }
}
