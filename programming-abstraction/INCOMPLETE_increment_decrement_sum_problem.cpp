// February 9, 2023

// int a = 5;
// int c = ++a + a++ + --a;
// cout << c;
// BY LOGIC, OUTPUT SHOULD BE 18
// BUT OUTPUT OF PROGRAM IS 19, WHY SO??

#include <iostream>
using namespace std;

int main() {
    int a = 5;
    int c = ++a + a++ + --a;
    cout << c;

    return 0;
}