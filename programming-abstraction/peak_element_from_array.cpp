// February 13, 2023

// FIND PEAK ELEMENT FROM GIVEN ARRAY
// peak element is the element greater than
// both the elements before and after it in array
// i.e. array[i-1] < array[i] > array[i+1]
// and if element is first or last i.e. i == 0 or i == n-1
// then only compare it to the next or previous element that's available

#include <iostream>
using namespace std;

// finds all elements
// time complexity N i.e. size of array
void peak_element_slow(int arr[], int s){
    for (int i = 0; i < s; i++){
        if (i == 0 and arr[i] > arr[i+1]) cout << arr[i] << endl;
        else if (i == s-1 and arr[i-1] < arr[i]) cout << arr[i] << endl;
        else if (arr[i-1] < arr[i] and arr[i] > arr[i+1]) cout << arr[i] << endl;
    }
}

// DOESN'T ACTUALLY WORK BECAUSE IT MISSES PARTS OF ARRAY
// finds only first element
// time complexity log(N) using binary search
int peak_element_fast(int arr[], int s){
    int low = 0, high = s-1, mid;
    while (low < high){
        mid = (low+high)/2;
        if (mid == 0 and arr[mid] > arr[mid+1]) return mid;
        if (mid == s-1 and arr[mid] > arr[mid-1]) return mid;
        else if (arr[mid-1] < arr[mid] and arr[mid] > arr[mid+1]) return mid;
        // else high = mid-1;
        else low = mid+1;
        cout << "iter " << mid << endl;
    }
}

int main(){
    int arr[] = {3, 6, 2, 1, 7, 8};
    int s = sizeof(arr)/sizeof(int);

    peak_element_slow(arr, s);
    // peak_element_fast(arr, s);
    return 0;
}