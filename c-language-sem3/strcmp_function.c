#include <stdio.h>

int strcmp(const char* str1, const char* str2){
    while (*str1){
        if (*str1 != *str2) break;
        str1++, str2++;
    }
    int i = *str1 - *str2;
    return i;
}

int main() {
    
    char str1[6] = "abcd";
    char str2[6] = "Abed";
    printf("%d\n", strcmp(str1, str2));
    return 0;
}