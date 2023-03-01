// March 1, 2023

// Given a number N, find the corresponding character string of an excel column of that number N

// EXAMPLES:
// INPUT 2:
// 5

// OUTPUT:
// E

// INPUT 2:
// 27

// OUTPUT:
// AA

#include <iostream>
using namespace std;

string excel_column_name(int n){
    string name = "";

    if (n > 26) name += excel_column_name(n/26);
    if (n%26 == 0) name += 'Z';
    else name += ('A' + n%26 - 1);
    
    return name;
}

int main(){
    int n;
    cin >> n;

    if (n <= 0) cout << 0;

    cout << excel_column_name(n);
}