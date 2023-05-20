// February 13, 2023

// GIVEN AN ARRAY, CONVERT IT INTO A ZIG-ZAG ARRAY
// Zig-Zag array is such that
// arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]

// SOLUTION 1:
// sort array in ascending order using qsort - log(N)
    // (not required if array is already sorted)
// and swap every 2nd alternative element with it's next element

// SOLUTION 2 (implemented below):
// since every element at even index is smaller than elements before and after it
// and since every element at odd index is greater than elements before and after
    // (this can be inverse and you have to check in question)

// so we take one loop from i=0 to i=n-2
    // if index is even
        // if element is greater than the next
            // then swap the elements so even element is lesser than it's next element
        // else do nothing

    // if index is odd
        // if element is lesser than the next
            // then swap the elements so odd element is greater than it's next element
        // else do nothing

// this will leave every element at even index lesser than element before and after
// and every element at odd index greater than the ones before and after

#include <iostream>
using namespace std;

void swap(int * a, int * b){
    int temp = *a;
    *a = *b;
    *b = temp;
}

int main(){
    int arr[] = {2, 4, 5, 1, 7, 6, 8};
    int s = sizeof(arr)/sizeof(int);

    for (int i = 0; i < s-1; i++){
        if (i%2 == 0){
            if (arr[i] > arr[i+1]) swap(&arr[i], &arr[i+1]);
        }else {
            if (arr[i] < arr[i+1]) swap(&arr[i], &arr[i+1]);
        }
    }
    
    for (int j = 0; j < s; j++) cout << arr[j] << " ";
    return 0;
}