// 2 - Jan 11, 2023

#include <stdio.h>

void rotate_array(int arr[], int s, int r){
    int temp;
    while (r--){
        temp = arr[0];
        for (int i = 0; i < s-1; i++){
            arr[i] = arr[i+1];
        }
        arr[s-1] = temp;
    }
}

int main(){

    int arr[] = {5, 10, 1, 3, 7, 4};

    int s = sizeof(arr)/sizeof(arr[0]);
    int r = 2;

    printf("\n");
    for (int j = 0; j < s; j++){
        printf("%d, ", arr[j]);
    }
    printf("\n\n");

    rotate_array(arr, s, r);

    for (int j = 0; j < s; j++){
        printf("%d, ", arr[j]);
    }
    printf("\n");
}