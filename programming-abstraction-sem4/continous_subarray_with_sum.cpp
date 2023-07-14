#include <iostream>
using namespace std;

void print_continous_subarray_with_sum(int arr[], int s, int sum){
    int subsum = 0;
    
    for (int i = 0; i < s; i++){
        subsum = 0;
        for (int j = i; j < s; j++){
            subsum += arr[j];
            if (subsum == sum){
                cout << i << " " << j;
                return;
            }
            if (subsum > sum) break;
        }
    }
}

void main(){
    int arr[] = {2, 8, 10, 5, 20};
    int s = sizeof(arr)/sizeof(arr[0]);

    int sum = 23;

    print_continous_subarray_with_sum(arr, s, sum);
}