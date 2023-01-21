#include <iostream>
#include <cstring>
#include <string>
using namespace std;

int find_first_unique_char(char str[]){
    int hash[26] = {0};
    int s = strlen(str);

    for (int i = 0; i < s; i++){
        int sascii = str[i];
        if (str[i] != ' '){
            hash[sascii - 97]++;
        }
    }
    for (int j = 0; j < s; j++){
        int sascii = str[j];
        if (hash[sascii - 97] == 1){
            return j;
        }
    }
    return 0;
}

int main(){
    
    char str[] = "codequotientchamp";

    cout<<str[find_first_unique_char(str)];

    return 0;
}