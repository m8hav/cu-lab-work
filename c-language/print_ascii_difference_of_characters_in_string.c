#include <stdio.h>

int strcmp(const char* str1, const char* str2){
    int out = 0, dif;
    while (*str1 && *str2){
        dif = *str1 - *str2;
        if (dif != 0){
            out = out * 10 + *str1 - *str2;
        }
        str1++, str2++;
    }
    return out;
}

int main() {
    
    char str1[6] = "abcd";
    char str2[6] = "Abed";
    printf("%d\n", strcmp(str1, str2));
    return 0;
}