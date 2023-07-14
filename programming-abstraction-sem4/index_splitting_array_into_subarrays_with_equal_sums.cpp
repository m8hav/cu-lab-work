// February 9, 2023

// FIND INDEX SPLITTING ARRAY INTO SUBARRAYS (LEFT AND RIGHT) HAVING EQUAL SUMS

// Examples:
// 2 4 5 1 2 3
// split from 5 so that 2+4 = 6 and 1+2+3 = 6

// if not possible then print not possible

#include <iostream>
using namespace std;

int main(){

    // int arr[] = {2, 4, 5, 1, 2, 3};
    // int arr[] = {1, 1, 4, 5, 1, 2, 3};
    // int arr[] = {3, 4, 5, 1, 2, 3};
    // int arr[] = {8, 5, 8, 0, 4, 7, 4, 9, 3, 6};
    // int arr[] = {6, 2, 3, 0, 8, 6, 8, 8, 2, 5};
    // int arr[] = {4, 3, 2, 1, 1, 1, 2, 3, 4};
    int arr[] = {4, 3, 2, 1, 1, 2, 3, 4};
    int s = sizeof(arr)/sizeof(int);

    // creating array with sum starting from left
    int sum_from_left[s], sum = 0;
    for (int i = 0; i < s; i++){
        sum += arr[i];
        sum_from_left[i] = sum;
    }

    // creating array with elements subtracted from previous sum starting from left
    int sum_left_subtracted[s], diff = sum;
    for (int j = 0; j < s; j++){
        sum_left_subtracted[j] = diff;
        diff -= arr[j];
    }

    // matching both arrays to find index where both have same sum or value
    // it gives the index where both sides' sub-arrays have equal sums
    bool flag = false;
    for (int k = 0; k < s; k++){
        if (sum_from_left[k] == sum_left_subtracted[k]){
            cout << k << endl;
            flag = true;
            break;
        }
    }

    // printing not possible if no index splits sub-arrays with equal sums
    if (!flag) cout << "No index splitting array into sub-arrays with equal sums" << endl;
    

    return 0;
}
