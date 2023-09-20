package dsa.sorting.basic;

public class BasicSorting {
//    DOESN'T ACCEPT ARRAYS OF ANY TYPE YET
    public static <T> T[] doTemplateBubbleSort(T[] data) {
        if (data == null || data.length <= 1) return data;
        int n = data.length;
        T temp;
        int swaps;
        for (int i = 0; i < n; i++) {
            swaps = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j].hashCode() > data[j + 1].hashCode()) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) return data;
        }
        return data;
    }

    public static int[] doIntegerBubbleSort(int[] data) {
        if (data == null) return null;
        int n = data.length;
        int temp, swaps;
        for (int i = 0; i < n; i++) {
            swaps = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                    swaps++;
                }
            }
            if (swaps == 0) return data;
        }
        return data;
    }

    public static int[] doIntegerSelectionSort(int[] data) {
        if (data == null) return null;
        int n = data.length;
        int temp, minIndex;
        for (int i = 0; i < n-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++)
                if (data[j] < data[minIndex])
                    minIndex = j;
            if (minIndex != i) {
                temp = data[minIndex];
                data[minIndex] = data[i];
                data[i] = temp;
            }
        }
        return data;
    }

    public static int[] doIntegerInsertionSort(int[] data) {
        if (data == null) return null;
        int n = data.length;
        int temp, i, j;
        for (i = 1; i < n; i++) {
            temp = data[i];
            for (j = i-1; j > 0 && data[j] > temp; j--)
                data[j+1] = data[j];
            data[j+1] = temp;
        }
        return data;
    }
}
