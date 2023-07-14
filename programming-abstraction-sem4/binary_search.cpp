#include <iostream>
using namespace std;

// April 24, 2023

// Binary Search using Recursion

int binarySearch(int * arr, int start, int end, int k){
    int mid = (start + end)/2;

    if (start > end) return -1;

    if (arr[mid] == k) return mid;
    if (k < arr[mid]) return binarySearch(arr, start, mid - 1, k);
    else return binarySearch(arr, mid + 1, end, k);
    
}

int main(){

    cout << endl;

    int arr[] = {3, 5, 7, 12, 15, 16, 20, 34, 57, 89};
    int size = sizeof(arr)/sizeof(int);

    cout << "Size of array: " << size << endl;

    int k = 3;

    cout << "Index of " << k << ": " << binarySearch(arr, 0, size - 1, k) << endl;

    return 0;
}