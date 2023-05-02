#include <iostream>
using namespace std;

// May 1, 2023

// Rotate 2-D Array by 90 degrees

# define MAX_SIZE = 50;

void rotate_2d_array_90_degrees(int arr[MAX_SIZE][MAX_SIZE], int m, int n){

}

void print_2d_array(int arr[MAX_SIZE][MAX_SIZE], int m, int n){
    for (int i = 0; i < m; i++){
        for (int j = 0; j < n; j++){
            cout << arr[i][j] << " ";
        }
        cout << endl;
    }
}

int main(){

    cout << endl;

    int m = 3, n = 4;
    int arr[m][n] = {
        {1, 2, 3, 4},
        {5, 6, 7, 8},
        {9, 10, 11, 12}
    };

    rotate_2d_array_90_degrees(arr, m, n);

    print_2d_array(arr, m, n);

    cout << endl;

    return 0;
}