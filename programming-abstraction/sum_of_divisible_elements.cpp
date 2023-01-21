#include <iostream>
using namespace std;

int main(){
    int n = 12, sum = 0;

    int div_1 = 3;
    int div_2 = 5;

    // SLOW METHOD
    // for (int i = 1; i <= n; i++){
    //     if (i % div_1 == 0 || i % div_2 == 0) sum += i;
    // }

    // FAST METHOD USING AP
    sum = (n/div_1)*((n/div_1)+1)/2*div_1 + (n/div_2)*((n/div_2)+1)/2*div_2 - (n/(div_1*div_2))*((n/div_1*div_2)+1)/2*(div_1*div_2);

    cout << sum;
    return 0;
}