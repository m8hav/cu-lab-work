// March 6, 2023

// CodeQuotient Recursion Module last question:
// Find all permutations of a string

// Given a string with distinct characters, find all the permutations of it.
// A permutation of string is an arrangement of its characters in some specific order. A given string of size n will have n! permutations possible.
// Note: The order of permutations does not matter, print them in any order.

// EXAMPLES:
// INPUT 1:
// ABC

// OUTPUT:
// ABC
// ACB
// BAC
// BCA
// CAB
// CBA


#include <iostream>
using namespace std;

// Mukesh Sir's Solution for question completion:

// void swap(char * x, char * y) is already defined
void permute(string &str, int p, int n, vector<string> &permutations) {
    int i;
    if (p == n-1) {
        string s = str;
        permutations.push_back(s);
    } else {
        for (i = p; i < n; i++) {
            swap(&str[p], &str[i]);
            permute(str, p + 1, n, permutations);
            swap(&str[p], &str[i]);
        }
    }
}

// The first argument is the input string, and the 2nd argument is the empty vector of strings. 
// Dont print the permutations. You need to save all permutations in the vector, passed as the 2nd argument.
void allPermutations(string str, vector<string> &permutations)
{
    permute(str, 0, str.length(), permutations);
}