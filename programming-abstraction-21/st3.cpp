#include <bits/stdc++.h>
using namespace std;

int countWord(char *arr)
{
    int c = 0;
    int i = 0;
    while (arr[i] != '\0')
    {
        if (i == 0 || (arr[i] == ' ' && arr[i + 1] != ' '))
            c++;
        i++;
    }
    return c;
}

int main()
{
    // char str[100] = "the quick brown fox jumps over a lazy dog\0";
    char str[40];
    for (int i = 0; i < 40; i++)
    {
        cin >> str[i];
    }

    int num = countWord(str);
    cout << num;
    return 0;
}