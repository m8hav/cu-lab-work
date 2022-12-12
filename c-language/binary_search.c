#include<stdio.h>

int binarySearch(int arr[], int s, int k){
    int low = 0, mid, high = s-1;
    while (low < high){
        mid = (low+high)/2;
        if (arr[mid] == k) return mid;
        if (k < arr[mid]) high = mid - 1;
        else low = mid + 1;
    }
    return -1;
}

int main()
{
  int arr[] = {10, 20, 30, 40, 50, 60};
  int s = sizeof(arr)/sizeof(arr[0]);
  printf("Size of array: %d\n", s);
  int k = 50;
  printf("Element %d is found at index %d\n", k, binarySearch(arr, s, k));
}