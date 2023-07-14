#include <stdio.h>

int bubbleSort(int arr[], int s, int p){
    int sorted = 1, temp;
    for (int i = 0; i < s-1; i++){
        if (arr[i] > arr[i+1]){
            temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;
            sorted = 0;
        }
    }
    // printf("\npass");
    printf("\nPass %d", p);
    return sorted;
}

int main() {
    int s = 6;
    // int arr[] = {10, 7, 15, 13, 20, 17};
    int arr[] = {10, 7, 15, 13, 2, 1};
    
    int p = 0;
    while (1){
        p++;
        if (bubbleSort(arr, s, p)){
            break;
        }
    }
    
    printf("\n\n");
    for (int j = 0; j < s; j++){
        printf("%d, ", arr[j]);
    }
    printf("\n\n%d total passes taken", p);
    return 0;
}