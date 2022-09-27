// Online C compiler to run C program online
#include <stdio.h>

int main() {
    int arr[6] = {-5, -7, 3, 4, -6, 2};
    for (int i = 0; i < 6; i++){
        if (arr[i] >= 0){
            for (int j = i; j >= 0; j--){
                if (j-1 >= 0, arr[j-1]<0){
                    int a = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = a;
                }
                else {
                    break;
                }
            }
        }
    }
    for (int i = 0; i<6; i++){
        printf("%d, ", arr[i]);
    }
    return 0;
}