#include <iostream>
using namespace std;

// April 24, 2023

// Find index of first element in sorted rotated array using Binary Search
// Then find number of clockwise and counter-clockwise rotations using index of first element

// CANNOT BE USED FOR ARRAYS WITH DUPLICATES

// My solution
int findIndexOfFirstElement(int * arr, int start, int end){

    if (start > end) return 0;

    int mid = (start + end)/2;

    if (mid == 0 || arr[mid-1] > arr[mid]) return mid;
    else if (arr[start] > arr[mid]) return findIndexOfFirstElement(arr, start, mid-1);
    else return findIndexOfFirstElement(arr, mid+1, end);
    
}

// Sir's solution finds last element
int findPivot(int arr[], int low, int high) 
{ 
   if (high < low)  return -1; 
   if (high == low) return low; 
  
   int mid = (low + high)/2;   /*low + (high - low)/2;*/
   if (mid < high && arr[mid] > arr[mid + 1]) 
       return mid; 
   if (mid > low && arr[mid] < arr[mid - 1]) 
       return (mid-1); 
   if (arr[low] >= arr[mid]) 
       return findPivot(arr, low, mid-1); 
   return findPivot(arr, mid + 1, high); 
}

int main(){

    cout << endl;

    // int arr[] = {12, 15, 16, 20, 34, 57, 89, 3, 5, 7};
    int arr[] = {5, 7, 12, 15, 16, 20, 34, 57, 89, 3};
    // int arr[] = {4, 4, 4, 4, 4, 4, 4, 4, 4, 4};

    // Fails in cases where 2 or more elements are same / arrays with duplicate elements
    // int arr[] = {4, 4, 4, 4, 4, 4, 4, 2, 4, 4};
    // int arr[] = {7, 7, 12, 15, 15, 16, 20, 34, 34, 57, 89, 3, 5, 7};

    int size = sizeof(arr)/sizeof(int);

    cout << "Size of array: " << size << endl;

    int indexOfFirstElement = findIndexOfFirstElement(arr, 0, size - 1);
    cout << "Index of first element: " << indexOfFirstElement << endl;
    cout << "Clockwise rotations: " << indexOfFirstElement << endl;
    cout << "Counter-Clockwise rotations: " << (size-indexOfFirstElement) % size << endl;

    // Sir's solution too fails because rotated array with duplicates goes against the concept of Binary Search
    // int indexOfPivotElement = findPivot(arr, 0, size - 1);
    // cout << "Index of pivot element: " << indexOfPivotElement << endl;

    return 0;
}