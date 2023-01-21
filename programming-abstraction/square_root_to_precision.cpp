// SOURCE:
// https://www.geeksforgeeks.org/find-square-root-number-upto-given-precision-using-binary-search/

#include <iostream>
using namespace std;

float square_root_to_precision(int n, int p){
    float ans;
    int start = 0, end = n, mid;
    
    // Getting floor of our answer by getting nearest integer smaller to our answer i.e. our ans here is the number whose square is <= n so that we can increment later.
    // We can also do this by getting nearest ceil and then decrementing with precision
    while (start <= end){
        mid = (start + end)/2;
        if (mid*mid == n){
            ans = mid;
            break;
        }
        else if (mid*mid < n){
            start = mid + 1;
            ans = mid;
        }
        else end = mid - 1;
    }
    
    // getting precise with increment of precision using iteration
    float increment = 0.1;
    for (int i = 0; i < p; i++){
        while (ans*ans <= n){
            ans += increment;
        }
        ans -= increment;
        increment /= 10;
    }
    return ans;
}

int main() {
    cout << square_root_to_precision(90, 3) << endl;
    // PROBLEM WITH 90 - IT OUTPUTS 5 PRECISION FOR 3+ GIVEN PRECISION
    cout << square_root_to_precision(50, 3) << endl;
    cout << square_root_to_precision(10, 4) << endl;
    return 0;
}