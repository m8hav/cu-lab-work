#include <stdio.h>

int main(){
    int n = 6;
    int arr[] = {5, 4, 7, 3, 2, 6};
    
    printf("Array is: [");
    for (int i = 0; i < n; i++){
        printf("%d", arr[i]);
        if (i<n-1){
            printf(", ");
        }else{
            printf("]\n");
        }
    }
    
    int iosl = -1, iol = 0; // index of largest and second largest
    // index of largest is 0 assuming the first element in array is largest
    // index of second largest is -1 assuming all the elements are same
    for (int i = 1; i < n; i++){
        if (arr[i]>arr[iol]){
        	iosl = iol;
        	iol = i;
        }else if(arr[i]!=arr[iol]){
        	if (iosl == -1 || arr[i] > arr[iosl]){
        		iosl = i;
        	}
        }
    }
	printf("\nLargest element is: %d (index %d)", arr[iol], iol);
	printf("\nSecond largest element is: %d (index %d)", arr[iosl], iosl);
    return 0;
}