#include <stdio.h>

int bubbleSort(int arr[], int s){
    int temp, swaps = 0;
    for (int j = 0; j < s; j++){
        int sorted = 1;
        for (int i = 0; i < s-1; i++){
            if (arr[i] > arr[i+1]){
                sorted = 0;
                swaps++;
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        if (sorted){
            break;
        }
    }
    return swaps;
}

int main() {
    int t, s;
    scanf("%d", &t);
    while (t--){
        scanf("%d", &s);
        int arr[s];
        for (int y = 0; y<s; y++){
          scanf("%d", &arr[y]);
        }
        printf("\n%d", bubbleSort(arr, s));
    }
}