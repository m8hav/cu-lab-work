// January 30, 2023

//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16

// should be printed as:
// 1 2 5 3 6 9 4 7 10 13 8 11 14 12 15 16

#include <iostream>
using namespace std;

#define A_SIZE 50

// works fine
void sirs_method(int n, int (&arr)[4][4]){
    int r = 0, c;
    for (c = 0; c < n; c++){
        int i = r, j = c;
        while (i < n && j >= 0){
            cout << arr[i][j] << " ";
            i++, j--;
        }
    }
    c = n-1;
    for (r = 1; r < n; r++){
        int i = r, j = c;
        while (i < n && j >= 0){
            cout << arr[i][j] << " ";
            i++, j--;
        }
    }
}

// fixed second loop
// had wrong indexing in commented part
void my_method(int n, int arr[4][4]){
    int t, i, j;
    for (t = 0; t < n; t++){
        for (i = 0; i <= t; i++){
            cout << arr[i][t-i] << " ";
        }
    }
    for (t = n-2; t >= 0; t--){
        for (i = 0; i <= t; i++){
            // cout << arr[n+i][n+t-i] << " ";
            cout << arr[n-t+i-1][n-i-1] << " ";
        }
    }
}

int main(){
    int n = 4;
    int arr[4][4] = {
        { 1,  2,  3,  4},
        { 5,  6,  7,  8},
        { 9, 10, 11, 12},
        {13, 14, 15, 16}
    };

    // sirs_method(n, arr);
    my_method(n, arr);
    return 0;
}