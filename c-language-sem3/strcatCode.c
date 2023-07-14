#include <stdio.h>

void strcatCode(char* str1, char* str2){
    while (*str1) *str1++;
    while (*str2){
        *str1++ = *str2++;
        // right side of equation gets calculated first so left is still at previous position and goes to next after updation
    }
    *str1 = '\0';
    // single and double quotes have difference in how the compiler prints the last value (double quotes result in a blank dot at the end)
}

int main() {
    char str1[] = "Hello";
    char str2[] = " World";
    printf("%s\n", str1);
    strcatCode(str1, str2);
    printf("%s\n", str1);
    return 0;
}