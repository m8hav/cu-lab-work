#include <iostream>
using namespace std;

// April 24, 2023

// Find first occurrence of number in array using Binary Search

int findFirstOccurrence(int * arr, int start, int end, int k){
    int mid = (start + end)/2;

    if (start > end) return -1;

    if (arr[mid] == k && (arr[mid-1] < k || mid == 0)) return mid;
    else if (arr[mid] == k || k < arr[mid]) return findFirstOccurrence(arr, start, mid - 1, k);
    else return findFirstOccurrence(arr, mid + 1, end, k);
    
}

int main(){

    cout << endl;

    int arr[] = {3, 5, 7, 7, 7, 12, 15, 15, 16, 20, 34, 34, 57, 89};
    int size = sizeof(arr)/sizeof(int);

    cout << "Size of array: " << size << endl;
    
    int k = 15;

    cout << "First index of " << k << ": " << findFirstOccurrence(arr, 0, size - 1, k) << endl;

    return 0;
}