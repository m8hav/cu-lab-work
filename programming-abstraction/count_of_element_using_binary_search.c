#include <stdio.h>

int find_first_occurrence(int arr[], int s, int k){
    int low = 0, high = s-1, mid = 0;

    while(arr[mid] != k || arr[mid-1]==k){
        mid = (low+high)/2;

        if (arr[mid] == k && (mid==0 || arr[mid-1]!=k)){
            return mid;
        }else if(arr[mid] < k){
            low = mid;
        }else{
            high = mid;
        }
    }
}
int find_last_occurrence(int arr[], int s, int k){
    int low = 0, high = s-1, mid = 0;

    while(arr[mid] != k || arr[mid+1]==k){
        mid = (low+high)/2;

        if (arr[mid] == k && (mid==s-1 || arr[mid+1]!=k)){
            return mid;
        }else if(arr[mid] > k){
            high = mid;
        }else{
            low = mid;
        }
    }
}

int main(){
    // requires sorted array
    int arr[] = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3};
    
    int s = sizeof(arr)/sizeof(arr[0]);
    printf("\nSize: %d\n", s);

    int k = 0;
    printf("\nElement: %d\n", k);

    int first_occurrence = find_first_occurrence(arr, s, k);
    printf("\nFirst occurrence: %d\n", first_occurrence);
    int last_occurrence = find_last_occurrence(arr, s, k);
    printf("\nLast occurrence: %d\n", last_occurrence);

    int count = last_occurrence-first_occurrence+1;
    printf("\nCount: %d\n", count);

    return 0;
}