#include <iostream>
#include <cstring>
using namespace std;

// complexity unknown
// but it's so bad it takes minutes to run
// for a string of length around 9 or more
void print_subsequences(char *str)
{
    int n = strlen(str);

    if (n <= 1)
        return;

    // creating new string with n-1 size to temporarily fill subsequences
    // to print and pass to this function again
    string subseq;
    for (int i = 0; i < n; i++)
    {
        subseq = "";

        for (int j = 0; j < n; j++)
        {
            if (i == j)
                continue;
            subseq.append(1, str[j]);
        }

        // printing current subsequence
        for (int z = 0; z < n - 1; z++)
        {
            cout << subseq[z];
        }
        cout << endl;

        print_subsequences(const_cast<char *>(subseq.c_str()));
    }
}

int main()
{
    string str = "abcde";
    // string str = "abcdef";
    // string str = "abcdefg";
    // string str = "abcdefgh";
    // string str = "abcdefghi";

    print_subsequences(const_cast<char *>(str.c_str()));
}