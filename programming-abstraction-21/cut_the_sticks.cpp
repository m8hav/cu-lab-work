// March 4, 2023

// Given an array, lengths, of N stick lengths (where each length is a positive integer), a cut operation reduces the length of each stick in the array by the length of the array's shortest stick. A stick can only be cut if it has a length ≥ 1.

// EXAMPLES:
// INPUT 1:
// 6
// 5 4 4 2 2 8

// OUTPUT:
// 6
// 4
// 2
// 1

// INPUT 2:
// 8
// 1 2 3 4 3 3 2 1

// OUTPUT:
// 8
// 6
// 4
// 1

#include <iostream>
#include <cstdlib>
using namespace std;

int cmp(const void *a, const void *b)
{
    return *(int *)a - *(int *)b;
}

int *cutSticks(int lengths_size, int *lengths, int *result_size)
{
    // sorting the array
    qsort(lengths, lengths_size, sizeof(int), cmp);

    // printing elements after skipping equal ones repeatedly
    for (int i = 0; i < lengths_size; i++)
    {

        // skipping all zeros since they can't be cut
        while (lengths[i] == 0)
            i++;

        cout << lengths_size - i << endl;
        while (i < lengths_size && lengths[i] == lengths[i + 1])
            i++;
    }
}

int main()
{
    int lengths_size;
    cin >> lengths_size;
    int lengths[lengths_size];
    for (int i = 0; i < lengths_size; i++)
        cin >> lengths[i];
    int result_size;
    cutSticks(lengths_size, lengths, &result_size);
    return 0;
}