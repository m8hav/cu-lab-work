#include <stdio.h>

int main() {
    int arr[] = {6, 7, 1, 2, 3, 4, 5};
    int s = 7;
    
    for (int i = 0; i < s - 1; i++){
        if (arr[i] > arr[i+1]){
            printf("%d", i+1);
        }
    }
}

