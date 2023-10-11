package dsa.stackQueue.stack;

public class TwoStacksInArray {
    private int[] arr;

    private int top1;
    private int top2;

    public TwoStacksInArray(int capacity) {
        arr = new int[capacity];
        top1 = -1;
        top2 = capacity;
    }

    public boolean push1(int value) {
        if (top1 + 1 < top2) {
            arr[++top1] = value;
            return true;
        }
        return false;
    }

    public boolean push2(int value) {
        if (top2 - 1 > top1) {
            arr[--top2] = value;
            return true;
        }
        return false;
    }

    public int pop1() {
        if (!isEmpty1())
            return arr[top1--];
        throw new IllegalStateException("Stack 1 is empty.");
    }

    public int pop2() {
        if (!isEmpty2())
            return arr[top2++];
        throw new IllegalStateException("Stack 2 is empty.");
    }

    public boolean isEmpty1() {
        return top1 == -1;
    }

    public boolean isEmpty2() {
        return top2 == arr.length;
    }

    public static void main(String[] args) {

    }
}
