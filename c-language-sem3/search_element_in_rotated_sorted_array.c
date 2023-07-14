#include <stdio.h>

int findPivot(int arr[], int low, int high){
    if (high < low) return -1;
    if (high == low) return low;

    int mid = (low + high)/2;   /* low + (high - low)/2; */
    if (mid < high && arr[mid] > arr[mid + 1])
        return mid;
    if (mid > low && arr[mid] < arr[mid-1])
        return (mid - 1);
    if (arr[low] >= arr[mid])
        return findPivot(arr, low, mid-1);
    return findPivot(arr, mid + 1, high);
}

int binarySearch(int arr[], int low, int high, int key){
    if (high < low)
        return -1;
    int mid = (low + high)/2;
    if (key == arr[mid])
        return mid;
    if (key > arr[mid])
        return binarySearch(arr, (mid + 1), high, key);
    return binarySearch(arr, low, (mid - 1), key);
}

int searchRotatedSortedArray(int *a, int size, int target){
    int pivot = findPivot(a, 0, size-1);
    if (pivot == -1)
        return binarySearch(a, 0, size-1, target);
    if (a[pivot] == target)
        return pivot;
    if (a[0] <= target)
        return binarySearch(a, 0, pivot-1, target);
    return binarySearch(a, pivot+1, size-1, target);
}

int main() {
    int arr[] = {4, 5, 6, 1, 2, 3};
    int size = 6;
    int target = 2;
    
    printf(searchRotatedSortedArray(arr, size, target));
    return 0;
}