// SORTS ARRAY ITSELF

#include <stdio.h>
#include <stdlib.h>

int cmpf(const void * a, const void *b){
  return *(int*)a - *(int *)b;
}

int main(){
    // int arr[] = {3, 3, 4, 5, 5, 6};
    int arr[] = {5, 2, 3, 7, 4, 3};
    // int arr[] = {6, 5, 4, 3, 2, 1};
    int n = sizeof(arr)/sizeof(int);

    qsort(arr, n, 4, cmpf);
    
    for(int i = 0; i < n; i++){
    	printf("%d\n", n-i);
    	while (i < n-1 && arr[i] == arr[i+1]) i++;
    }
    return 0;
}