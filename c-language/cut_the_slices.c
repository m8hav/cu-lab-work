#include <stdio.h>
int main() {
    int arr[] = {5, 2, 3, 7, 4, 3};
    int len = sizeof(arr)/sizeof(arr[0]);
    int all_zeros = 0;
    while (all_zeros == 0){
        printf("Array: ");
        for (int l = 0; l < len; l++){
            printf("%d ", arr[l]);
        }
        int min = 999999;   // setting min element to max possible value so all numbers in array are smaller/equal for comparison
        all_zeros = 1;  // assuming all elements in array are zeros
        for (int i = 0; i < len; i++){  // checking if there's any non-zero number in array
            if (arr[i] != 0){
                all_zeros = 0;  // marking all_zeros false if there's any non-zero number
                if (arr[i] < min){
                    min = arr[i];   // getting minimum non-zero number from array
                }
            }
        }
        if (all_zeros == 0){    // subtracting min from non-zero elements if all not zeros
            printf("\nMin: %d", min);
            int final = 0;
            for (int k = 0; k < len; k++){
                if (arr[k] != 0){
                    arr[k] -= min;
                    final++;
                }
            }
            printf("\nElements changed: %d\n\n", final);
        }
    }
}