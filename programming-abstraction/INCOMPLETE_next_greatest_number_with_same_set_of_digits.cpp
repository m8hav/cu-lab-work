// February 9, 2023

// FIND NEXT GREATEST NUMBER WITH SAME SET OF DIGITS

// https://www.geeksforgeeks.org/find-next-greater-number-set-digits/
// Examples:
// Input:  n = "218765"
// Output: "251678"

// Input:  n = "1234"
// Output: "1243"

// Input: n = "4321"
// Output: "Not Possible"
// I did for Output: "4321"

// Input: n = "534976"
// Output: "536479"


// STEPS TO FOLLOW:
    // 1. Traverse the string from right side till (i-1)-th digit is less than i-th digit - to find the smallest digit to swap i.e. the (i-1)-th digit.
    // 2. Swap (i-1)-th digit with the smallest number greater than (i-1)-th digit in the right side i.e. in the substring from i to s-1, s is size of full number string - so the number is as small as possible.
    // 3. Sort the substring from i to s-1 in ascending order to make the leftover digits make a number as small as possible.

#include <iostream>
#include <bits/stdc++.h>
using namespace std;

int main(){
    
    // string number = "8580474936";
    // string number = "218765";
    // string number = "1234";
    string number = "4321";
    int s = number.length();

    cout << "Original Number String: " << number << endl;
    
    // STEP 1
    int i = s-1;
    for (i; i > 0; i--){
        if(number[i-1] < number[i]) break;
    }
    cout << "step 1 done" << endl;
    // STEP 2
    
    int j, sm_sub = s-1;
    for (j = i; j < s; j++){
        if (number[j] < number[sm_sub] && number[j] > number[i-1]) sm_sub = j;
    }
    char temp = number[i-1];
    number[i-1] = number[sm_sub];
    number[sm_sub] = temp;
    cout << "step 2 done" << endl;
    
    // STEP 3
    string next_greatest = number;
    sort(next_greatest.begin()+i, next_greatest.end());
    cout << "step 3 done" << endl;
    
    cout << "Next Greatest Number String: " << next_greatest << endl;
    return 0;
}