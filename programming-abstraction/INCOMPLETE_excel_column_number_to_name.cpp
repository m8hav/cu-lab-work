// March 1, 2023

// Given a number N, find the corresponding character string of an excel column of that number N

// EXAMPLES:
// INPUT 1:
// 12
// 0 1 25 26 27 100 701 702 703 1000 10000 16384

// OUTPUT:
// 0
// A
// Y
// Z
// AA
// CV
// ZY
// ZZ // problem here, current output AAZ
// AAA
// ALL
// NTP
// XFD

#include <iostream>
using namespace std;

string excel_column_name(int n){
    string name = "";

    // if (n > 26){
    //     name += excel_column_name(n/26);
    //     n %= 26;
    // }
    // // if (n%26 == 0) name += 'Z';
    // // else name += ('A' + n%26 - 1);
    // // n %= 26;
    // if (n) name += ('A' + n%26 - 1);

    // if (n > 26){
    //     int q = n/26;
    //     name += excel_column_name(q);
    //     n /= q;
    // }
    // if (n){
    //     if (n%26 == 0) name += 'Z';
    //     else name += ('A' + n%26 - 1);
    // }

    if (n > 26) name += excel_column_name(n/26);
    if (n) {
        if (n%26 == 0) name += 'Z';
        else name += ('A' + n%26 - 1);
    }
    
    return name;
}

int main(){
    int t, n;
    cin >> t;
    while (t--){
        cin >> n;
        if (!n) cout << 0 << endl;
        else cout << excel_column_name(n) << endl;
    }
}