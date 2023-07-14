// January 30, 2023

// FIND LONGEST SUBSEQUENCE (ORDERED SUBSTRING) THAT IS A PALINDROME
// AND SUBTRACT IT'S LENGTH FROM ORIGINAL LENGTH OF STRING
// THIS GIVES NUMBER OF CHARS YOU'LL HAVE TO ADD AT DIFFERENT PLACES
// TO MAKE THE STRING A PALINDROME

// February 16, 2023

// ^ tried doing the January 30, 2023 method and just finding all the
// subsequences resulted in horrible complexity ("subsequences_of_string.cpp")
// so left it on others' methods

// Mukesh Sir -
// To do this question in O(N) complexity you need to learn about KMP
// which is used to check or compare substrings or something


#include <iostream>
using namespace std;

// Harshit Aggarwal's Solution
// O(N) complexity - works for all personal and CQ test cases so far
int min_insertions(string str)
{
    int start = 0;
    int end = str.length() - 1;
    int sum = 0;

    while (start < end)
    {
        if (str[start] != str[end])
        {
            if (str[start] == str[end - 1])
            {
                end--;
                sum++;
            }
            else
            {
                sum++;
                start++;
            }
        }
        else
        {
            start++;
            end--;
        }
    }
    return sum;
}

int main()
{
    string str = "hello";

    cout << min_insertions(str);
}