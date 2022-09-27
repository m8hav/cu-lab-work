#include <stdio.h>

int main(){
    int n = 6;
    int arr[] = {5, 4, 7, 3, 2, 6};
    int k = 5;

    printf("Array is: [");
    for (int i = 0; i < n; i++){
        printf("%d", arr[i]);
        if (i<n-1){
            printf(", ");
        }else{
            printf("]\n");
        }
    }
    
    int im, temp;
    for (int i = 0; i < n; i++){
        im = i; // index of maximum element
        // assuming index of maximum element is i before each internal iteration
        for (int j = i+1; j < n; j++){
            // starting loop from i+1 so that we skip the already sorted elements
            // this is basically selection sorting
            if (arr[j] > arr[im]){
                im = j;
            }
        }
        temp = arr[im];
        arr[im] = arr[i];
        arr[i] = temp;
    }
    
    printf("\n%dth largest element is: %d", k, arr[k-1]);
    return 0;
}