// SOURCE:
// https://www.geeksforgeeks.org/find-square-root-number-upto-given-precision-using-binary-search/

#include <iostream>
using namespace std;

float square_root_to_precision(float n, int p){
    float start = 0, end = n, mid, ans;
    
    // [when using int start, end, mid]
    // Getting integral (int)/floor part of our root by getting nearest integer smaller than our answer i.e. our ans here is the number whose square is <= n so that we can increment later.
    // We can also do this by getting nearest ceil and then decrementing with precision but that would give square slightly bigger than n in the end.
    while (start <= end){
        mid = (start + end)/2;
        if (mid == n/mid) return mid;
        else if (mid < n/mid){
            start = mid + 1;
            ans = mid;
        }else end = mid - 1;
    }
    
    // getting precise with increment of precision using iteration
    float increment = 0.1;
    for (int i = 0; i < p; i++){
        while (ans <= n/ans) ans += increment;
        ans -= increment;
        if (ans == n/ans) return ans;
        increment /= 10;
    }
    return ans;
}

/*
DRY RUN OF GETTING INTEGRAL/FLOOR PART
(actually not floor anymore due 
to use of float instead of int):

n = 65

while (start <= end):

mid			start		end			ans
														
-			0			65			-
32.5		0			31.5 		-
15.75		0 			14.75		-
7.375		8.375		14.75		7.375
11.5625		8.375		10.5625		7.375
9.46875		8.375		8.46875		7.375
8.421875	8.375		7.421875	7.375

stop because start > end

result = ans = 7.375
*/

int main() {
    cout << square_root_to_precision(90, 3) << endl;
    // PROBLEM WITH 90 (and some other numbers) 
    // - IT OUTPUTS WITH PRECISION DIFFERENT THAN SPECIFIED
    cout << square_root_to_precision(50, 3) << endl;

    cout << square_root_to_precision(10, 4) << endl;
    cout << square_root_to_precision(64, 4) << endl;

    cout << square_root_to_precision(63.4359, 5) << endl;
    cout << square_root_to_precision(65.2864, 5) << endl;
    
    cout << square_root_to_precision(65.2864, 6) << endl;
    cout << square_root_to_precision(65, 6) << endl;
    return 0;
}