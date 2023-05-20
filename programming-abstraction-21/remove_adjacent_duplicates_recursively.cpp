// March 4, 2023

// Given a string, remove all adjacent duplicates recursively
// EXAMPLES:
// INPUT 1:
// 4
// axyyxb
// hello
// codequotient
// abbbccb

// OUTPUT:
// ab
// heo
// codequotient
// ab

#include <bits/stdc++.h>
using namespace std;

string processString(string a)
{
    string b = "";
    int la = a.length();

    // Adding chars from a to b if previous and next chars aren't same as current
    if (a[0] != a[1])
        b += a[0];
    for (int i = 1; i < la - 1; i++)
    {
        if (a[i - 1] != a[i] && a[i] != a[i + 1])
            b += a[i];
    }
    if (a[la - 1] != a[la - 2])
        b += a[la - 1];

    // Checking if there are any adjacent duplicates in
    // new string and calling function again if there is
    int lb = b.length();
    for (int j = 0; j < lb - 1; j++)
    {
        if (b[j] == b[j + 1])
            return processString(b);
    }
    return b;
}

int main()
{
    int t, i, j = 0;
    string a;
    cin >> t;
    while (t--)
    {
        cin >> a;
        cout << processString(a) << "\n";
    }
    return 0;
}