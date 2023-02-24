#include <iostream>
using namespace std;

void gcd2(int a, int b){
    if (b == 0) cout << a;
    else gcd2(b, a%b);
}