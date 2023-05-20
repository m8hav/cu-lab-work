// February 15, 2023

// SET ROW AND COLUMN TO ZERO FOR EVERY CELL VALUE ZERO

// EXAMPLE 1:
// 1 2 3
// 1 0 3
// 1 0 3

// Output:
// 1 0 3
// 0 0 0
// 0 0 0

// EXAMPLE 2:
// 1 2 3
// 4 0 6
// 7 8 9

// Output:
// 1 0 3
// 0 0 0
// 8 0 9

#include <iostream>
using namespace std;

int main(){
    int s = 3;
    int arr[s][s] = {
        {1, 2, 3},
        {1, 0, 3},
        {1, 0, 3},
    };

    // creating n*n 1-D array to find row and column index of cell value 0
    int zero_indexes[s*s] = {0};
    // 0 0 0 0 1 0 0 1 0
    // 0 1 2 3 4 5 6 7 8

    // traversing array to fill zero_indexes array
    for (int i = 0; i < s; i++){
        for (int j = 0; j < s; j++){
            if (! arr[i][j]){
                zero_indexes[i*s + j]++;
            }
        }
    }

    // traversing zero_indexes and making rows and columns zero where zero_indexes value is 0
    int zr, zc;
    for (int z = 0; z < s*s; z++){
        if (zero_indexes[z]){
            zr = z/s;
            zc = z%s;
            // n complexity - only doing 2 simple for loops to make zr row and zc column zero
            for (int r = 0; r < s; r++){
                arr[r][zc] = 0;
            }
            for (int c = 0; c < s; c++){
                arr[zr][c] = 0;
            }
            // n*n complexity - complete traversal of original array and zeroing values where row = zr and column = zc
            // for (int r = 0; r < s; r++){
            //     for (int c = 0; c < s; c++){
            //         if (r == zr or c == zc){
            //             arr[r][c] = 0;
            //         }
            //     }
            // }
        }
    }
    
    // printing updated array
    for (int m = 0; m < s; m++){
        for (int n = 0; n < s; n++){
            cout << arr[m][n] << " ";
        }
        cout << endl;
    }

    return 0;
}