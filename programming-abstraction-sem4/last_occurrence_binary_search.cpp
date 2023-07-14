#include <iostream>
using namespace std;

// April 24, 2023

// Find last occurrence of number in array using Binary Search

int findLastOccurrence(int * arr, int size, int start, int end, int k){
    int mid = (start + end)/2;

    if (start > end) return -1;

    if (arr[mid] == k && (arr[mid+1] > k || mid == size - 1)) return mid;
    else if (arr[mid] == k || k > arr[mid]) return findLastOccurrence(arr, size, mid + 1, end, k);
    else return findLastOccurrence(arr, size, start, mid - 1, k);
    
}

int main(){

    cout << endl;

    int arr[] = {3, 5, 7, 7, 7, 12, 15, 15, 16, 20, 34, 34, 57, 89};
    int size = sizeof(arr)/sizeof(int);

    cout << "Size of array: " << size << endl;
    
    int k = 15;

    cout << "Last index of " << k << ": " << findLastOccurrence(arr, size, 0, size - 1, k) << endl;

    return 0;
}