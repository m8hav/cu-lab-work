package dsa.stackQueue.stack.kStacksInArray;

import java.util.Arrays;
import java.util.EmptyStackException;

public class KStacksInArrayOptimised {
    private final int numberOfStacks;
    private final int capacity;
    private final int[] data;
    private final int[] top;
    private final int[] next;
    private int free_slot;

    public KStacksInArrayOptimised(int numberOfStacks, int capacity) {
        this.numberOfStacks = numberOfStacks;
        this.capacity = capacity;
        data = new int[capacity];
        next = new int[capacity];
        top = Arrays.stream(new int[numberOfStacks]).map(e -> -1).toArray();
        free_slot = 0;

        for (int i = 0; i < capacity - 1; i++)
            next[i] = i + 1;
        if (capacity > 0) next[capacity - 1] = -1;

        System.out.println(Arrays.toString(next));
    }

    public boolean push(int stackNumber, int value) {
        if (free_slot == -1) return false;
        int index = free_slot;
        free_slot = next[index];
        next[index] = top[stackNumber];
        top[stackNumber] = index;
        data[index] = value;
        return true;
    }

    public int pop(int stackNumber) {
        if (top[stackNumber] == -1)
            throw new EmptyStackException();
        int topIndex = top[stackNumber];
        int value = data[topIndex];
        top[stackNumber] = next[topIndex];
        next[topIndex] = free_slot;
        free_slot = topIndex;
        return value;
    }

    public int peek(int stackNumber) {
        if (top[stackNumber] == -1)
            throw new EmptyStackException();
        return data[top[stackNumber]];
    }

    public boolean isFull() {
        return free_slot == -1;
    }

    public boolean isEmpty(int stackNumber) {
        return top[stackNumber] == -1;
    }

    public int getNumberOfStacks() {
        return numberOfStacks;
    }

    public int getCapacity() {
        return capacity;
    }

    public void showDataArray() {
        System.out.println(Arrays.toString(data));
    }

    public void showNextArray() {
        System.out.println(Arrays.toString(next));
    }

    public void showTopArray() {
        System.out.println(Arrays.toString(top));
    }

    public static void main(String[] args) {
        KStacksInArrayOptimised kStacksObj = new KStacksInArrayOptimised(3, 10);

        System.out.println(kStacksObj.isFull());
        System.out.println(kStacksObj.isEmpty(0));
        System.out.println(kStacksObj.isEmpty(1));
        System.out.println(kStacksObj.isEmpty(2));
        System.out.println();

        System.out.println("Adding elements to each stack.\n");
        kStacksObj.push(0, 5);
        kStacksObj.push(0, 6);
        kStacksObj.push(1, 15);
        kStacksObj.push(2, 25);
        kStacksObj.push(1, 16);
        kStacksObj.push(2, 26);
        kStacksObj.push(0, 7);
        kStacksObj.push(2, 27);
        kStacksObj.push(1, 17);
        kStacksObj.push(2, 28);
        kStacksObj.push(1, 18);

        kStacksObj.showDataArray();

        System.out.println(kStacksObj.pop(0));
        System.out.println(kStacksObj.pop(0));
        System.out.println(kStacksObj.pop(0));

        System.out.println(kStacksObj.pop(1));
        System.out.println(kStacksObj.pop(1));
        System.out.println(kStacksObj.pop(1));

        System.out.println(kStacksObj.pop(2));
        System.out.println(kStacksObj.pop(2));
        System.out.println(kStacksObj.pop(2));

    }
}
