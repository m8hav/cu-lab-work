// January 30, 2023

#include <iostream>
using namespace std;

// FUNCTION WITH APPROPRIATE PARAMETER DATATYPE WILL BE AUTOMATICALLY USED

int fun1(int a, int b){
    return a + b;
}
// DEFINING ANOTHER FUNCTION WITH SAME NAME TO PROVIDE ADDITIONAL FUNCTIONALITY
double fun1(double a, double b){
    return a + b;
}

int main(){
    int c = fun1(20, 20);
    int d = fun1(25.3, 25.3);
    cout << c << endl;
    cout << d << endl;
    return 0;
}