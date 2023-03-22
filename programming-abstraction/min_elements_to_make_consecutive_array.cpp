// March 13, 2023

// Given an array with random numbers, find the minimum number of elements to add to make the array consecutive
// ARray may be unsorted and have duplicate elements
// EXAMPLE:
// Array: {8, 2, 6, 4, 2}
// Output: 3
// Array: {9, 2, 6, 4, 2}
// Output: 4
// Time Complexity: O(N)

// COMMAND TO RUN USING CMD
// g++ min_elements_to_make_consecutive_array.cpp -o min_elements_to_make_consecutive_array && min_elements_to_make_consecutive_array

#include <iostream>
// #include <climits>   // INT16_MAX AND INT16_MIN somehow work even without this header
using namespace std;

int main()
{
    int arr[] = {9, 2, 6, 4, 2};
    int s = sizeof(arr)/sizeof(int);

    // getting minimum and maximum in array to create hashmap later
    int min = INT16_MAX, max = INT16_MIN;
    for (int i = 0; i < s; i++){
        if (arr[i] < min) min = arr[i];
        if (arr[i] > max) max = arr[i];
    }

    // creating hashmap from minimum to maximum elements and filling frequency
    int ms = max-min;
    int map[ms] = {0};
    for (int j = 0; j < s; j++){
        map[arr[j] - min]++;
    }

    // incrementing count whenever frequency is 0
    int count = 0;
    for (int k = 0; k < ms; k++){
        if (map[k] == 0) count++;
    }
    
    // output
    cout << count << endl;

    return 0;
}