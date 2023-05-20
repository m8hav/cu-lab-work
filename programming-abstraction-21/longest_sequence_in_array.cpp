#include <iostream>
using namespace std;

int max_of_two(int a, int b){
    if (a >= b) return a;
    else return b;
}

int find_longest_sequence(int arr[], int s){
    int max = 0;
    for (int h = 0; h < s; h++){
        if (arr[h] > max) max = arr[h];
    }
    
    int hash[max] = {0};
    for (int i = 0; i < s; i++){
        hash[arr[i]]++;
    }

    int longest = 0, current_long = 0;
    for (int j = 0; j < max; j++){
        if (hash[j] >= 1) current_long++;
        else{
            longest = max_of_two(longest, current_long);
            current_long = 0;
        }
    }

    return longest;
}

int main(){

    int arr[10] = {1, 2, 4, 6, 7, 10, 11, 13, 15};
    int s = sizeof(arr)/sizeof(arr[0]);

    cout << find_longest_sequence(arr, s);

    return 0;
}