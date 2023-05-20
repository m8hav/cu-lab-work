// February 2, 2023

// example input is:
// 1, 2, 3, 4, 5, 6, 7, 8, 9
// k = groups = 3
// output should be
// 3, 2, 1, 6, 5, 4, 9, 8, 7
// if there are leftover elements,
// for example when size if 10 and k is 4,
// then reverse leftover elements at end as well

#include <iostream>
using namespace std;

int main() {
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int s = sizeof(arr)/sizeof(arr[0]);
    
    int k = 3; // group size
    
    int temp;
    for (int i = 0; i < s/k*k; i++){
        for (int j = i; j < (i+k)/2; j++){
            temp = arr[j];
            arr[j] = arr[i+k-j-1];
            arr[i+k-j-1] = temp;
        }
        i = i+k-1;
    }
    
    for (int z = 0; z < s; z++) cout << arr[z] << " ";
    
    return 0;
}