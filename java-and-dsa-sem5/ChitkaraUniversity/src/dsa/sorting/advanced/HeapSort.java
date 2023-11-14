package dsa.sorting.advanced;

public class HeapSort {

    public static void heapify(int[] array, int size, int root) {
        int largest = root;
        int leftChild = 2 * root + 1;
        int rightChild = 2 * root + 2;

        // if the left child is larger than the root
        if (leftChild < size && array[leftChild] > array[largest]) {
            largest = leftChild;
        }

        // if the right child is larger than the root
        if (rightChild < size && array[rightChild] > array[largest]) {
            largest = rightChild;
        }

        // if the largest is not at the root
        if (largest != root) {
            int swap = array[root];
            array[root] = array[largest];
            array[largest] = swap;

            // recursively heapify the affected subtree
            heapify(array, size, largest);
        }
    }

    public static void doHeapSort(int[] array) {
        int size = array.length;

        // STEP 01 - Build the max heap
        for (int i = (size / 2 - 1); i >= 0; i--) {
            heapify(array, size, i);
        }

        for (int i = (size - 1); i > 0; i--) {

            // STEP 02 - Extract elements from the Max-Heap one-by-one.
            // Swap the current root (max element) with the lsat element in the array)
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // STEP 03 - Call heapify on the reduced heap to re-build the Max-Heap;
            heapify(array, i, 0);
        }
    }

    // Max-Heap
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 3, 4};

        doHeapSort(arr);
    }
}
