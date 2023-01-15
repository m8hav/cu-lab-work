#include <stdio.h>

int find_first_occurence(int arr[], int s, int k){
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
int find_last_occurence(int arr[], int s, int k){
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

    int first_occurence = find_first_occurence(arr, s, k);
    printf("\nFirst Occurence: %d\n", first_occurence);
    int last_occurence = find_last_occurence(arr, s, k);
    printf("\nLast Occurence: %d\n", last_occurence);

    int count = last_occurence-first_occurence+1;
    printf("\nCount: %d\n", count);

    return 0;
}