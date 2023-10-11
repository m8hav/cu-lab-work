package dsa.stackQueue.stack;

import java.util.Stack;

public class SortStack {

    private Stack<Integer> stack;

    public SortStack() {
        this.stack = new Stack<>();
    }

    public void addValuesInStack() {
        stack.push(5);
        stack.push(2);
        stack.push(7);
        stack.push(6);
        stack.push(8);
        stack.push(1);
        stack.push(3);
        stack.push(4);
    }

//    5 2 7 6 8 1 3 4

//
//
//    8 7 6 5 4 3 2 1

    public void sortStack(Stack <Integer> stack) {
        Stack <Integer> tempStack = new Stack<>();

        int currentPoppedValue;

//        using the concept of insertion sort

//        we take a temporary stack - temp
//        we push a value in temp in the beginning
//        then we pick a value from main stack - current
//            then in a loop (until main stack is empty):
//              compare current with last element of temp
//                if last element is bigger than current then we pop last from temp and push into main stack
//                otherwise we push current into temp
//        when done with loop we'll have elements in descending order in temp and main stack will be empty

//        then pop values from temp and add to main stack to add in required ascending order

        while (!stack.isEmpty()) {
            currentPoppedValue = stack.pop();

            while (!tempStack.empty() && tempStack.peek() > currentPoppedValue)
                stack.push(tempStack.pop());

            tempStack.push(currentPoppedValue);
        }

//        Finally fill all values from tempStack to main stack
        while (!tempStack.isEmpty())
            stack.push(tempStack.pop());

    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public void setStack(Stack<Integer> stack) {
        this.stack = stack;
    }

    public int pop() {
        if (stack.empty()) return -1;
        return stack.pop();
    }

    public void push(int value) {
        stack.push(value);
    }

    public void showStack() {
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public static void main(String[] args) {
        SortStack obj = new SortStack();

        obj.addValuesInStack();
        obj.sortStack(obj.getStack());
        System.out.println(obj);
        obj.showStack();
        System.out.println(obj);
    }
}
