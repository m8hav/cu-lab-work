#include <iostream>
using namespace std;

int lcm(int a, int b){
    for (int i = 1; i < a*b; i++){
        if (i%a == 0 && i%b == 0) return i;
    }
    return a*b;
}

int sum_of_divisible_elements_using_brute_force(int n, int div_1, int div_2){
    int sum = 0;
    for (int i = 1; i <= n; i++){
        if (i % div_1 == 0 || i % div_2 == 0) sum += i;
    }
    return sum;
}

int sum_of_divisible_elements_using_sum_till_n_ap_derivation(int n, int div_1, int div_2){
    int sum = 0;
    int div_1_2_lcm = lcm(div_1, div_2);
    sum = (n/div_1)*((n/div_1)+1)/2*div_1 + (n/div_2)*((n/div_2)+1)/2*div_2 - (n/(div_1_2_lcm))*((n/div_1_2_lcm)+1)/2*(div_1_2_lcm);
    return sum;
}

int sum_of_divisible_elements_using_ap_sum_till_n(int n, int div_1, int div_2){
    int sum = 0;
    int div_1_n = n/div_1;
    int sum_of_div_1 = div_1_n/2*(2*div_1 + (div_1_n-1)*div_1);
    int div_2_n = n/div_2;
    int sum_of_div_2 = div_2_n/2*(2*div_2 + (div_2_n-1)*div_2);
    int div_1_2_common_n = lcm(div_1, div_2);
    int sum_of_div_1_2_common = div_1_2_common_n/2*(2*div_1_2_common_n + (div_1_2_common_n-1)*div_1_2_common_n);

    sum = sum_of_div_1 + sum_of_div_2 - sum_of_div_1_2_common;
    // INCOMPLETE
    return sum;
}

int main(){
    int n = 12, sum;

    int div_1 = 3;
    int div_2 = 5;

    // SLOW METHOD USING BRUTE FORCE
    sum = sum_of_divisible_elements_using_brute_force(n, div_1, div_2);
    cout << sum << endl;

    // FAST METHOD USING SUM TILL N FORMULA (from AP):
    // n*(n+1)/2
    sum = sum_of_divisible_elements_using_sum_till_n_ap_derivation(n, div_1, div_2);
    cout << sum << endl;

    // FAST METHOD USING AP MAIN FORMULA
    // AP Formula: Sn = (n/2)*(2a+(n-1)*d), where n is number of terms, a is first term, and d is common difference
    sum = sum_of_divisible_elements_using_ap_sum_till_n(n, div_1, div_2);
    cout << sum << endl;

    return 0;
}