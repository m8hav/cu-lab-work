#include <stdio.h>

int no_of_duplicates(int arr[], int s){
    int map[1000] = {0};

    for (int i = 0; i<s; i++){
        map[arr[i]]++;
    }

    int duplicates = 0;

    for (int j = 0; j<1000; j++){
        if (map[j]){
            duplicates = duplicates+ (map[j] - 1);
        }
    }
    return duplicates;
}

int main(){

    int arr[] = {1, 2, 1, 2, 3, 3, 3, 4, 5};
    int s = sizeof(arr)/sizeof(arr[0]);
    
    printf("\n%d\n", no_of_duplicates(arr, s));
    return 0;
}