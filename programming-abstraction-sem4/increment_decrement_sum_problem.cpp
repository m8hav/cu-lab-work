// February 9, 2023

// int a = 5;
// int c = ++a + a++ + --a;
// cout << c;
// BY LOGIC, OUTPUT SHOULD BE 18
// BUT OUTPUT OF PROGRAM IS 19, WHY SO??

// ANSWER:
// precedence of ++ is more than +

// ++ has more precedence than + in ++a + a++
// technically it's answer should have been 6 (++a) + 6 (a++) = 12
// but actually it's answer is 6(++a) + 7 (a++)
// because ++ has higher precedence than + in + a++
// and so a++ gets executed first to make value 7 and then
// gets added to 6 from ++a
// then --a just gives 6 and gets added to 13 to make 19

#include <iostream>
using namespace std;

int main() {
    int a = 5;
    int c = ++a + a++ + --a;
    cout << c;

    return 0;
}