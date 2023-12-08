//package dsa.heap;
//
//public class MaxAndMinHeap {
//    private int[] heapArray;
//    private int size;
//    private int maxSize;
//
//    public MaxAndMinHeap(int maxSize) {
//        this.maxSize = maxSize;
//        this.size = 0;
//        heapArray = new int[this.maxSize];
//    }
//
//    public int parent(int pos) {
//        return (pos - 1) / 2;
//    }
//
//    public int leftChild(int pos) {
//        return (2 * pos) + 1;
//    }
//
//    public int rightChild(int pos) {
//        return (2 * pos) + 2;
//    }
//
//    // MAX-HEAP
//    public void heapifyDown() {
//        int index = 0;
//        while (hasLeftChild(index)) {
//            int smallerChildIndex = getLeftChildIndex(index);
//            if (hasRightChild(index) && rightChild(index) > leftChild(index)) {
//                smallerChildIndex = getRightChildIndex(index);
//            }
//            if (items[index] > items[smallerChildIndex]) {
//                break;
//            } else {
//                swap(index, smallerChildIndex);
//            }
//
//            index = smallerChildIndex;
//        }
//    }
//
//    // MIN-HEAP
//    public void heapifyDown() {
//        int index = 0;
//        while (hasLeftChild(index)) {
//            int smallerChildIndex = getLeftChildIndex(index);
//            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
//                smallerChildIndex = getRightChildIndex(index);
//            }
//            if (items[index] < items[smallerChildIndex]) {
//                break;
//            } else {
//                swap(index, smallerChildIndex);
//            }
//
//            index = smallerChildIndex;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
