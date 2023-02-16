// February 16, 2023

// CODEQUOTIENT QUESTION CODE

// EXAMPLES:

// INPUT:
// 4
// 22 4
// 3 R
// 22 4
// 3 C
// 22 4
// 6 R
// 22 4
// 4 C

// SUPPOSED INTERNAL 2D ARRAY:
//  1  2  3  4
//  5  6  7  8
//  9 10 11 12
// 13 14 15 16
// 17 18 19 20
// 21 22  0  0

// OUTPUT:
// 42
// 55
// 43
// 60

// INPUT:
// 2
// 5 2
// 2 C
// 10 3
// 4 R

// SUPPOSED INTERNAL 2D ARRAYS:
// 1 2
// 3 4
// 5 0

//  1  2  3
//  4  5  6
//  7  8  9
// 10  0  0

// OUTPUT:
// 6
// 10

#include <bits/stdc++.h>
using namespace std;

/*
 * Complete the 'solveQuery' function below.
 * @params
 *   N -> Total numbers from 1 to N
 *   W -> Maximum numbers in each row
 *   i -> First part of the query, denoting row or column number
 *   ch -> Second part of the query (i.e 'R' or 'C')
 *
 * @return
 *   The sum of numbers in the row or column, as per the query
 */

// FASTER METHOD
// Time Complexity: (N/W)+1 or W, whichever is greater
long solveQuery_fast(int N, int W, int i, char ch)
{
    if (i < 0)
        return 0;
    int nr = N / W;
    if (N % W != 0)
        nr++;

    long sum = 0;
    int k;
    if (ch == 'R')
    {
        k = (i - 1) * W + 1;
        while (k <= i * W and k <= N)
            sum += k++;
    }
    else
    {
        k = i;
        while (k <= N)
        {
            sum += k;
            k += W;
        }
    }

    return sum;
}

// SLOWER METHOD
// Creates an array and then traverses to add elements
// Time Complexity: ((N/W) + 1)*W + nr or W, whichever is greater
long solveQuery_slow(int N, int W, int i, char ch)
{
    int nr = N / W;
    if (N % W != 0)
        nr++;

    int narr[nr][W];
    int k = 1;
    for (int m = 0; m < nr; m++)
    {
        for (int n = 0; n < W; n++)
        {
            // narr[m][n] = m*W + n + 1;
            if (k <= N)
                narr[m][n] = k++;
            else
                narr[m][n] = 0;
        }
    }

    // printing new array
    // for (int z = 0; z < nr; z++)
    // {
    //     for (int y = 0; y < W; y++)
    //         cout << narr[z][y] << " ";
    //     cout << endl;
    // }

    long sum = 0;
    if (ch == 'C')
    {
        if (0 <= i and i <= W)
            for (int x = 0; x < nr; x++)
                sum += narr[x][i - 1];
    }
    else
    {
        if (0 <= i and i <= nr)
            for (int x = 0; x < W; x++)
                sum += narr[i - 1][x];
    }
    return sum;
}

int main()
{
    int t, n, w, i;
    char c;
    cin >> t;
    for (int k = 0; k < t; k++)
    {
        cin >> n >> w >> i >> c;
        cout << solveQuery_fast(n, w, i, c) << endl;
        cout << solveQuery_slow(n, w, i, c) << endl;
    }
    return 0;
}