#include <stdio.h>

void printArray(int arr[], int size){
	for (int i = 0; i < size; i++){
		printf("%d", arr[i]);
		if (i < size-1) printf(", ");
	}
}

void main(){
	int arr[] = {5, 4, 3, 2, 1};
	int size = sizeof(arr)/sizeof(arr[0]);
	printArray(arr, size);
}